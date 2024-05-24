/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Composición;

/**
 *
 * @author camper
 */
public class Adicional_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String bold = "\033[0;1m";
        
        Direccion d1= new Direccion("calle A",3);
        Persona p= new Persona("Elsa Pato",20);
        //Se asigna el objeto d1 como dirección de la persona
        p.setDirección(d1);
        
        Direccion d2= new Direccion("calle B",7);
        Empresa e= new Empresa();
        //Se asigna el objeto d2 como dirección de la persona
        e.setDirección(d2);
        //Se asigna cif por medio de set
        e.setCif("1A");

        
        //DIRECCIÓN Y CALLE ASIGNADA A LOS OBJETOS
        System.out.println("\n====----====== INFO DIRECCIÓN ======----====");

        System.out.println("\n"+bold+"Buscar dirección de la Persona");
        System.out.println(" Sintaxis p.getDirección().getCalle()\n");
        System.out.println(p.getDirección().getCalle());
        
        System.out.println("\n"+bold+"Buscar dirección de la Empresa");
        System.out.println(" Sintaxis p.getDirección().getCalle()\n");
        System.out.println(e.getDirección().getCalle());
        
        
        //INFO GENERAL RESULTADO
        System.out.println("\n\n====----========= INFO GEN =========----====");

        System.out.println("\n"+bold+"Información de la Persona");
        System.out.println(p);
        System.out.println("\n"+bold+"Dirección de la Persona");
        System.out.println(d1);

        
        System.out.println("\n\n"+bold+"Información de la Empresa");
        System.out.println(e);
        System.out.println("\n"+bold+"Dirección de la Empresa");
        System.out.println(d2);

    
    }
}
