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
public class Human {
    public String name;
    public int age;
    
    public void talk() {
        if (age<=30) {
            System.out.println("У нас студентческий город.");
        }
        if (age>=31&&age<60) {
            System.out.println("В нашем городе живут люди с высшим образованием.");
        }
        if (age>=61) {
            System.out.println("Наш город для пенсионеров.");
        }
    }
    
    
}

    

