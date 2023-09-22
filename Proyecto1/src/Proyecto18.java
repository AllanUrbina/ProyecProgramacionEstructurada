
 import java.util.Scanner; 
 public class Proyecto18{ 
     public static void main(String[] args) throws Exception { 
         Scanner lector=new Scanner(System.in); 
         int Figura,dimension,ancho,Filas; 
  
          System.out.println("1.-Tringulo Rectangulo 2.-equilatero 3.-Cuadrado 4.-Rectangulo 5.-Paralelogramo 6.-pentagono 7.-trapecio 8.- Elipse 9.- Rombo 10.-circulo"); 
          System.out.println(" "); 
          do{ 
          System.out.println("Seleccione su opcion"); 
          Figura=lector.nextInt(); 
          }while(Figura<=0 || Figura>10); 
  
          switch(Figura){ 
             case 1:{ 
                 System.out.println("Ingrese las dimensiones"); 
                 dimension=lector.nextInt(); 
                for(int i=1;i<dimension;i++){ 
                  for(int j=1;j<=i;j++){ 
                     System.out.print(" * "); 
                  } 
                  System.out.println(); 
                } 
              break; 
             } 
             case 2:{ 
                 System.out.println("Ingrese las dimensiones"); 
                 dimension=lector.nextInt(); 
                 for(int i=1;i<=dimension;i++){ 
                   for(int j=1;j<=dimension-i;j++){ 
                   System.out.print(""); 
                   } 
                  for(int k=1;k<=2*i-1;k++){ 
                   System.out.print(" * "); 
                  } 
                  System.out.println(); 
                 } 
              break; 
             } 
             case 3:{ 
                System.out.println("Ingrese las dimensiones"); 
                dimension=lector.nextInt(); 
                for(int i=0;i<dimension;i++){ 
                 for(int j=0;j<dimension;j++){ 
                  if(i==0 || i==dimension-1 || j==0 || j==dimension-1){ 
                      System.out.print("*" ); 
                  }else{ 
                    System.out.print(" "); 
                  } 
  
                 } 
                 System.out.println(); 
                } 
               break; 
             } 
             case 4:{ 
                System.out.println("Ingrese las dimensiones"); 
                dimension=lector.nextInt(); 
  
                System.out.println("Ingrese el ancho"); 
                ancho=lector.nextInt(); 
  
                for(int i=0;i<dimension;i++){ 
                 for(int j=0;j<ancho;j++){ 
                   if(i==0 || i==dimension-1 || j==0 || j<ancho-1){ 
                     System.out.print("*" ); 
                   }else{ 
                     System.out.print(" "); 
  
                   } 
                 } 
                 System.out.println(); 
               } 
               break; 
               } 
               case 5:{ 
                System.out.println("Ingrese las dimensiones"); 
                dimension=lector.nextInt(); 
  
                 System.out.println("Ingrese numeros de filas"); 
                 Filas=lector.nextInt(); 
  
                 for(int i=0;i<dimension;i++){ 
                   for(int j=0;j<i;j++){ 
                     System.out.print(" "); 
                   } 
                   for(int k=0;k<Filas;k++){ 
                     System.out.print(" * "); 
                   } 
                   System.out.println(); 
                 } 
                 break; 
               } 
               case 6: { 
                System.out.println("Ingrese las dimensiones");
                dimension = lector.nextInt();
                
                for (int i = 1; i <= dimension; i++) {
                    for (int j = dimension; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            
            case 7: { 
                System.out.println("Ingrese la altura");
                int altura = lector.nextInt();
                System.out.println("Ingrese la base");
                int base = lector.nextInt();
            
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < base + i; j++) {
                        if (j >= i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            }
            
            case 8: { 
                System.out.println("Ingrese el radio horizontal");
                int radioH = lector.nextInt();
                System.out.println("Ingrese el radio vertical");
                int radioV = lector.nextInt();
            
                for (int i = -radioV; i <= radioV; i++) {
                    for (int j = -radioH; j <= radioH; j++) {
                        if ((j * j * radioV * radioV + i * i * radioH * radioH) <= (radioH * radioH * radioV * radioV)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            }
            
            case 9: { 
                System.out.println("Ingrese la altura");
                int altura = lector.nextInt();
            
                for (int i = 1; i <= altura; i++) {
                    for (int j = altura; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = altura - 1; i >= 1; i--) {
                    for (int j = altura; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            
            case 10: { 
                System.out.println("Ingrese el radio");
                int radio = lector.nextInt();
            
                for (int i = -radio; i <= radio; i++) {
                    for (int j = -radio; j <= radio; j++) {
                        if (i * i + j * j <= radio * radio) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
                
            }
            default:
            System.out.println("Fin del programa ");
  
               } 
            lector.close();
            } 
    
     } 
 

