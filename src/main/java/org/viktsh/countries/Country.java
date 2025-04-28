package org.viktsh.countries;

public class Country extends GeoEntity{
    private Integer area;
    private City capital;

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Country(String name, Integer area, Integer population, City capital) {
        super(name, population);
        this.capital = capital;
        this.area = area;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Double getDensity(){
        return (double)getPopulation()/getArea();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Площадь: " +getArea() + "км\u00B2");
        System.out.println("Название столицы: " + getCapital().getName());
        System.out.println("Население столицы: " + getCapital().getPopulation());
        System.out.println("Плотность населения: " + getDensity()+ "чел./км\u00B2");
    }

}


