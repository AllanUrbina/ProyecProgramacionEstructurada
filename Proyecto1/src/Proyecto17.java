import java.util.Scanner;

public class Proyecto17 {
    public static void main(String[] args) {
        
          int numeroArticulo;
          double[] precioarticulos= { 239.99, 129.75, 99.95, 350.89 };
          
          double ingresos,ventasBrutas;

          Scanner lector = new Scanner(System.in);
          
          System.out.println("Ingrese los artículos vendidos por el lector (ingrese -1 para finalizar):");

           ventasBrutas= 0;
          
            while (true) {
            System.out.print("Ingrese el número del artículo vendido (-1 para finalizar): ");
            numeroArticulo= lector.nextInt();

            if (numeroArticulo == -1) {
                break;
            }

            if (numeroArticulo >= 1 && numeroArticulo <= precioarticulos.length) {
                ventasBrutas = precioarticulos[numeroArticulo - 1];
            } else {
                System.out.println("Número de artículo no válido. Intente de nuevo.");
            }
        }

         
    
          ingresos = 200 + (0.09 * ventasBrutas);

          System.out.println("Los ingresos totales son: C$" + ingresos);

          lector.close();
    }
}

