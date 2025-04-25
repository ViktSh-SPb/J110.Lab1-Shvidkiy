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
        this.area = area;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Площадь: " +getArea() + "км\u00B2");
    }
}
