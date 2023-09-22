
import java.util.Scanner;

public class Proyecto25 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String contrasena, confirmacion;

        do {
            System.out.print("Ingrese una contraseña que contenga de 6 y 10 caracteres: ");
            contrasena = lector.nextLine();
        } while (!validarContrasena(contrasena));

        do {
            System.out.print("Confirma la contraseña: ");
            confirmacion = lector.nextLine();
        } while (!contrasena.equals(confirmacion));

        System.out.println("La contaseña ingresada es correcta");

        lector.close();
    }

    public static boolean validarContrasena(String contrasena) {
        int longitudMinima = 6;
        int longitudMaxima = 10;

        if (contrasena.length() < longitudMinima || contrasena.length() > longitudMaxima) {
            System.out.println(
                    "La contraseña tiene que tener entre " + longitudMinima + " y " + longitudMaxima + " caracteres.");
            return false;
        }

        boolean tieneLetra = false;
        boolean tieneDigito = false;

        for (char caracter : contrasena.toCharArray()) {
            if (Character.isLetter(caracter)) {
                tieneLetra = true;
            } else if (Character.isDigit(caracter)) {
                tieneDigito = true;
            }
        }

        if (!tieneLetra || !tieneDigito) {
            System.out.println("La contraseña debe contener al menos una letra y un dígito.");
            return false;
        }

        return true;
    }
}
