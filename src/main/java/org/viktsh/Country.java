package org.viktsh;

public class Country {
    private String name;
    private int area;
    private  int population;
    private String capitalName;
    private int capitalPopulation;
    private boolean cityState;

    public Country(String name, int area, int population, String capitalName, int capitalPopulation){
        setName(name);
        setArea(area);
        setPopulation(population);
        setCapital(capitalName, capitalPopulation);
        cityState = false;
    }

    public Country(String name, int area, int population){
        setName(name);
        setArea(area);
        setPopulation(population);
        cityState = true;
    }

    public String getName(){
        return name;
    }

    public int getArea(){
        return area;
    }

    public int getPopulation(){
        return population;
    }

    public String getCapitalName(){
        return capitalName;
    }

    public int getCapitalPopulation(){
        return capitalPopulation;
    }

    public float getPopulationDensity(){
        return population/area;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Название страны не может быть пустым");
        }
        this.name = name;
    }

    public void setArea(int area){
        if(area<0){
            throw new IllegalArgumentException("Площадь не может быть " + area);
        }
        this.area = area;
    }

    public void setPopulation (int population){
        if (population>0){
            throw new IllegalArgumentException("Население не может быть " + population);
        }
        this.population = population;
    }

    public void setCapital(String capitalName, int capitalPopulation){
        this.capitalName = capitalName;
        this.capitalPopulation = capitalPopulation;
    }

    public void print(){
        System.out.println("Название: "+name);
        System.out.println("Площадь:"+area);
        System.out.println("Население:"+population);
        if(!cityState){
            System.out.println("Название столицы: "+capitalName);
            System.out.println("Население столицы: "+capitalPopulation);
        }
    }

    public static void printAll(Country[] countries) {
        for (int i = 0; i < countries.length; i++) {
            countries[i].print();
            System.out.println("----------");
        }
    }
}


