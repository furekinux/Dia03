package sdn;

/**
 * Clase Protegida que encapsula un dato con acceso protegido.
 * 
 * @autor Usuario
 */
public class Protegida {
    protected String dato;

    public Protegida(String dato) {
        this.dato = dato;
    }

    protected String getDato() {
        return dato;
    }

    protected void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "El dato es = " + dato;
    }

    public static void main(String[] args) {
        Protegida perso = new Protegida("Vive en LA");
        System.out.println(perso);

        // Cambiamos el valor del dato
        perso.setDato("Vive en Nueva York");
        System.out.println(perso);
    }
}
