package dominio;

import java.util.ArrayList;
import java.util.List;

public class banda {
    private String nombre;
    private List<actuacion> actuaciones;

    public banda(String nombre) {
        this.nombre = nombre;
        this.actuaciones = new ArrayList<>();
    }

    public void annadiractuacion(actuacion actuacion) {
        this.actuaciones.add(actuacion);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\n");
        for (actuacion actuacion : actuaciones) {
            sb.append(actuacion).append("\n");
        }
        return sb.toString();
    }
}
