package presentacion;
import java.util.ArrayList;
import dominio.Habitante;
import dominio.OficinaPadron;

public class InterfazUsuario {
    public static void ejecutar(String[] instruccion) {
        OficinaPadron padron = new OficinaPadron();

        if (instruccion.length == 0) {
            System.out.println("No instruction provided.");
            return;  // Salir temprano si no se proporciona ninguna instrucción
        }

        if (instruccion[0].equalsIgnoreCase("mostrar") && instruccion.length == 1) {
            mostrarOficinaPadron(padron);
        } else if (instruccion[0].equalsIgnoreCase("añadir") && instruccion.length == 4) {
            padron.annadir(new Habitante(instruccion[1], instruccion[2], instruccion[3]));
            System.out.println("Habitante añadido correctamente");
        } else {
            System.out.println("Error en la instruccion");
        }
    }

    private static void mostrarOficinaPadron(OficinaPadron padron) {
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for (Habitante habitante : habitantes) {
            System.out.println(habitante.getNombreCompleto());
        }
        System.out.println("El numero total de habitantes es " + padron.calcularNumeroHabitantes());
    }
}
