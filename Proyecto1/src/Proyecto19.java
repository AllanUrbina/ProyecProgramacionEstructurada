import java.util.Scanner;

public class Proyecto19 {
   public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
          double cargoInicial= 2.00, cobroAdicional = 0.50, cobroMximo = 10.00, cobroTotal = 0.00, cargoCliente = 0.00;
          
          int Tiempoparqueado;
        
          System.out.println("digite el tiempo  parqueado: ");
          Tiempoparqueado= lector.nextInt();
        
          if (Tiempoparqueado <= 3) {
            cargoCliente= cargoInicial;
         
        } else if (Tiempoparqueado> 3 && Tiempoparqueado <= 24) {
            cargoCliente= cargoInicial + (cobroAdicional* (Tiempoparqueado - 3));
          
        } else {
          cargoCliente= cobroMximo;
          }
        
          System.out.println("Los cargos para el cliente actual es: " + cargoCliente);
        
          cobroTotal= cargoCliente;
        
          System.out.println("Los cargos totales del día son: " + cobroTotal);

          lector.close();
    }
}