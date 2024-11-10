package Dominio;
import java.util.ArrayList;
import java.util.List;

public class Libreta {
    private List<Contacto> listaContacto;

    public Libreta(){
        this.listaContacto = new ArrayList<>();
    }

    public void añadirContacto(Contacto contacto){
        listaContacto.add(contacto);
        System.out.println(".");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libreta de contactos:\n");

        for (Contacto contacto : listaContacto) {
            sb.append(contacto.toString()).append("\n");
        }

        return sb.toString();
    }
}
