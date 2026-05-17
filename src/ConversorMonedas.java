public class ConversorMonedas {

    public double convertir(
            String origen,
            String destino,
            double cantidad)

            throws MonedaNoSoportadaException {

        origen = origen.toUpperCase();
        destino = destino.toUpperCase();

        if ((!origen.equals("USD")
                && !origen.equals("EUR"))

                ||

                (!destino.equals("USD")
                        && !destino.equals("EUR"))) {

            throw new
                    MonedaNoSoportadaException(
                    origen + " / " + destino);
        }

        if (origen.equals("USD")
                && destino.equals("EUR")) {

            return cantidad * 0.92;
        }

        if (origen.equals("EUR")
                && destino.equals("USD")) {

            return cantidad * 1.09;
        }

        return cantidad;
    }
}
