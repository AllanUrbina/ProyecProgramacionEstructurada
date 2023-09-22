import java.util.Scanner;

public class Proyecto7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numeroCuenta, minutosDia, minutosGratis, minutosGratisDia, minutosGratisNoche, minutosNoche;
        
        double costoMinutoDia, costoMinutoNoche, totalFactura,costoPorMinuto;

        char Servicio;
        
        System.out.print("Ingrese el número de cuenta: ");
        
        numeroCuenta = lector.nextInt();

        System.out.print("Ingrese el servicio que ocupa (R / P): ");
         Servicio = lector.next().charAt(0);

        System.out.print("Ingrese el número de minutos utilizados durante el día: ");
        minutosDia = lector.nextInt();

        System.out.print("Ingrese el número de minutos utilizados durante la noche: ");
        minutosNoche = lector.nextInt();

         totalFactura = 0;

        switch (Servicio) {
            case 'R':
            case 'r':
                minutosGratis = 50;
                 costoPorMinuto = 0.20;

                if (minutosDia > minutosGratis) {
                    totalFactura = (minutosDia - minutosGratis) * costoPorMinuto;
                }

                if (minutosNoche > minutosGratis) {
                    totalFactura = (minutosNoche - minutosGratis) * costoPorMinuto;
                }

                totalFactura = totalFactura + 10;

                System.out.println("Número de cuenta: " + numeroCuenta);

                System.out.println("Tipo de servicio: Regular");
                
                System.out.println("Minutos utilizados durante el día: " + minutosDia);

                System.out.println("Minutos utilizados durante la noche: " + minutosNoche);

                System.out.println("Total a pagar: " + totalFactura);

                break;

            case 'P':
            case 'p':

                minutosGratisDia = 75;
                minutosGratisNoche = 100;
                costoMinutoDia = 0.10;
                costoMinutoNoche = 0.05;

                if (minutosDia > minutosGratisDia) {
                    totalFactura = (minutosDia - minutosGratisDia) * costoMinutoDia;
                }

                if (minutosNoche > minutosGratisNoche) {
                    totalFactura = (minutosNoche - minutosGratisNoche) * costoMinutoNoche;
                }

                totalFactura = totalFactura + 25;
                System.out.println("Número de cuenta: " + numeroCuenta);

                System.out.println("Tipo de servicio: Premium");

                System.out.println("Minutos utilizados durante el día: " + minutosDia);

                System.out.println("Minutos utilizados durante la noche: " + minutosNoche);

                System.out.println("Total a pagar: " + totalFactura);

                break;

            default:
                System.out.println("Fin del programa.");

        }

        lector.close();
    }
}
