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
    public int population=1000;
    
    public void talk() {
        if (population<=9999) {
            System.out.println(name +" - один из немногочисленных городов в нашей стране.");
        }
        if (population>=1000000&&population<999999999) {
            System.out.println(name +" - один из более развитых городов в нашей стране.");
        }
        if (population>=1000000000) {
            System.out.println(name +" - один из многочисленных городов в нашей стране.");
        }
    }
    
    
}

    

