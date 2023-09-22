
    import java.util.Scanner;

public class Proyecto32 {
    
public static void main(String[] args) {
   Scanner lector = new Scanner (System.in);

    int Valormenor,Valormayor;

    System.out.println ("Ingrese un numero entero menor: ");
      Valormenor = lector.nextInt();
    
    System.out.println("Ingrese un numero entero Mayor: ");
      Valormayor = lector.nextInt();

      if (Valormenor < Valormayor) {
        System.out.println ("El valormenor debe de ser menor que al valor mayor : ");
      } 
   
      int sumapar = 0;
      int sumacuadradoimpar = 0;
     
      for (int num = Valormenor; num <= Valormayor; num++) {
        
        if (num % 2 == 1) {
          System.out.println(num + " su resultado es impar");
          sumacuadradoimpar += num * num;
        }
        else {
          sumapar += num;
          return;
        }

        System.out.println(num + " elevado al cuadrado es " + (num * num));

      int Igualsuma_divisor = 0;

      for (int p = 1; p < num; p++) {
        if (num % p == 0) {
          Igualsuma_divisor = + p;
        }
      }
      if (num == Igualsuma_divisor) {
        System.out.println(num + " es un numero perfecto");
      }

      int cantidad_divisor = 0;
      for (int j = 1; j <= num; j++) {
        if (num % j == 0) {
          cantidad_divisor++;
        }
      }
      if (cantidad_divisor == 2) {
        System.out.println(num + " es un numero primo");
      }
    }

    System.out.println("La suma de los números pares  es: " + Valormenor + " + " + Valormayor + " = " + sumapar);
    System.out.println("La suma de los cuadrados de los números impares es: " + Valormenor + " + " + Valormayor + " = " + sumacuadradoimpar);

lector.close();
  
  }

}


