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
public class Country {
    
    public String name;
    public int population;
    public Human president;
    public City capital;
    
    public Country(String name) {
        this.name=name;
        population=0;
    }

    public Country(String name, int population, Human president, City capital) {
        this.name = name;
        this.population = population;
        this.president = president;
        this.capital = capital;
    }
    
    
    
    
}

