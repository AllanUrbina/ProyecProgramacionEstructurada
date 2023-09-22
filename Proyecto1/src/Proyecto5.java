import java.util.Scanner;
public class Proyecto5{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = lector.nextInt();

        int suma = 0;

        do {
            int digito = numero % 10;
            suma = suma + digito;
            numero = numero / 10;
        } while (numero != 0);

        System.out.println("La suma de los dígitos es: " + suma);
         lector.close();
    }
}