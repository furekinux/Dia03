/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracción;

/**
 *
 * @author camper
 */

abstract class Animal { 
    private String name; 
  
    public Animal(String name) { this.name = name; } 
  
    public abstract void makeSound(); 
  
    public String getName() { return name; } 

} 
