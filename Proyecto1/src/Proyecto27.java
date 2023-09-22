
    import java.util.Scanner;

public class Proyecto27 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

     double salariobruto,porcentajeantiguedad,impIR=0,salarioNeto;
     int anosantiguedad;
        
     System.out.print("Ingrese el salario bruto del empleado: ");
         salariobruto = lector.nextDouble();

        System.out.print("Ingrese los años de antigüedad del empleado: ");
        anosantiguedad = lector.nextInt();

           if (anosantiguedad== 1) {
            porcentajeantiguedad = 0.03;
        
        } else if (anosantiguedad>= 2 && anosantiguedad<= 20) {
            porcentajeantiguedad = anosantiguedad* 2 + 1 / 100.0;
        
        } else if (anosantiguedad>= 21 &&anosantiguedad<= 30) {
            porcentajeantiguedad = 0.5;
        
        } else {
            porcentajeantiguedad = 0.6;
        }

        if (salariobruto <= 100000.00) {
            impIR = 0.00;
        
        } else if (salariobruto <= 200000.00) {
            impIR = (salariobruto - 100000.00) * 0.15;
       
        } else if (salariobruto <= 350000.00) {
            impIR = (salariobruto - 200000.00) * 0.20 + 15000.00;
        
        } else if (salariobruto <= 500000.00) {
            impIR = (salariobruto - 350000.00) * 0.25 + 45000.00;
        
        } else {
            impIR = (salariobruto - 500000.00) * 0.30 + 82500.00;
        }

        
     salarioNeto = salariobruto - impIR + (salariobruto * porcentajeantiguedad);

    
        System.out.println("El impuesto sobre la renta es: C$" + impIR);
        System.out.println("El salario neto del empleado es: C$" + salarioNeto);

        lector.close();
    }
}

