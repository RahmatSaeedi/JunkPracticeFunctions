/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nova
 */
public class Person {
    public String name;
    public int age;
    
    public void sayHi() {
        System.out.println("Hi, my name is " 
                + this.name + ", and I am " 
                + this.age + " years old");
    }
}
