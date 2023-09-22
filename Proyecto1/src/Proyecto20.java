public class Proyecto20 {
    public static void main(String[] args) {
long tiempoInicial,tiempoFinal,tiempoTotal;
        System.out.println("En este programa se medira el tiempo la rapidez real con la que opera la computadora");
        
         tiempoInicial= System.currentTimeMillis();
        
        int cuenta = 1;
        while (cuenta <= 300000000) {
        
            if (cuenta % 1000000 == 0) {
                System.out.println(cuenta);
            }
            cuenta++;
        }

        tiempoFinal = System.currentTimeMillis();
        
     tiempoTotal = tiempoFinal - tiempoInicial;
        
        System.out.println("Tiempo total: " + tiempoTotal + " milisegundos");
    }
}

