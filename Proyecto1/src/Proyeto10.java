import java.util.Scanner;

public class Proyeto10 {
    public static void main(String[] args) throws Exception {
        char sexo;
        double A1, A2, A3, A4, A5, b, pesoCorporalkg, pesoCorporalLb, medidamuneca = 0;
        double medidacintura, medidacadera, medidaantebrazo, grasacorporalKG = 0, porcentajegrasacorporal = 0,
                porcentajegrasacorporalb = 0, grasacorboralb = 0;

        Scanner lector = new Scanner(System.in);

        System.out.println("En este programa se realizara los calculos para medir la grasa corporal");

        System.out.println("Cual es su sexo H/M");

        sexo = lector.next().charAt(0);

        switch (sexo) {
            case 'M':
            case 'm':

                do {
                    System.out.println("Cual es su lector corporal");
                    pesoCorporalkg = lector.nextDouble();

                } while (pesoCorporalkg >= 0 || pesoCorporalkg < 250);
                A1 = (pesoCorporalkg * 0.732) + 8.987;

                do {
                    System.out.println("Cual es la medida de su muñeca:");
                    medidamuneca = lector.nextDouble();

                } while (medidamuneca >= 0 || medidamuneca < 50);
                A2 = medidamuneca / 3.140;

                do {
                    System.out.println("Cual es la medida de su cintura (en el ombligo)");
                    medidacintura = lector.nextDouble();

                } while (medidacintura >= 0 || medidacintura < 150);

                A3 = medidacintura * 0.157;

                do {
                    System.out.println("Cual es la medida de la cadera (en el punto mas amplio)");
                    medidacadera = lector.nextDouble();

                } while (medidacadera >= 0 || medidacadera < 200);
                A4 = medidacadera * 0.249;

                do {
                    System.out.println("Mediada del antebrazo (en el punto mas amplio)");
                    medidaantebrazo = lector.nextDouble();

                } while (medidaantebrazo >= 0 || medidaantebrazo < 90);
                A5 = medidaantebrazo * 0.434;

                b = A1 + A2 - A3 - A4 + A5;

                grasacorporalKG = pesoCorporalkg - b;

                porcentajegrasacorporal = (grasacorporalKG * 100) / pesoCorporalkg;

                grasacorboralb = grasacorporalKG * 2.2;

                porcentajegrasacorporalb = porcentajegrasacorporal * 2.2;

                System.out.println("Su grasa corporal en KG es " + grasacorporalKG);

                System.out.println("Su grasa corporal en Lb es " + grasacorboralb);

                System.out.println("Su porcetaje de grasa corporal en Kg es " + porcentajegrasacorporal);

                System.out.println("Su porcentaje de grasa corporal en LB es " + porcentajegrasacorporalb);

                break;

            case 'H':
            case 'h':

                do {
                    System.out.println("Cual es su lector corporal");
                    pesoCorporalkg = lector.nextDouble();

                } while (pesoCorporalkg >= 0 || pesoCorporalkg < 250);

                A1 = (pesoCorporalkg * 1.082) + 94.42;

                do {
                    System.out.println("Cual es la medida de su cintura");
                    medidacintura = lector.nextDouble();

                } while (medidacintura >= 0 || medidacintura < 300);
                A2 = medidacintura * 4.15;

                b = A1 - A2;

                pesoCorporalLb = pesoCorporalkg * 2.2;

                grasacorporalKG = pesoCorporalkg - b;

                porcentajegrasacorporal = (grasacorporalKG * 100) / pesoCorporalkg;

                grasacorboralb = pesoCorporalLb - b;

                porcentajegrasacorporalb = (grasacorboralb * 100) / pesoCorporalLb;

                System.out.println("Su lector corporal en Kg es " + grasacorporalKG);

                System.out.println("Su lector corporal en Lb es " + grasacorboralb);

                System.out.println("Su porcentaje de grasa corporal en Kg es" + porcentajegrasacorporal);

                System.out.println("Su porcentaje de grasa corporal en Lb es " + porcentajegrasacorporalb);

                break;
            default:
                System.out.println("Fin del Programa");

                break;
        }
        lector.close();
    }
}
