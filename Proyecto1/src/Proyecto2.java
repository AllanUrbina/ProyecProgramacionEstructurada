import java.util.Scanner;

public class Proyecto2 {
    public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);

        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;
        int intentos = 0;

        while (intentos < 3) {
            System.out.println("Ingrese la longitud de los tres lados del triángulo:");
            System.out.print("Lado 1: ");
            lado1 = lector.nextDouble();

            System.out.print("Lado 2: ");
            lado2 = lector.nextDouble();

            System.out.print("Lado 3: ");
            lado3 = lector.nextDouble();

            if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
                break; 
            } else {
                System.out.println("Los lados del triángulo no pueden ser 0 ni negativos. Intente de nuevo.");
                intentos++;
            }
        }

        if (intentos >= 3) {
            System.out.println("Ha alcanzado el máximo de intentos. Programa terminado.");
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo isósceles.");
            } else if (Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2) ||
                       Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2) ||
                       Math.pow(lado3, 2) + Math.pow(lado1, 2) == Math.pow(lado2, 2)) {
                System.out.println("Es un triángulo rectángulo.");
            } else {
                System.out.println("Es un triángulo escaleno.");
            }
        }

        lector.close();
    }
}