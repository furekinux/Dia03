/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sdn;

/**
 *
 * @author Usuario
 */
public class Publica {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Publica{" + "nombre='" + nombre + '\'' + '}';
    }

    public static void main(String[] args) {
        Publica perso = new Publica();
        perso.setNombre("Pepa");
        System.out.println(perso);
    }
}
