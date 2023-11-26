/*PENDIENTES:
-INDIFERENCIA MAYUSCULAS Y MINUSCULAS 
-Añadir por usuario la cantidad de numeros a calcular en a las funciones
 */
import java.util.Scanner;
public class calculadora {
    public static void calculator(){
        String opcion;
        Scanner teclado1=new Scanner(System.in);
            menu();
        opcion=teclado1.nextLine();
        
        switch (opcion) {
            case "Sumar":
                sumar(0,0);
                break;
            case "Restar":
                restar(0,0);
                break;
            case "Multiplicar":
                multiplicar(0,0);
                break;
            case "Dividir":
                dividir(0,0);
                break;
            case "Cuadrado":
                cuadrado(0);
                break;
            case "Raiz cuadrada":
                raiz(0);
                break;
            case "Moneda de cambio":
                moneda_cambio();
                break;                                                
        
            default:
            System.out.println("\nError al introducir opcion");
                break;
        }
    }
    public static void menu(){
        System.out.println("---CALCULADORA----");
        System.out.println("Elige una opcion:");
        System.out.println("Sumar");
        System.out.println("Restar");
        System.out.println("Multiplicar");
        System.out.println("Dividir");
        System.out.println("Cuadrado");
        System.out.println("Raiz cuadrada");
        System.out.println("Moneda de cambio (Euros y pesetas)");
        System.out.println("\n");
    }
    public static void sumar(int a, int b){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        a=teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        b=teclado.nextInt();
        System.out.println("\nEl resultado de sumar los dos numeros es: "+(a+b));
    }
    public static void restar(int a, int b){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        a=teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        b=teclado.nextInt();
        System.out.println("\nEl resultado de restar los dos numeros es: "+(a-b));
    }
    public static void multiplicar(int a, int b){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        a=teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        b=teclado.nextInt();
        System.out.println("\nEl resultado de multiplicar los dos numeros es: "+(a*b));
    }
    public static void dividir(float a, float b){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        a=teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        b=teclado.nextInt();
        System.out.println("\nEl resultado de dividir los dos numeros es: "+(a/b));
    }
    public static void cuadrado(int a){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        a=teclado.nextInt();
        System.out.println("\nEl cuadrado de "+a+" es: "+(a*a));
    }
    public static void raiz(int a){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        a=teclado.nextInt();
        System.out.println("\nLa raiz de "+a+" es: "+ Math.sqrt(a));
    }
    public static void moneda_cambio(){
        Scanner teclado=new Scanner(System.in);
        int opcion1;
        System.out.println("Pulse 1 para cambiar de euros a pesetas: ");
        System.out.println("Pulse 2 para cambiar de pesetas a euros: ");
        opcion1=teclado.nextInt();
        switch (opcion1) {
            case 1:
                float euros=0f;
                System.out.print("Introduce la cantidad de euros: ");
                euros=teclado.nextFloat();
                System.out.println("\nLa cantidad de pesetas que hay en "+euros+" euros son: "+(euros*166.386)+" pesetas");
                break;
            case 2:
                float pesetas=0f;
                System.out.print("Introduce la cantidad de pesetas: ");
                pesetas=teclado.nextFloat();
                System.out.println("\nLa cantidad de euros que hay en "+pesetas+" pesetas son: "+(pesetas/166.386)+" euros");
                break;
            default:
            System.out.println("\nError al introducir opcion");
                break;
        }

    }
    public static void main(String[]args){
        boolean continuar=true;
        Scanner teclado2=new Scanner(System.in);
        
        while (continuar) {
            calculator();
            System.out.print("¿Desea continuar?");
            continuar=teclado2.nextBoolean();
        }
        System.out.println("¡Adios!");
    }
}
