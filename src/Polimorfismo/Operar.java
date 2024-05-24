/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author camper
 */
public class Operar {
    //polimorfismo es la capacidad que tienen los objetos de una clase en ofrecer
    //respuesta distinta e independiente en función de los parámetros
    double a;
    double b;
    double area;
    String figura;
    
    public Operar( ){
        a = 0;
        b = 0;
        area = 0;
        figura = "Desconocido";
    }
    
    public Operar(double a,double b){
        this.a = a;
        this.b = b;
        this.area = a*b;
        this.figura = "Rectángulo";
    }
    
    public Operar(double a){
        this.a = a;
        this.b = 0;
        this.area = a*a;
        this.figura = "Cuadrado";

    }

    
    
    @Override
    public String toString() {
        return "Operar{" + "Lado=" + a + ", Lado=" + b + ", Area=" + area +", Figura=" + figura +'}';
    }

    
}
