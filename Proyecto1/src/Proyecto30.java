
import java.util.Scanner;

public class Proyecto30 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double total;
        String orden;
        String[] Categorias = {

                "1. Desayunos",
                "2. Almuerzos",
                "3. Postres",
                "4. Cafe",
                "5. Bebidas ",
                "6. dulce",
                "7. Cajita Feliz",
        };

        System.out.println("Bienvenido a McDonald's");
        System.out.println("Categorias");

        for (String item : Categorias) {
            System.out.println(item);
        }

        String[] menu = {

                "1. Mcmuffinn de salchicha y huevo - c$ 181",
                "2.  sandwich picante - c$ 260",
                "3. Papa mediana + derretido+ Mcflurry oreo caramelo - c$ 190",
                "4. McNica de Res - c$ 268",
                "5. Big Mac - c$ 253",
                "6. Big Mac Double - c$ 313",
                "7. Cuarto de libra doble - c$ 318",
                "8. Hamburguesa simple - c$ 106",
                "9. Cajita feliz de hamburguesa Junior - c$ 208",
                "10. Cajta feliz de Hamburguesa con queso - c$ 208",
                "11. Cajita feliz de Hamburguesa - c$ 208",
                "12. Cajita feliz de McNuggets - c$ 208",
                "13. Papas fritas - c$ 81",
                "14. Dados de queso- c$ 56",
                "15. Pollo mcCrispy 1 pieza - c$ 138",
                "16. McFlurry Dulce Mani - c$ 96",
                "17. McFlurry Oreo Caramelo - c$ 96",
                "18. McFlurry  Chocolate - c$ 96",
                "19. McFlurry  caramelo - c$ 96",
                "20. Coca cola- c$ 76",
                "21. Sprite - c$ 76",
                "22. Fanta- c$ 76",
                "23. Coca Cola lata - c$ 78",
                "24. Fanta botella - c$ 78",
                "25. te Latte - c$ 94",
                "26. El moca - c$ 121",
                "27. pastel de Fresa - c$ 136",
                "28.Pastel de chocolate - c$ 116",

        };

        double[] precios = { 181, 260, 190, 268, 253, 313, 318, 106, 208, 208, 208, 208, 81, 56, 138,
                96, 96, 96, 96, 76, 76, 76, 78, 78, 94, 121, 136, 116 };
        System.out.println(" Menú:");

        for (String item : menu) {
            System.out.println(item);
        }

        total = 0;
        orden = "";

        while (true) {
            System.out.print("Seleccione un platillo (1-28) o 0 para finalizar la orden: ");
            int opcion = lector.nextInt();

            if (opcion == 0) {
                break;
            } else if (opcion >= 1 && opcion <= 28) {
                int indice = opcion - 1;
                total = total + precios[indice];
                orden = orden + menu[indice] + "\n";
            } else {
                System.out.println("Opción inválida. Por favor, seleccione un número válido.");
            }
        }

        System.out.println("\n Detalle de la factura:");

        System.out.println(orden);

        System.out.println("Total a pagar: c$" + total);

        lector.close();
    }
}
