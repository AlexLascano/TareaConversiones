public class MonedaNoSoportadaException
        extends Exception {

    public MonedaNoSoportadaException(
            String moneda) {

        super("Moneda no soportada: "
                + moneda);
    }
}