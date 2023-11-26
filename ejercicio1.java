import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        float media;
        float x;
        float y;
        float z;
        System.out.println("Escribe la nota del primer examen: ");
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextFloat();
        System.out.println("Escribe la nota del segundo examen: ");
        y = teclado.nextFloat();
        System.out.println("Escribe la nota del tercer examen: ");
        z = teclado.nextFloat();
        media=(float)((((x+y+z)/3)*0.8)+2);
        System.out.print("La nota final del alumno es: " + media + " ");

        if (media>=9) {
            System.out.print("Sobresaliente");
        if(media>=9.6){
                System.out.print(" con Matrícula de Honor");
            }
        }else if(media>=7 && media<=8.99){
            System.out.print("Notable");
        }else if(media>=5 && media <=6.99){
            System.out.print("Aprobado");
        }else if(media<=4.99){
            System.out.print("Suspenso");
        }
    }
}
