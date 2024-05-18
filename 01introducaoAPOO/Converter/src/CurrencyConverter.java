import javax.swing.plaf.ColorUIResource;

public class CurrencyConverter {

    private static final double IOF = 6.00;

    public static double paid(double dolar, double buy) {
        return (dolar * buy) * (1 + IOF / 100);

    }

}
