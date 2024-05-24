/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composición;

/**
 *
 * @author camper
 */
public class Empresa {
    private String cif;
    private Direccion dirección;

    
    //BUSCAR ÚNICAMENTE EL OBJETO DE LA DIRECCIÓN DE LA EMPRESA
    public Direccion getDirección() {
      return dirección;
    }
    //ESTRUCTURA PARA MODIFICAR LA DIRECCIÓN DE LA EMPRESA
    public void setDirección(Direccion dirección) {
      this.dirección = dirección;
    }
    
    
    //BUSCAR ÚNICAMENTE EL DATO DE CIF DE LA EMPRESA
    public String getCif() {
      return cif;
    }
    //ESTRUCTURA PARA MODIFICAR CIF DE LA EMPRESA
    public void setCif(String cif) {
      this.cif = cif;
    }

    
    @Override
    public String toString() {
        return "Empresa{" + "cif=" + cif + ", direcci\u00f3n=" + dirección + '}';
    }
    
    
}
