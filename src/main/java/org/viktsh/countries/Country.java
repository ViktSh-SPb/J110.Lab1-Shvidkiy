package org.viktsh.countries;

import org.viktsh.exceptions.PopulationNullException;

public class Country extends GeoEntity{
    private Integer area;
    private City capital;

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        if(area==null){
            throw new IllegalArgumentException("Площадь не должна быть null");
        } else if (area<=0){
            throw new IllegalArgumentException("Площадь должна быть строго больше нуля");
        }
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
    public void setCapital(){this.capital = null;}

    public Double getDensity(){
        if(getPopulation()==null){
            throw new PopulationNullException("Население неизвестно");
        }
        return (double)getPopulation()/getArea();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Площадь: " +getArea() + "км\u00B2");
        try{
            System.out.printf("Плотность населения: %.4f чел./км\u00B2\n", getDensity());
        } catch (PopulationNullException e){
            System.out.println("Плотность населения неизвестна:"+ e.getMessage());
        }
        System.out.println("\tСтолица:");
        if (getCapital()!=null){
            getCapital().print();
        }else {
            System.out.println("Столица неизвестна");
        }

    }

}


