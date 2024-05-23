/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author camper
 */
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    
    public Persona( ){
        nombre = null;
        edad = 0;
        apellido = null;
    }
    
    public Persona(String n,String a,int e){
        this.nombre = n;
        this.apellido = a;
        this.edad = e;
    }
    
    public Persona(Persona usr){
        nombre = usr.getNombre();
        edad = usr.getEdad();
        apellido = usr.getApellido();
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String a){
        apellido = a;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setEdad(int e){
        edad = e;
    }
    
    public void setEdad(float e){
        edad = (int)e;
    }
    
    public int getEdad(){
        return edad;
    }
    
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
}
