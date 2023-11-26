/* *********************************
 * Author: Eduardo Jimenez Linares *
 * 23/11/2023                      *
 * *********************************/

import java.util.Scanner;
public class arbolNavidad {
    public static Scanner teclado=new Scanner(System.in);

    

    // Método para imprimir el árbol de Navidad
    public static void imprimirArbol(int altura, String dibujo) {
        int centrado=altura+40;
        for (int i = 0; i < altura; i++) {
            // Imprimir espacios en blanco antes de los asteriscos para centrar
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }for (int j = 0; j < centrado; j++) {
                    System.out.print(" ");
                }

            // Imprimir dibujos
            
            for (int k = 0; k < 2 * i + 1; k++) {
                
                System.out.print(dibujo);
            }

            System.out.println(); // Salto de línea después de cada fila
        }

        // Calcular la cantidad de espacios para centrar el tronco
        int espaciosTronco;
        espaciosTronco=centrado+altura-2;
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < espaciosTronco; j++) {
                System.out.print(" ");
            }
            System.out.println(dibujo+dibujo+dibujo);
            
        }
        
    }
        
        public static void menu() {
            boolean opcion = true;
            int alto = 0;
            String dibujo = "*";
            String sino = "";
        
            while (opcion) {
                System.out.print("Introduce la altura del arbol: ");
                alto = teclado.nextInt();
                teclado.nextLine();
                System.out.print("\nCon qué quieres dibujar el arbol? ");
                dibujo = teclado.nextLine();
                imprimirArbol(alto, dibujo);
                System.out.println("Quiere seguir?");
                sino = teclado.nextLine();
                sino = sino.toLowerCase();
                if (sino.equals("no")) {
                    System.out.println("Adios");
                    break;
                }
            }
        }
        
    public static void main(String[] args) {
        menu(); 
    }
}