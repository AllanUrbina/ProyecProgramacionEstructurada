import java.util.Scanner;

public class Proyecto14 {
public static void main(String args[]){
        int litros =0;
        int kilometros=0;
        double total;

        Scanner lector = new Scanner(System.in);
         
        do{
        System.out.println("Cuantos litros de combustible uso?");
        litros=lector.nextInt();
        }while(litros <=0 || litros>100);

        do{
            System.out.println("Digite la cantidad de Kilometros que recorrio");
            kilometros=lector.nextInt();
        }while(kilometros<=0 || kilometros>600);

        total = litros / kilometros * 100;

        System.out.println("Los kilometros por litro son " +total);


        lector.close();
    }
    
}

