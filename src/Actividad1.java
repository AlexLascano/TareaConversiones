import java.util.Scanner;

public class Actividad1 {

    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número entero: ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);

            int resultado = 100 / numero;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("No se puede dividir por cero");

        } catch (NumberFormatException e) {

            System.out.println("Debe ingresar un número válido");

        } finally {

            System.out.println("Programa finalizado correctamente");
        }
    }
}