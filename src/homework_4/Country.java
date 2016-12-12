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
    public int quantity=1000;
    
    public void talk() {
        if (quantity<=9999) {
            System.out.println("Здравствуйте! Мы приветствуем Вас в нашей стране с тысячным населением - "+ name +"!");
        }
        if (quantity>=1000000&&quantity<999999999) {
            System.out.println("Здравствуйте! Мы приветствуем Вас в нашей стране с милионным населением - "+ name +"!");
        }
        if (quantity>=1000000000) {
            System.out.println("Здравствуйте! Мы приветствуем Вас в нашей стране с миллиардным населением - "+ name +"!");
        }
    }
    
    
}
