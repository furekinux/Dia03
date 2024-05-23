/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author camper
 */
public class Actividad_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Texto claro con la sintaxis en un print: "\033[0;1m" + "Hello world"
        String bold = "\033[0;1m";

        System.out.print("Dolor de cabeza 4 :D\n\n");
        
        System.out.print(bold+"Crear objeto usando el constructor\n");
        Persona random = new Persona("Fotosintesis","si",8);
        System.out.print(random+" :P\n\n");
        
        
        System.out.print(bold+"Si se usa un float como 47.6, se convierte a int\n");
        random.setEdad(47.6f);
        //NO DEJA PONER FLOAT SIN UNA "f" AL FINAL T-T
        System.out.print(random+" :3\n\n");
        //Funciones buscan cada llave :D
        System.out.print(bold+"Para ver cada value por medio de las funciones"+"\n");

        System.out.print("Nombre: "+random.getNombre()+"\n");
        System.out.print("Apellido: "+random.getApellido()+"\n");
        System.out.print("Edad: "+random.getEdad()+"\n\n");

        System.out.print(bold+"Para el texto claro revisar linea 18"+"\n");

    }
    
}
