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
    
    public Human (String name){
        this.name=name;
        this.age=0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
   public void Birthday()
   {
       age++;
       System.out.println("Сегодня я стал на год старше. Мне теперь "+ age);
   }
    
}

    

