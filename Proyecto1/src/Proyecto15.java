import java.util.Scanner;

public class Proyecto15 {
     public static void main(String args[]){
        int horaT,horaExtra;
        double salario, salarioInicial, INSS,pagoExtra, salarioantesINSS, salarioBruto;

        Scanner sueldo = new Scanner(System.in);

        System.out.println("Calculo de salario bruto");
    
        do{
        System.out.println("Cuantas horas trabajo en la semana?");
        horaT=sueldo.nextInt();
        }while(horaT<=0 || horaT>40);

        do{
        System.out.println("Cuanto se le paga por hora?");
        salario=sueldo.nextDouble();
        }while(salario<=0 || salario>100);
        
        do{
          System.out.println("Cuantas hora extra hizo?");
          horaExtra=sueldo.nextInt();
        }while(horaExtra<=0 || horaExtra>40);

        salarioInicial= salario * horaT;
        
        pagoExtra= salario * 2;
        
        salarioantesINSS= salarioInicial + pagoExtra;
       
        INSS= salarioantesINSS * 0.07;
        
        salarioBruto= salarioantesINSS - INSS;

        System.out.println("Su salario semanal es  " +salarioInicial);
       
        System.out.println("Su salario mas las horas extra es " +salarioantesINSS);
       
        System.out.println("Su salario despues del INSS es " +INSS);
        
        System.out.println("Su salario bruto es " +salarioBruto);

        sueldo.close();
        






    }
}

