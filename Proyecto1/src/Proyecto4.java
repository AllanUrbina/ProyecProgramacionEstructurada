import java.util.Scanner;

public class Proyecto4 {
    static double a, b, c, discriminante, parteReal, parteImaginaria;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double raiz1, raiz2, raiz;

        int intentos;
        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print(" ingrese el valor a: ");
            a = lector.nextDouble();
            if (a < 0) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {
            for (intentos = 0; intentos < 3; intentos++) {
                System.out.print("ingrese el valor de b: ");
                b = lector.nextDouble();
                if (b < 0) {
                    System.out.println("No se aceptan valores menores a 0.1");
                } else {
                    intentos = 3;
                }
            }

            if (intentos == 3) {
                System.out.println("Demasiados intentos fallidos");
            } else {
                for (intentos = 0; intentos < 3; intentos++) {
                    System.out.print("ingrese el valor de c: ");
                    c = lector.nextDouble();
                    if (c < 0) {
                        System.out.println("No se aceptan valores menores a 0.1");
                    } else {
                        intentos = 3;
                    }
                }

                if (intentos == 3) {
                    System.out.println("Demasiados intentos fallidos");
                } else {

                    discriminante = Math.pow(b, 2) - 4 * a * c;

                    if (discriminante > 0) {
                        raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                        raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                        System.out.println("Las raíces son reales :");
                        System.out.println(" Ecuacion cuadratica con simbolo +  = " + raiz1);
                        System.out.println("Ecuaciion cuadratica con simbolo -  = " + raiz2);
                    } else if (discriminante == 0) {
                        raiz = -b / (2 * a);
                        System.out.println("La ecuación tiene una sola raíz :");
                        System.out.println("Raíz = " + raiz);
                    } else {
                        parteReal = -b / (2 * a);
                        parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
                        System.out.println("La Ecuacion posee dos raices complejas:");
                        System.out.println("Raíz 1 = " + parteReal + " + " + parteImaginaria);
                        System.out.println("Raíz 2 = " + parteReal + " - " + parteImaginaria);
                    }
                }
            }
        }
        lector.close();
    }
}
