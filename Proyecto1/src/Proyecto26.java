
import java.util.Random;
import java.util.Scanner;

public class Proyecto26 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random ran = new Random();
      String respuestaUsuario;
        System.out.println("¡Hola, soy Eliza! un Psicologo virtual. Escribe 'Adiós' para salir.");

        while (true) {
            System.out.print("Puedes Contarme cualquier cosa : ");
           
             respuestaUsuario = lector.nextLine().toLowerCase();

            if (respuestaUsuario.equals("adiós")) {
                System.out.println("Eliza: Adiós. Espero que esta converzacion te ayude");
                break;
            } else if (respuestaUsuario.contains("mi")) {

                String sustantivo = obtenerSustantivo(respuestaUsuario);
               
                System.out.println("Eliza: Cuéntame más sobre " + "su " + sustantivo);
            
            } else if (respuestaUsuario.contains("amor") || respuestaUsuario.contains("odio")) {

                System.out.println("Eliza: Parece que tiene fuertes sentimientos al respecto.");
            } else {

                String[] respuestasAleatorias = { "Continúe", "Dígame más", "Cuentame mas,sigue escribiendo" };
                
                int indiceAleatorio = ran.nextInt(respuestasAleatorias.length);
                
                System.out.println("Eliza: " + respuestasAleatorias[indiceAleatorio]);
            }
        }

        lector.close();
    }

    public static String obtenerSustantivo(String respuesta) {
        String[] palabras = respuesta.split(" ");
       
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals("mi") && i < palabras.length - 1) {
                return palabras[i + 1];
            }
        }
        return "usted";
    }
}
