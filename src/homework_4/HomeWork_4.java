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
public class HomeWork_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Country country1;
        country1 = new Country ();
        country1.name="Latvia";
        country1.quantity=1000000;
        country1.talk();
        
        City city1;
        city1 = new City ();
        city1.name="Riga";
        city1.population=400000000;
        city1.talk();
        
        Human human1;
        human1= new Human();
        human1.name="Vasja";
        human1.age= 45;
        human1.talk();
    }
    
}
