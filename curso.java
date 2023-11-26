/*
3 Alumnos y 3 notas
 * Redondear notas (4,9=4 y a partir del 5 redondear a numero mas próximo)
 * Media notas redondeadas
 * Numero de alumnos suspensos
 * Numero de alumnos aprobados
 * alumno con mayor nota
 */

import java.util.Scanner;
import java.text.DecimalFormat; //Librerias

public class curso {
    public static Scanner teclado=new Scanner(System.in); //Teclado general
    public static DecimalFormat df=new DecimalFormat("#.00"); //formato de dos decimales general
    static double[] notas=new double[3]; //Array genérico notas
    static String[] alumno=new String[3]; //Array genérico alumnos

    public static void introduccion(){
        for (int i = 0; i < 3; i++) { //almacenar nombres y notas
            System.out.print("Introduce el nombre del alumno: ");
            alumno[i]=teclado.nextLine();
            System.out.print("Introduce la nota del alumno: ");
            notas[i]=teclado.nextDouble();
            
                teclado.nextLine(); //almacenar enter
        }
    }

    public static void redondear(){ //redondear notas
        for (int a = 0; a<3; a++) {
            if (notas[a]<5) {
                System.out.println("\n"+alumno[a]+" ha sacado un "+Math.floor(notas[a]));
                notas[a]=Math.floor(notas[a]); //Almacenar notas redondeadas en el array
            } else {
                System.out.println("\n"+alumno[a]+" ha sacado un "+Math.round(notas[a]));
                notas[a]=(double)Math.round(notas[a]);
            }
        }
        System.out.println("\nLa media de las 3 notas es: "+df.format((notas[0]+notas[1]+notas[2])/3)); //Imprimir media de las 3 notas redondeada a dos decimales
    }

    public static void aprobados(){
        int aprobados=0;
        int suspensos=0;

        //Calcular cuantos aprobados y suspensos hay
        for (int b = 0; b < 3; b++) {
            if (notas[b]>=5) {
            ++aprobados;
        }else{
            ++suspensos;
        }
        }
        System.out.println("\nHan aprobado un total de "+aprobados+" alumnos");
        System.out.println("Han suspendido un total de "+suspensos+" alumnos");
    }

    public static void maxNota(){
        int maxNota = 0;
        String alumnoMaxNota="";

        for (int c = 0; c<3; c++) {
            if (notas[c] > maxNota){
                maxNota = (int) notas[c];
                alumnoMaxNota = alumno[c];
            }
        }System.out.println("Alumno con mayor nota: "+alumnoMaxNota+" con un "+maxNota);
    }

    public static void main(String[] args) { //Funcion principal

        introduccion();
        redondear();
        aprobados();
        maxNota();
       
    }
}
