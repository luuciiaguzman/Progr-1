package comprobaciones;
import dominio.Habitante;
import dominio.OficinaPadron;
import java.util.ArrayList;
public class Test {
    public static void realizarComprobacion (String[] args) {
        OficinaPadron padron = new OficinaPadron();
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();

        for(Habitante habitante : habitantes) {
            System.out.println(habitante.getNombreCompleto());
        }
        System.out.println("El numero total de habitantes es " + padron.
                calcularNumeroHabitantes());
    }

    public static void main(String[] args) {
        realizarComprobacion(args);
    }
}

