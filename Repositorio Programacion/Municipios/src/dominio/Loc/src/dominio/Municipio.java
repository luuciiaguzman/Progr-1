package dominio;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private String nombre;
    private List<Localidad> localidades;

    public Municipio(String nombre) {
        this.nombre = nombre;
        this.localidades = new ArrayList<>();
    }

    public void agregarLocalidad(Localidad localidad) {
        localidades.add(localidad);
    }

    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Localidad localidad : localidades) {
            totalHabitantes += localidad.getNumeroDeHabitantes();
        }
        return totalHabitantes;
    }

    public String toString() {

        return "Municipio: " + nombre + ", Población: " + contarHabitantes();
    }
}
