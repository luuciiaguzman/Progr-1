package dominio;

public class socios extends participantes {
    private String instrumento;
    private int numeroSocio;

    public socios(String nombre, String instrumento, int numeroSocio) {
        super(nombre);
        this.instrumento = instrumento;
        this.numeroSocio = numeroSocio;
    }

    public String toString() {
        return getNombre() + ", " + instrumento + ", número de socio: " + numeroSocio;
    }
}
