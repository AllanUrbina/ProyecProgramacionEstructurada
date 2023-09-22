import java.util.Scanner;

public class Proyecto1 {
    public static void main(String[] args) throws Exception {
    
       Scanner lector = new Scanner(System.in);
         
        byte edad = 0;
        char sexo;
        char ingrese;
        int intentos = 0;
        
        System.out.println("Lleva arma S/N");
        ingrese = lector.next().charAt(0);

        if (ingrese == 'S' || ingrese == 's') {
            System.out.println("Usted no puede entrar a la disco");
        } else {
            while (edad <= 0) {
                if (intentos >= 3) {
                    System.out.println("Ha alcanzado el máximo de intentos. Programa terminado.");
                    break;
                }
                
                System.out.println("Ingrese su edad");
                edad = lector.nextByte();
                
                if (edad <= 0) {
                    System.out.println("La edad no puede ser menor o igual a 0. Intente de nuevo.");
                }
                
                intentos++;
            }
            
            if (edad >= 18) {
                System.out.println("Ingrese su sexo M/F");
                sexo = lector.next().charAt(0);
                
                if ((sexo == 'f' || sexo == 'F') && edad == 18) {
                    System.out.println("Usted puede entrar a la disco pero no puede tomar");
                } else if ((sexo == 'f' || sexo == 'F') && edad >= 20) {
                    System.out.println("Usted puede entrar a la disco y puede tomar alcohol");
                } else if ((sexo == 'm' || sexo == 'M') && edad >= 18 && edad <= 21) {
                    System.out.println("Usted puede entrar a la disco pero no puede tomar");
                } else if ((sexo == 'm' || sexo == 'M') && edad >= 21) {
                    System.out.println("Usted puede entrar a la disco y tomar alcohol");
                }
            } else {
                System.out.println("Usted es menor de edad y no puede ingresar a la disco");
            }
            lector.close();
        }
    }
}