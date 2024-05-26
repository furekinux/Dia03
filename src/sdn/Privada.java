package sdn;

/**
 * Clase Privada que encapsula la edad.
 * 
 * @autor Usuario
 */
public class Privada {
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "La edad es " + edad;
    }

    public static void main(String[] args) {
        Privada perso = new Privada();
        perso.setEdad(30);  // Establece la edad
        System.out.println(perso);  // Imprime la representación del objeto usando toString()
    }
}
