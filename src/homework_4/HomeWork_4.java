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
        Country latvija;
        latvija = new Country ();
        latvija.name="Latvia";
        latvija.population=1000000;
        
        City riga = new City ("Riga",400000000);
        
        Human vasja;
        vasja= new Human("Vasja", 45);
        
        
        
        
        //Васю в президенты латвии
        latvija.president=vasja;
        
        //Ригу в столшицы латвии
        latvija.capital=riga;
        
        Human petr;
        petr= new Human("Petja", 46);
        
        riga.major=petr;
        
        System.out.println(latvija.president.name);
        
        System.out.println(riga.major.age);
        
        riga.population+=500;
        
        latvija.population+=700;
        
        latvija.president=petr;
        
        petr.age++;
        
        vasja.name="Vasilio";
        
        riga.population-=100;
        
        System.out.println(riga.major.name);
        
        Country estonia;
        estonia= new Country();
        estonia.population=2000000;
        City tallinn = new City("Tallinn", 400000);
        estonia.capital=tallinn;
        
        System.out.println(estonia.capital.name);
                
        

        
        
        
        
        
        

    }
    
}
