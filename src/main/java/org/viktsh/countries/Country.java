package org.viktsh.countries;

public class Country extends GeoEntity{
    private City capital;

    public Country(String name, Integer area, Integer population, City capital) {
        super(name, area, population);
        this.capital = capital;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Название столицы: " + getCapital().getName());
        System.out.println("Население столицы: " + getCapital().getPopulation());
    }

    public static void printAll(Country[] countries) {
        for (Country country : countries) {
            country.print();
            System.out.println("----------");
        }
    }
}


