package org.viktsh.countries;

public abstract class GeoEntity {
    private String name;
    private Integer area;
    private Integer population;

    public GeoEntity(String name, Integer area, Integer population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
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
                ", area=" + area +
                ", population=" + population +
                '}';
    }

    public void print() {
        System.out.println("Название: " + getName());
        System.out.println("Площадь: " +getArea());
        System.out.println("Население: "+getPopulation());
    }
}
