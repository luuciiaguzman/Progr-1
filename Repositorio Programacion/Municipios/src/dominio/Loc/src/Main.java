import dominio.Localidad;
import dominio.Municipio;
import dominio.Provincia;

public class Main {
    public static void main(String[] args) {

        Localidad localidad = new Localidad("Madrid", 10000);
        System.out.println(localidad);

        Municipio municipio = new Municipio("Madrid");
        municipio.agregarLocalidad(localidad);
        System.out.println("Número total de habitantes del municipio: " + municipio.contarHabitantes());

        Provincia provincia = new Provincia("Madrid");
        provincia.agregarMunicipio(municipio);
        System.out.println("Número total de habitantes de la provincia: " + provincia.contarHabitantes());
    }



    ;
}

