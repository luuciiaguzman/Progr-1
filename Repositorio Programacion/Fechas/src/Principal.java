import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
        //Ejercicio 1
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha local actual: " + formatoFecha.format(fechaActual));
        //Ejercicio 2
        formatoFecha.setTimeZone(TimeZone.getTimeZone("America/Caracas"));
        System.out.println("Fecha en Caracas actual: " + formatoFecha.format(fechaActual));
        //Ejercicio 3
        int añoDescubrimiento = 1492;
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        int añosTranscurridos = añoActual - añoDescubrimiento;
        System.out.println("Años desde el descubrimiento de América: " + añosTranscurridos);
        //Ejercicio 4
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora actual local: " + formatoHora.format(fechaActual));
        //Ejercicio 5
        formatoHora.setTimeZone(TimeZone.getTimeZone("America/Caracas"));
        System.out.println("Hora en Caracas actual: " + formatoHora.format(fechaActual));
        //Ejercicio 6
        TimeZone zonaMadrid = TimeZone.getTimeZone("Europe/Madrid");
        TimeZone zonaCaracas = TimeZone.getTimeZone("America/Caracas");
        int diferenciaHoras = (zonaMadrid.getRawOffset() - zonaCaracas.getRawOffset())/3600000;
        System.out.println("La diferencia horaria entre Madrid y Caracas es de " + diferenciaHoras + " horas.");
        //Ejercicio 7
        LocalDateTime fechaHoraLuna = LocalDateTime.of(1969, 7, 21, 3, 56);
        System.out.println("Fecha y hora cuando Neil Armstrong pisó la luna (hora de Madrid): " + fechaHoraLuna);

    }
}

