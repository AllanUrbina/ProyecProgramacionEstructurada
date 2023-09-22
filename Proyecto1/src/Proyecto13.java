import java.util.Scanner;
public class Proyecto13{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double saldoCordobas = 50000,montoDeposito;
        
        double saldoDolares = 20000,montoRetiro=0;
        
        int cuentaDeposito,cuentaRetiro;
        do {
            System.out.println("Seleccione una opción:");
            
            System.out.println("1. Depositar");
            
            System.out.println("2. Retirar");
            
            System.out.println("3. Salir");

            Byte opcion = lector.nextByte();


            switch (opcion) {
                case 1:
                    System.out.println("Seleccione la cuenta que desea utilizar (1 para córdobas, 2 para dólares):");
                    cuentaDeposito = lector.nextInt();

                    System.out.println("Ingrese el monto a depositar:");
                     montoDeposito = lector.nextDouble();

                    if (cuentaDeposito == 1) {
                        saldoCordobas = saldoCordobas+montoDeposito;
                   
                    } else if (cuentaDeposito == 2) {
                        saldoDolares = saldoDolares + montoDeposito;
                    
                    } else {
                        System.out.println("Cuenta invalida.");
                    }

                    break;
                case 2:
                    System.out.println("Seleccione la cuenta (1 para córdobas, 2 para dólares):");
                    cuentaRetiro = lector.nextInt();

                    System.out.println("Ingrese el monto que desea retirar:");
                     montoRetiro = lector.nextDouble();

                    if (cuentaRetiro == 1) {
                        if (montoRetiro <= saldoCordobas) {
                            saldoCordobas = saldoCordobas- montoRetiro;
                        
                        } else {
                            System.out.println("Saldo insuficiente en cuenta de córdobas.");
                        }
                    } else if (cuentaRetiro == 2) {
                        if (montoRetiro <= saldoDolares) {
                            saldoDolares = saldoDolares-montoRetiro;
                        } else {
                            System.out.println("Saldo insuficiente en cuenta de dólares.");
                        }
                    } else {
                        System.out.println("Opción de cuenta no válida.");
                    }

                    break;
                case 3:
                    System.out.println("¿Desea imprimir el saldo actual? (Si/No):");
                    char imprimirSaldo = lector.next().charAt(0);

                    if (imprimirSaldo == 'S'||imprimirSaldo=='s');{
                        System.out.println("Saldo en córdobas: " + saldoCordobas);
                        System.out.println("Saldo en dólares: " + saldoDolares);
                    }

                    System.out.println("Gracias por usar este cajero automatico Hasta la Proxima");
                    lector.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (true);
    }
}