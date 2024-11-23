package dominio;

public class Director extends participantes {
    public Director(String nombre) {
        super(nombre);
    }

    public String toString() {
        return getNombre() + ", director";
    }
}
