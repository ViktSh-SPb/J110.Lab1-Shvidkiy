package org.viktsh.books;

public class Publisher {
    private String name;
    private String city;

    public Publisher (String name, String city){
        setName(name);
        setCity(city);
    }

    public String getName(){return name;}

    public String getCity(){return city;}

    public void setName(String name) {
        if(name!=null){
            this.name = name;
        }else {
            throw new NullPointerException("Название издательства не может быть "+ name);
        }
    }

    public void setCity(String city) {
        if(city!=null){
            this.city = city;
        }else {
            throw new NullPointerException("Город не может быть "+ city);
        }
    }
}
