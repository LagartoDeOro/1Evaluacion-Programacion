/* *********************************
 * Author: Eduardo Jimenez Linares *
 * 23/11/2023                      *
 * *********************************/

import java.util.Scanner;

public class Tarea_obligatoria_tema_3 {

    public static Scanner teclado=new Scanner(System.in); /*Declaro Scanner como global para que no tenga problemas a la hora de tener que cerrar el teclado*/

    

    // Método para imprimir el árbol de Navidad
    public static void imprimirArbol(int altura, String dibujo) {
        int centrado = altura + 40;
    
        // Imprimir el árbol
        for (int i = 0; i < altura; i++) {
            // Imprimir espacios en blanco antes de los asteriscos para centrar
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < centrado; j++) {
                System.out.print(" ");
            }
    
            // Imprimir dibujos
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(dibujo);
            }
    
            System.out.println(); // Salto de línea después de cada fila
        }
    
        // Calcular la cantidad de espacios para centrar el tronco
            int espaciosTronco = centrado + altura - 2;
        
        // Imprimir el tronco
        double copaArbol = (altura*2)-1;
        double anchoTronco=copaArbol/3; //El ancho del tronco es 1/3 el ancho de la copa del arbol
        double alturaTronco=altura/3;

        alturaTronco = (int) Math.ceil(alturaTronco); //La altura del tronco la redondea a la unidad base y me lo almacena en un int


        //Imprimir el tronco
        for (int i = 0; i <= alturaTronco; i++) {
            for (int j = 0; j < espaciosTronco - (anchoTronco / 2) + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < anchoTronco; j++) {
                System.out.print(dibujo);
            }
            System.out.println();
        }  
    } 
        
        //Menu para que el usuario decida si quiere seguir imprimiendo arboles o no
        public static void menu() {
            boolean opcion = true;
            int alto = 0;
            String dibujo = "*";
            String sino = "";
        
            while (opcion) {
                System.out.print("Introduce la altura de la copa: ");
                alto = teclado.nextInt();
                teclado.nextLine();
                System.out.print("\nInserte el símbolo de relleno: ");
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
        
        //con la funcion y el proceso creados anteriormente, el main solo ocupa una línea, llamando al proceso de arriba
    public static void main(String[] args) {
        menu(); 
    }
}
