
    import java.util.Scanner;

public class Proyecto24 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String Palabra, acromayuscula;

        System.out.println("Ingrese las 3 letras para generar su acronimo: ");
        Palabra = lector.nextLine();

        
        String[] palabras = Palabra.split(" ");

        
        if (palabras.length == 3) {
            
            StringBuilder acronimo = new StringBuilder();
            for ( String palabra : palabras) {
                acronimo.append(palabra.charAt(0));
            }

            
            acromayuscula = acronimo.toString().toUpperCase();
            System.out.println("El acrónimo es: " + acromayuscula);
        } else {
            System.out.println("Debes ingresar exactamente tres palabras.");
        }

        lector.close();
    }
}


