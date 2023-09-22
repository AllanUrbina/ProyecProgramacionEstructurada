import java.util.Scanner;
 public class Proyecto3 {
    public static void main(String[] args) {
        
        
     Scanner lector = new   Scanner(System.in);
       
     int totalRosquillas,rosquillasobrante,contenedores,cajas,cajasobrante;
    
    
     System.out.print("Ingrese cantidad de rosquillas: ");
        
      totalRosquillas = lector.nextInt();
     
     
     cajas = totalRosquillas / 24;
        
     rosquillasobrante = totalRosquillas % 24;
        
      contenedores = cajas / 75;
        
      cajasobrante= cajas % 75;
        
     System.out.println("Número de cajas que necesitan : " + cajas);
        
     System.out.println("Número de contenedores que necesita: " + contenedores);
        
     System.out.println("Rosquillas sobrantes: " + rosquillasobrante);
        
     System.out.println("Cajas de rosquillas sobrantes: " + cajasobrante);
     
        lector.close();
    }
}