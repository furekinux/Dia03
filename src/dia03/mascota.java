/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia03;

/**
 *
 * @author Usuario
 */
public class mascota {
        protected String especie;

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
    @Override
    public String toString() {
        return "Mascota [especie=" + especie +  "]";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        perro dog = new perro();
        dog.setEspecie("Perro");
        System.out.println(dog);

        gato cat = new gato();
        cat.setEspecie("Gato");
        System.out.println(cat);
    }
}
class perro extends mascota{
    @Override
    public String toString() {
        return "Perro [especie=" + especie + "]";
    }
}
class gato extends mascota{
    @Override
    public String toString() {
        return "Gato [especie=" + especie + "]";
    }
}