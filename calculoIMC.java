/* *********************************
 * Author: Eduardo Jimenez Linares *
 * 03/11/2023                      *
 * *********************************/

import java.util.Scanner;
import java.text.DecimalFormat;

public class calculoIMC {
    public static Scanner sc=new Scanner(System.in);
    public static DecimalFormat df=new DecimalFormat("#.00");

    public static float valor_peso(){
        float peso;
        System.out.print("Inserte su peso corporal: ");
        return peso=sc.nextFloat();
    }

    public static double valor_altura() {
        double altura;
        System.out.print("Inserte su altura: ");
        return altura=sc.nextDouble();
    }
    public static double formula(double peso, double altura) {
        return peso/(Math.pow(altura, 2));
        
    }


    public static void main(String[] args) {
        System.out.println(formula(valor_peso(), valor_altura())); 
    }
    
}
/*IMC=peso/(altura^2)
<18.5           Bajo peso
18.5 - 24.9     Normal
25.0 - 29.9     Sobrepeso
30.0 - 34.9     Obesidad grado 1
35.0 - 39.9     Obesidad grado 2
>40             Obesidad grado 3
*/