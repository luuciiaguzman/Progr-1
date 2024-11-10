package Interfaz;
import java.util.ArrayList;
import java.util.List;
import Dominio.*;
public class Interfaz {

    private static List<String> contactos = new ArrayList<>();

    public Interfaz(Libreta libreta){

    }
    public static void Interfaz(String[] args) {
        if (args.length == 0) {
            mostrarAyuda();
        } else {
            String instruccion = args[0];
            switch (instruccion) {
                case "add":
                    if (args.length == 3) {
                        String nombre = args[1];
                        String telefono = args[2];
                        añadirContacto(nombre, telefono);
                    } else {
                        System.out.println("Error: Método add incorrecto.");
                        mostrarAyuda();
                    }
                    break;
                case "list":
                    listarContactos();
                    break;
                case "help":
                    mostrarAyuda();
                    break;
                default:
                    System.out.println("Comando desconocido.");
                    mostrarAyuda();
            }
        }
    }

    private static void añadirContacto(String nombre, String telefono) {
        contactos.add("Nombre: " + nombre + ", Teléfono: " + telefono);
        System.out.println("Contacto añadido: " + nombre + " - " + telefono);
    }

    private static void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La libreta está vacía; por favor añada contactos.");
        } else {
            System.out.println("Lista de contactos:");
            for (String contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }

    public void mostrarInterfaz(){

    }

    private static void mostrarAyuda() {
        System.out.println("Posibles operaciones:");
        System.out.println("- Añadir contacto: 'java -jar libreta.jar add <nombre> <teléfono>'");
        System.out.println("  Ejemplo: java -jar libreta.jar add Pepe 654321234");
        System.out.println("- Mostrar contactos: 'java -jar libreta.jar list'");
        System.out.println("- Mostrar esta ayuda: 'java -jar libreta.jar help'");
    }
}
