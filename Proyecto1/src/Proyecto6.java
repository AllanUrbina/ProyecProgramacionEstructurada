import java.util.Scanner;

public class Proyecto6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numeroCuenta;

        double saldoActual, saldoMinimo;
        char tipoCuenta;

        for (int i = 0; i < 5; i++) {
            System.out.println("Cliente " + (i + 1));

            System.out.print("Número de cuenta: ");
            numeroCuenta = lector.nextInt();

            System.out.print("Tipo de cuenta (S / C): ");
            tipoCuenta = lector.next().charAt(0);

            System.out.print("Saldo mínimo requerido: U$");
            saldoMinimo = lector.nextDouble();

            System.out.print("Saldo actual: U$");
            saldoActual = lector.nextDouble();

            double saldoNuevo = saldoActual;

            switch (tipoCuenta) {
                case 'S':
                case 's':
                    if (saldoActual < saldoMinimo) {
                        saldoNuevo = saldoNuevo - 10;
                    }
                    saldoNuevo = saldoNuevo * 0.04;
                    break;
                case 'C':
                case 'c':
                    if (saldoActual < saldoMinimo) {
                        saldoNuevo = saldoNuevo - 25;
                    }
                    if (saldoActual <= saldoMinimo + 5000) {
                        saldoNuevo = saldoNuevo * 0.03;
                    } else {
                        saldoNuevo = saldoNuevo * 0.05;
                    }
                    break;
                default:
                    System.out.println("Tipo de cuenta no válido.");

            }

            System.out.print("Número de cuenta: " + numeroCuenta);
            System.out.print("Tipo de cuenta: " + tipoCuenta);
            System.out.print("Saldo actual: U$" + saldoActual);
            System.out.print("Saldo nuevo: U$" + saldoNuevo);
        }
        lector.close();
    }
}
