import java.util.Scanner;

public class Proyecto21 {
    public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);
        int año, Dsemana;
        int dia = 1;
        int mes = 1;

        do {
            System.out.print("Introduce un año que este entre  1994 y 1999: ");
            año = lector.nextInt();
        } while (año < 1994 || año > 1999);

        System.out.println("\nCalendario para el año " + año + ":\n");

        while (año == 1994 || año == 1996 || año == 1998 || (año == 1995 && mes <= 7) || (año == 1997 && mes <= 7)) {

            switch (mes) {
                case 1:
                    System.out.println("Enero");
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;
                case 3:
                    System.out.println("Marzo");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Mayo");
                    break;
                case 6:
                    System.out.println("Junio");
                    break;
                case 7:
                    System.out.println("Julio");
                    break;
            }
            System.out.println("Lunes Martes Miercoles Jueves Viernes Sababado Domingo");

            Dsemana = (dia + 5) % 7;

            for (int i = 0; i < Dsemana; i++) {
                System.out.print("    ");
            }

            while (dia <= diasEnMes(mes, año)) {

                System.out.printf("%3d ", dia);

                dia = dia + 1;
                Dsemana = Dsemana + 1;

                if (Dsemana == 7) {
                    System.out.println();
                    Dsemana = 0;
                }
            }

            mes = mes + 1;

            if (mes > 12) {
                mes = 1;
                año= año + 1;
            }

            System.out.println("\n");
        }

        lector.nextInt();
    }

    public static int diasEnMes(int mes, int año) {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;

        }

    }
}
