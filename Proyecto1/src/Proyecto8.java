import java.util.Scanner;

public class Proyecto8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double longitud, ancho, costoPintura, costoMarco, costoCarton = 0, costoVidrio = 0, costoTotal, costoCoronas;
        char tipoMarco, agregarCoronas, agregarcarton, agregarvidrio;
        String colorMarco;

        System.out.print("Ingrese la longitud de la fotografía en pulgadas: ");
        longitud = lector.nextDouble();
        System.out.print("Ingrese el ancho de la fotografía en pulgadas: ");
        ancho = lector.nextDouble();

        System.out.print("Ingrese el tipo de marco (R/L): ");
        tipoMarco = lector.next().charAt(0);

        costoMarco = 0;

        switch (tipoMarco) {
            case 'R':
                costoMarco = 0.15 * (2 * longitud + 2 * ancho);

                System.out.print("Ingrese el color del marco : ");
                 colorMarco = lector.next();

                costoPintura = 0;

                if (colorMarco != "blanco") {
                    costoPintura = 0.10 * (2 * longitud + 2 * ancho);
                }

                System.out.print("¿Desea agregar coronas? (S/N): ");
                agregarCoronas = lector.next().charAt(0);
                costoCoronas = 0;

                if (agregarCoronas == 'S') {
                    System.out.print("Ingrese el número de coronas: ");
                    int numeroCoronas = lector.nextInt();
                    costoCoronas = 0.35 * numeroCoronas;
                }
                System.out.print("¿Desea agregar carton al marco? (S/N): ");
                agregarcarton = lector.next().charAt(0);
                

                if (agregarcarton == 'S') {
                    System.out.print("Ingrese el número de coronas: ");

                    costoCarton = 0.02 * (longitud * ancho);

                }

                System.out.print("¿Desea agregar Vidrio al marco? (S/N): ");
                agregarvidrio = lector.next().charAt(0);

                if (agregarvidrio == 'S') {

                    costoVidrio = 0.07 * (longitud * ancho);
                }
                costoTotal = costoMarco + costoPintura + costoCarton + costoVidrio + costoCoronas;

                System.out.println("El costo total de enmarcar la fotografía es: U$" + costoTotal);

                break;

            case 'L':

                costoMarco = 0.25 * (2 * longitud + 2 * ancho);

                System.out.print("Ingrese el color del marco : ");
                colorMarco = lector.next();

                costoPintura = 0;

                if (colorMarco != "blanco") {
                    costoPintura = 0.10 * (2 * longitud + 2 * ancho);
                }

                System.out.print("¿Desea agregar coronas? (S/N): ");
                agregarCoronas = lector.next().charAt(0);
                costoCoronas = 0;

                if (agregarCoronas == 'S') {
                    System.out.print("Ingrese el número de coronas: ");
                    int numeroCoronas = lector.nextInt();
                    costoCoronas = 0.35 * numeroCoronas;
                }
                System.out.print("¿Desea agregar carton al marco? (S/N): ");
                agregarcarton = lector.next().charAt(0);
                

                if (agregarcarton == 'S') {
                    System.out.print("Ingrese el número de coronas: ");

                    costoCarton = 0.02 * (longitud * ancho);

                }

                System.out.print("¿Desea agregar Vidrio al marco? (S/N): ");
                agregarvidrio = lector.next().charAt(0);

                if (agregarvidrio == 'S') {

                    costoVidrio = 0.07 * (longitud * ancho);
                }
                costoTotal = costoMarco + costoPintura + costoCarton + costoVidrio + costoCoronas;

                System.out.println("El costo total de enmarcar la fotografía es: U$" + costoTotal);

                break;
            default:
                System.out.println("Fin del programa.");

                break;
        }

        lector.close();
    }
}
