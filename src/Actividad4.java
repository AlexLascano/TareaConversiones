import java.util.Scanner;

public class Actividad4 {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        ConversorMonedas c =
                new ConversorMonedas();

        try {

            System.out.print(
                    "Moneda origen (USD/EUR): ");

            String origen =
                    sc.nextLine();

            System.out.print(
                    "Moneda destino (USD/EUR): ");

            String destino =
                    sc.nextLine();

            System.out.print(
                    "Cantidad: ");

            String textoCantidad =
                    sc.nextLine();

            double cantidad =
                    Double.parseDouble(
                            textoCantidad);

            double resultado =
                    c.convertir(
                            origen,
                            destino,
                            cantidad);

            System.out.println(
                    "Resultado: "
                            + String.format(
                            "%.2f",
                            resultado));

        } catch (
                NumberFormatException e) {

            System.out.println(
                    "Cantidad inválida");

        } catch (
                MonedaNoSoportadaException e) {

            System.out.println(
                    e.getMessage());
        }
    }
}
