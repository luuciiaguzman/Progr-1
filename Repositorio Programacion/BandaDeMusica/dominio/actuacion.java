package dominio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class actuacion {
    private LocalDate fecha;
    private List<participantes> participantes;

    public actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public void annadirparticipante(participantes participantes) {
        this.participantes.add(participantes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de actuación: ").append(fecha).append("\n");
        for (participantes participantes : participantes) {
            sb.append(participantes).append("\n");
        }
        return sb.toString();
    }
}
