
    import java.util.Scanner;

public class Proyecto31 {
    
public static void main(String args []) {
   Scanner lector = new Scanner (System.in);
    
   long numero,factorprimo;
   
   System.out.println("Ingrese un número entero positivo grande: ");
    numero = lector.nextLong();

   if (numero <= 0) {
    System.out.println("El numro no puede ser negativo");
  
  }
  System.out.println("Los factores primos de " + numero + " son los siguientes: ");

     factorprimo = 2;

    while (numero > 1) {
 
      if (numero % factorprimo == 0) {
        System.out.println(factorprimo);
        numero /= factorprimo;
      } else {
        factorprimo++;
      
      }
     }
  
   lector.close();
  
  }

}

