package org.viktsh.countries;

public class CityState extends GeoEntity{
    private Integer area;
    public CityState(String name, Integer area, Integer population) {
        super(name, population);
        this.area = area;
    }

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

    @Override
    public void print() {
        super.print();
        System.out.println("Площадь: " +getArea() + "км\u00B2");
    }
}
