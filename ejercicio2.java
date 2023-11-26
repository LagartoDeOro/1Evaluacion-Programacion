import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        int a,b,c;
        a=0;
        b=0;
        c=0;
        Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la longitud del segmento A: ");
            a=teclado.nextInt();
            System.out.println("Ingrese la longitud del segmento B: ");
            b=teclado.nextInt();
            System.out.println("Ingrese la longitud del segmento C: ");
            c=teclado.nextInt();
        
        if(a+b>c && b+c>a && c+a>b){ //Teorema de la desigualdad del triángulo o desigualdad de Minkowski
            System.out.println("Se puede formar un triangulo!");
            float S=(a+b+c)/2f; //Formula de semiperímetro
            System.out.println("El semiperímetro del triángulo es: " + S);
            double Heron= Math.sqrt(S*(S-a)*(S-b)*(S-c)); //Formula de Herón
            float area=(float) Heron;
            System.out.println("El area del triangulo es: "+ area);
        }else{
            System.out.println("Error, no se puede formar un triangulo");
        }
    }
}