package org.viktsh;

public class Book {
    private String name;
    private Publisher publisher;
    private int year;
    private String[] authors;

    public Book(String name, int year, Publisher publisher){
        setName(name);
        setYear(year);
        setPublisher(publisher);
    }

    public Book(String name, String author, int year, Publisher publisher){
        setName(name);
        setAuthors(new String[]{author});
        setYear(year);
        setPublisher(publisher);
    }

    public Book(String name, String[] authors, int year, Publisher publisher){
        setName(name);
        setAuthors(authors);
        setYear(year);
        setPublisher(publisher);
    }

    public String getName(){
        return name;
    }
    public Publisher getPublisher(){
        return publisher;
    }
    public int getYear(){
        return year;
    }
    public String[] getAuthors(){
        return authors;
    }
    public int getNumberOfAuthors(){
        return authors.length;
    }
    public String getIndexedAuthor(int index){
        try{
            return authors[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Вы запросили " + (index+1) + "-го автора. У книги " + name + " " + authors.length + " автор(ов)");
        }
    }
    public void setName(String name){
        if (name!=null){
            this.name = name;
        }else {
            throw new NullPointerException("Название книги не может быть "+ name);
        }

    }
    public void setPublisher(Publisher publisher){
        if (publisher!=null) {
            this.publisher = publisher;
        }else {
            throw new NullPointerException("Название издательства не может быть " + publisher);
        }
    }

    public void setYear(int year) {
        if(year>0){
            this.year = year;
        }else {
            throw new IllegalArgumentException("Год издания не может быть "+ year);
        }
    }

    public void setAuthors(String[] authors){
        int nullPointer = 0;
        for(int i = 0; i<authors.length; i++){
            if (authors[i] == null){nullPointer++;};
        }
        if (nullPointer == 0){
            this.authors = authors;
        }else {
            throw new NullPointerException("Cписок авторов не должен содержать пустых ссылок");
        }
    }

    public void print(){
        System.out.println("Название: " + name);
        if(authors!=null){
            System.out.print("Автор(ы): ");
            for(int i = 0; i<authors.length; i++) {
                System.out.print(authors[i]);
                if (i < authors.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println("Издательство: " + publisher.getPublisherName() + ", " + publisher.getPublisherCity());
        System.out.println("Год издания: " + year);
    }
    public static void printAll(Book[] books){
        for (int i = 0; i < books.length; i++) {
            books[i].print();
            System.out.println("----------");
        }
    }
}
