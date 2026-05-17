public class Actividad3 {

    public static void ejecutar() {

        System.out.println("PARTE A");
        System.out.println("Conversión implícita");

        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);


        System.out.println("\nPARTE B");
        System.out.println("Casting explícito");

        double numero = 45.89;

        float f2 = (float) numero;
        int i2 = (int) numero;
        short s2 = (short) numero;
        byte b2 = (byte) numero;

        System.out.println("float: " + f2);
        System.out.println("int: " + i2);
        System.out.println("short: " + s2);
        System.out.println("byte: " + b2);


        System.out.println("\nPARTE C");
        System.out.println("Conversión String");

        String texto1 = "2024";
        String texto2 = "98.6";
        String texto3 = "false";

        int entero =
                Integer.parseInt(texto1);

        double decimal =
                Double.parseDouble(texto2);

        boolean estado =
                Boolean.parseBoolean(texto3);

        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(estado);

        String nuevo1 =
                String.valueOf(entero);

        String nuevo2 =
                Double.toString(decimal);

        String nuevo3 =
                Boolean.toString(estado);

        System.out.println(nuevo1);
        System.out.println(nuevo2);
        System.out.println(nuevo3);


        System.out.println("\nPARTE D");
        System.out.println("Casting de objetos");

        Animal animal = new Perro();

        if (animal instanceof Perro) {

            Perro perro = (Perro) animal;

            perro.ladrar();
        }
    }
}
