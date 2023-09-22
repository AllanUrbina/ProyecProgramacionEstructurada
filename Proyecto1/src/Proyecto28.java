
import java.util.Random;
import java.util.Scanner;

public class Proyecto28 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random ran = new Random();

        int valor1, valor2, valor3, numeroalazar;

        valor1 = ran.nextInt(10);
        valor2 = ran.nextInt(10);
        valor3 = ran.nextInt(10);
        numeroalazar = valor1 * 100 + valor2 * 10 + valor3;

        int deduccion = 0;
        int recompensa = 0;

        System.out.println("ingrese tres números entre 0 y 9: ");
        deduccion = lector.nextInt();
        
        if (deduccion < 0 || deduccion > 999) {
            System.out.println("El numero que ingreso no es valido");
        
            return;
        }

        int deduccion1 = deduccion / 100;
       
        int deduccion2 = (deduccion / 10) % 10;
       
        int deduccion3 = deduccion % 10;

        if (deduccion == numeroalazar) {
            recompensa = 1000000;
       
        } else if ((deduccion1 == valor1 && deduccion2 == valor3 && deduccion3 == valor2)
                || (deduccion1 == valor2 && deduccion2 == valor1 && deduccion3 == valor3)
                || (deduccion1 == valor2 && deduccion2 == valor3 && deduccion3 == valor1)
                || (deduccion1 == valor3 && deduccion2 == valor1 && deduccion3 == valor2)
                || (deduccion1 == valor3 && deduccion2 == valor2 && deduccion3 == valor1)) {
            recompensa = 10000;
        
        } else if ((deduccion1 == valor1 && deduccion2 == valor2) || (deduccion1 == valor1 && deduccion3 == valor3)
                || (deduccion2 == valor2 && deduccion3 == valor3)) {
            recompensa = 1000;
       
        } else if (deduccion1 == valor1 || deduccion2 == valor2 || deduccion3 == valor3) {
            recompensa = 100;
       
        } else {
            recompensa = 0;
        }

        System.out.println("Su suposición fue: " + deduccion);
        System.out.println("El número al azar fue: " + numeroalazar);
        System.out.println("usted ganó: C$" + recompensa);

        lector.close();

    }
    }
