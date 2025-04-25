package org.viktsh;

import org.viktsh.countries.Country;

/**
 * Viktor Shvidkiy. Lab1
 */
public class MainClass
{
    public static void main( String[] args ){
        Country[] countries = new Country[5];

        countries[0] = new Country("Russia", 17100000,146700000,"Moscow",12600000);
        countries[1] = new Country("Finland", 338000, 5500000, "Helsinki", 655000);
        countries[2] = new Country("France", 643800, 67800000, "Paris", 2100000);
        countries[3] = new Country("Andorra", 467000, 85400, "Andorra La Vella", 22600);
        countries[4] = new Country("Singapore", 725, 5700000);

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

        Book.printAll(books);
        bhv.setPublisherCity("Санкт-Петербург");
        Book.printAll(books);
    }

}
