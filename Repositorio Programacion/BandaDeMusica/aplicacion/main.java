package aplicacion;
import java.math.BigDecimal;
import java.time.LocalDate;
import dominio.*;
public class main{
    public static void main(String[] args) {

        banda bd = new banda("Banda de Música de Villar del Monte");
        actuacion act1 = new actuacion(LocalDate.of(2024, 11, 24));
        bd.annadiractuacion(act1);
        Director dir = new Director("José García López");
        act1.annadirparticipante(dir);
        socios msc1 = new socios("Antonio López Suárez", "Clarinete", 256);
        act1.annadirparticipante(msc1);
        refuerzos msr1 = new refuerzos("Juan Jaén Bernal", "Tuba", new BigDecimal("120.00"));
        act1.annadirparticipante(msr1);
        actuacion act2 = new actuacion(LocalDate.of(2025, 2, 23));
        bd.annadiractuacion(act2);
        refuerzos msr2 = new refuerzos("María López Gil", "Oboe", new BigDecimal("140.00"));
        act2.annadirparticipante(dir);
        act2.annadirparticipante(msc1);
        act2.annadirparticipante(msr2);
        System.out.println(bd);
    }
}