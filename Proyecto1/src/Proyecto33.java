
import java.util.Scanner;

public class Proyecto33 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione la operación que desea realizar:");
            System.out.println("1. Decimal a Octal, Binario y Hexadecimal");
            System.out.println("2. Octal a Decimal, Binario y Hexadecimal");
            System.out.println("3. Binario a Decimal, Hexadecimal y Octal");
            System.out.println("4. Hexadecimal a Octal y Binario");
            System.out.println("5. Salir");

            int opcion = lector.nextInt();
            lector.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número decimal: ");
                    int decimal = lector.nextInt();
                    lector.nextLine(); 

                    Num(decimal, 8, "Octal");
                    Num(decimal, 2, "Binario");
                    Num(decimal, 16, "Hexadecimal");
                    break;

                case 2:
                    System.out.print("Ingrese un número octal: ");
                    String octalInput = lector.nextLine();

                    int octal = Integer.parseInt(octalInput, 8);
                    Num(octal, 10, "Decimal");
                    Num(octal, 2, "Binario");
                    Num(octal, 16, "Hexadecimal");
                    break;

                case 3:
                    System.out.print("Ingrese un número binario: ");
                    String binarioInput = lector.nextLine();

                    int binario = Integer.parseInt(binarioInput, 2);
                    Num(binario, 10, "Decimal");
                    Num(binario, 16, "Hexadecimal");
                    Num(binario, 8, "Octal");
                    break;

                case 4:
                    System.out.print("Ingrese un número hexadecimal: ");
                    String hexadecimalInput = lector.nextLine();

                    int hexadecimal = Integer.parseInt(hexadecimalInput, 16);
                    Num(hexadecimal, 8, "Octal");
                    Num(hexadecimal, 2, "Binario");
                  
                    
                   
                   
                   
                   
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    return;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public static void Num(int numero, int base, String nombreBase) {
        String resultado = Integer.toString(numero, base);
        System.out.println(nombreBase + ": " + resultado);
    }
}