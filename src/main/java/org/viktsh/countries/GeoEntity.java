package org.viktsh.countries;

public abstract class GeoEntity {
    private String name;
    private Integer population;

    public GeoEntity(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "GeoEntity{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    public void print() {
        System.out.println("Название: " + getName());
        System.out.println("Население: "+getPopulation());
    }

    public static void printAll(GeoEntity[] countries) {
        for (GeoEntity geo : countries) {
            geo.print();
            System.out.println("----------");
        }
    }
}
