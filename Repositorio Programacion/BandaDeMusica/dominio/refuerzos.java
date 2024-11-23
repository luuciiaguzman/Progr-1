package dominio;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class refuerzos extends participantes {
    private String instrumento;
    private BigDecimal pago;

    public refuerzos(String nombre, String instrumento, BigDecimal pago) {
        super(nombre);
        this.instrumento = instrumento;
        this.pago = pago;
    }

    public String toString() {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        format.setMinimumFractionDigits(2);
        return getNombre() + ", " + instrumento + ", " + format.format(pago);
    }
}
