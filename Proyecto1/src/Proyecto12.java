import java.util.Scanner;

public class Proyecto12 {
   public static void main(String[] args) {

        int numeroCuenta, numeroCanalesPremium, numeroConexiones = 0;
        double Factura=0;
        char TipodeCliente;
        Scanner lector = new Scanner(System.in);
        
          System.out.println("Ingrese el número de cuenta del cliente:");
          numeroCuenta = lector.nextInt();
        
          System.out.println("Ingrese el código de cliente (R/N):");
          TipodeCliente = lector.next().charAt(0);
        
          System.out.println("Ingrese el número de canales Premium:");
          numeroCanalesPremium = lector.nextInt();
        
          
        if(TipodeCliente=='N' || TipodeCliente=='n') {
            System.out.println("Ingrese el número de conexiones :");
            numeroConexiones = lector.nextInt();
        }
        
        if (TipodeCliente=='R' || TipodeCliente=='r') {
            
            Factura = 4.50 + 20.50 + 7.50 * numeroCanalesPremium;
        } else if (TipodeCliente=='N' || TipodeCliente=='n') {
        
            if (numeroConexiones <= 10) {
                Factura = 15.00 + 75.00 + 50.00 * numeroCanalesPremium;
            } else {
                Factura = 15.00 + 75.00 + 5.00 * (numeroConexiones - 10) + 50.00 * numeroCanalesPremium;
            }
        }
        
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Importe de facturación: " + Factura);

        lector.close();
    }
} 

