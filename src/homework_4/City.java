/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_4;

/**
 *
 * @author pgarmas
 */
public class City {
    public String name;
    public int population;
    public Human major;

    public City(String name) {
        this.name=name;
        this.population=0;
    }

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public City(String name, int population, Human major) {
        this.name = name;
        this.population = population;
        this.major = major;
    }
    
    
    
    
    
    
       
    
}

    

