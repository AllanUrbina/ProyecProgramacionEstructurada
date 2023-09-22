import java.util.Scanner;
import java.util.Random;

public class Proyecto22 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Random ran = new Random();
        boolean jugar = true;

        while (jugar) {

            int numeroadividar = ran.nextInt(50) + 1;
            int intentos = 0;
            boolean adividar = false;

            System.out.println("Adivina un numeroadividar (entre 1-50).");

            while (!adividar && intentos < 3) {

                int numingresado = lector.nextInt();
                intentos= intentos + 1;

                if (numingresado == numeroadividar) {
                    adividar = true;
                    System.out.println("Felicidades numero correcto");
                } else if (numingresado > numeroadividar) {
                    System.out.println("El numeroadividar es mayor al numero ingresado");
                } else {
                    System.out.println("El numeroadividar es menor al numero ingresado.");
                }
            }

            if (!adividar) {
                System.out.println("Lo siento, el número era " + numeroadividar + ".");
            }

            System.out.println("¿Quieres volver a intentarlo? (Si/No)");
            char respuesta = lector.next().charAt(0);

            if (respuesta == 'N' || respuesta == 'n') {
                jugar = false;
                System.out.println("Fin del programa.");
            }
        }
        lector.close(); 
    }
}
    