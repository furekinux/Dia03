/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composición;

/**
 *
 * @author camper
 */
public class Direccion {
    private String calle;
    private int numero;
    
    
    //BUSCAR ÚNICAMENTE EL NOMBRE DE LA CALLE DE LA DIRECCIÓN
    public String getCalle() {
      return calle;
    }
    //ESTRUCTURA PARA MODIFICAR LA CALLE LA DIRECCIÓN
    public void setCalle(String calle) {
      this.calle = calle;
    }
    
    
    //BUSCAR ÚNICAMENTE EL VALOR DEL NÚMERO DE LA DIRECCIÓN
    public int getNumero() {
      return numero;
    }
    //ESTRUCTURA PARA MODIFICAR EL NUMERO DE LA DIRECCIÓN
    public void setNumero(int numero) {
      this.numero = numero;
    }
    
    
    //ESTRUCTURA PARA CREAR NUEVA DIRECCIÓN COMPLETA
    public Direccion(String calle, int numero) {
      super();
      this.calle = calle;
      this.numero = numero;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + '}';
    }
    
    
}
