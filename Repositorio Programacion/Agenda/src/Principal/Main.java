package Principal;
import Interfaz.Interfaz;
import Dominio.Libreta;

public class Main {
    public static void main(String[] args) {
        Libreta libreta = new Libreta();
        Interfaz interfaz = new Interfaz(libreta);
        interfaz.mostrarInterfaz();
    }
}
