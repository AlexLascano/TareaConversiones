public class EdadInvalidaException extends Exception {

    private int edadIngresada;

    public EdadInvalidaException(int edadIngresada) {

        super("Edad inválida: " + edadIngresada);

        this.edadIngresada = edadIngresada;
    }

    public int getEdadIngresada() {
        return edadIngresada;
    }
}