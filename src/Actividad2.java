public class Actividad2 {

    public static void ejecutar() {

        try {

            Estudiante e1 =
                    new Estudiante("Alex", 18, 9.5);

            Estudiante e2 =
                    new Estudiante("Juan", 20, 8.8);

            Estudiante e3 =
                    new Estudiante("Pedro", -4, 7.5);

            System.out.println(e1);
            System.out.println(e2);
            System.out.println(e3);

        } catch (EdadInvalidaException e) {

            System.out.println(e.getMessage());
        }
    }
}
