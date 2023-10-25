import java.util.Scanner;

public class Proyecto3 {
    static int totalRosquillas, rosquillasobrante, contenedores, cajas, cajasobrante, intentos;

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        for (intentos = 0; intentos < 3; intentos++) {
            System.out.print("Ingrese cantidad de rosquillas: ");

            totalRosquillas = lector.nextInt();
            if (totalRosquillas < 0) {
                System.out.println("No se aceptan valores menores a 0.1");
            } else {
                intentos = 3;
            }
        }

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        } else {

            cajas = totalRosquillas / 24;

            rosquillasobrante = totalRosquillas % 24;

            contenedores = cajas / 75;

            cajasobrante = cajas % 75;

            System.out.println("Número de cajas que necesitan : " + cajas);

            System.out.println("Número de contenedores que necesita: " + contenedores);

            System.out.println("Rosquillas sobrantes: " + rosquillasobrante);

            System.out.println("Cajas de rosquillas sobrantes: " + cajasobrante);

            lector.close();
        }
    }
}
