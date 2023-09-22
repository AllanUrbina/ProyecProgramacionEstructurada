import java.util.Scanner;

public class Proyecto9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int valor1, valor2, sumanumerospares, sumaCuadradosImpares, valoractual, cuadrado;

        System.out.print("Ingrese el primer número: ");
        valor1 = lector.nextInt();

        System.out.print("Ingrese el segundo número : ");
        valor2 = lector.nextInt();

        sumanumerospares = 0;

        sumaCuadradosImpares = 0;

        valoractual = valor1;

        while (valoractual < valor2) {
            System.out.println("Número: " + valoractual);

            cuadrado = valoractual * valoractual;
            System.out.println("Cuadrado: " + cuadrado);

            if (valoractual % 2 != 0) {
                sumaCuadradosImpares = sumaCuadradosImpares + cuadrado;
                System.out.println("Es impar.");
            }

            if (valoractual % 2 == 0) {
                sumanumerospares += valoractual;
                System.out.println("Es par.");
            }

            esNumeroPerfecto(valoractual);

            esNumeroPrimo(valoractual);

            valoractual = valoractual + 1;

        }

        System.out.println("Suma de números pares: " + sumanumerospares);
        System.out.println("Suma de cuadrados de números impares: " + sumaCuadradosImpares);

        lector.close();
    }

    public static void esNumeroPerfecto(int num) {
        if (num <= 1) {
            System.out.println(num + " no es perfecto.");
        } else {
            int sumaDivisores = 0;
            int contador = 1;
            int esPerfecto = 0;
            while (contador < num) {
                if (num % contador == 0) {
                    sumaDivisores += contador;
                }
                contador = contador + 1;
            }
            if (sumaDivisores == num) {
                esPerfecto = num;
            }
            if (esPerfecto != 0) {
                System.out.println(esPerfecto + " es perfecto.");
            }
        }
    }

    public static void esNumeroPrimo(int num) {
        if (num <= 1) {
            System.out.println(num + " no es primo.");
        } else {
            int contadorDivisores = 0;
            int contador = 2;
            while (contador <= Math.sqrt(num)) {
                if (num % contador == 0) {
                    contadorDivisores++;
                }
                contador = contador + 1;
            }
            if (contadorDivisores == 0) {
                System.out.println(num + " es primo.");
            }
        }
    }
}