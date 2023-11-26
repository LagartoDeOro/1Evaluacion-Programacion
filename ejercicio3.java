import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        int edad;
        double precio;
        double descuento;
        double costeFinal;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        edad=teclado.nextInt();
        System.out.println("Introduce el precio de las medicinas: ");
        precio = teclado.nextInt();

        if (edad >= 65){
            descuento=precio*0.2;
            costeFinal=precio-descuento;
            System.out.println("El precio final aplicando el 20% de descuento se queda en: " + costeFinal);
        }else if(edad<10){
            descuento=precio*0.15;
            costeFinal=precio-descuento;
            System.out.println("El precio final aplicando el 15% de descuento se queda en: " + costeFinal);

        }else{
            descuento=precio*0.10;
            costeFinal=precio-descuento;
            System.out.println("El precio final aplicando el 10% de descuento se queda en: " + costeFinal);

        }
        


    }
}