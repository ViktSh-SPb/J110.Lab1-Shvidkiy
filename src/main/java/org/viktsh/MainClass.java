package org.viktsh;

import org.viktsh.books.Book;
import org.viktsh.books.Publisher;
import org.viktsh.countries.City;
import org.viktsh.countries.CityState;
import org.viktsh.countries.Country;
import org.viktsh.countries.GeoEntity;

/**
 * Viktor Shvidkiy. Lab1
 */
public class MainClass
{
    public static void main( String[] args ){
        GeoEntity[] countries = new GeoEntity[5];

        countries[0] = new Country("Russia", 17100000,146700000, new City("Moscow",12600000));
        countries[1] = new Country("Finland", 338000, 5500000, new City("Helsinki", 655000));
        countries[2] = new Country("France", 643800, 67800000, new City("Paris", 2100000));
        countries[3] = new Country("Andorra", 467000, 85400, new City("Andorra La Vella", 22600));
        countries[4] = new CityState("Singapore", 725, 5700000);

        System.out.println("\u001B[33m"+" ⁕  Страны  ⁕ "+"\u001B[0m");
        System.out.println("----------");
        Country.printAll(countries);

        Publisher prospect = new Publisher("Проспект", "Москва");
        Publisher piter = new Publisher("Питер", "Санкт-Петербург");
        Publisher bhv = new Publisher("БХВ", "Санкт-Петебург");
        Publisher dialektika = new Publisher("Диалектика", "Киев");

        Book[] books = new Book[5];
        books[0] = new Book("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[]{"Седжвик Роберт", "Уэйн Кевин"}, 2018, piter);
        books[1] = new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное", "Вигерс Карл", 2019, bhv);
        books[2] = new Book("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, dialektika);
        books[3] = new Book("C/C++. Процедурное программирование", "Полубенцева М. И.", 2017, bhv);
        books[4] = new Book("Конституция РФ", 2020, prospect);

        System.out.println("\u001B[34m"+" ⁕  Книги  ⁕ "+"\u001B[0m");
        System.out.println("----------");
        Book.printAll(books);
        bhv.setCity("Санкт-Петербург");
        System.out.println("~~~ Исправил ошибку в \"БХВ\" ~~~");
        Book.printAll(books); // Вывод изменился для всех книг, т.к. они ссылаются на один объект Publisher - bhv
    }

}
