
import java.util.Scanner;

public class Proyecto23 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Este programa realiza ejercicio de vectores");

        while (true) {
            System.out.println("Que vector va a trabajar 2D O 3D : ");
            int dimension = lector.nextInt();

            System.out.println("Ingrese las coordenadas del primer vector: ");
            double[] vector1 = leerVector(dimension);

            System.out.println("Ingrese las coordenadas del segundo vector: ");
            double[] vector2 = leerVector(dimension);

            System.out.println("Seleccione la operación que desea realizar:");

            System.out.println("1. Suma de vectores");

            System.out.println("2. Resta de vectores");

            int opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    double[] suma = sumaVectores(vector1, vector2);
                    mostrarVector("Suma", suma);
                    break;

                case 2:
                    double[] resta = restaVectores(vector1, vector2);
                    mostrarVector("Resta", resta);
                    break;

                default:
                    System.out.println("Caso invaido.");
            }

            System.out.print("quiere realizar otra operación en el programa: ");

            String continuar = lector.next().toLowerCase();

            if (!continuar.equals("s")) {
                break;
            }
        }

        System.out.println("Fin del programa");

        lector.close();
    }

    public static double[] leerVector(int dimension) {
        Scanner lector = new Scanner(System.in);
        double[] vector = new double[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.print("Digite la coordenada " + (i + 1) + ": ");
            vector[i] = lector.nextDouble();
        }

        return vector;
    }

    public static double[] sumaVectores(double[] vector1, double[] vector2) {

        return vector1;
    }

    public static double[] restaVectores(double[] vector1, double[] vector2) {

        return vector1;
    }

    public static void mostrarVector(String nombre, double[] vector) {
        System.out.print(nombre + " : ");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);

            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");

    }
}
