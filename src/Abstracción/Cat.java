/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracción;

/**
 *
 * @author camper
 */
public class Cat extends Animal { 
    public Cat(String name) { super(name); } 

    @Override
    public void makeSound(){ 
        System.out.println(getName() + " meows"); 
    } 

    @Override
    public String getName() {
        return super.getName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
} 