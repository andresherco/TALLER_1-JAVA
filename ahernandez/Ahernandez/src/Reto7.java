import java.util.Random;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido a la promoción de aniversario de Supermercados Noé!");

        System.out.print("Ingrese el valor total de su compra: ");
        int valorCompra = sc.nextInt();

        if (valorCompra > 50000) {
            int bolita = rand.nextInt(4);

            switch (bolita) {
                case 0:
                    double descuento1 = valorCompra * 0.1;
                    double total1 = valorCompra - descuento1;
                    System.out.println("¡Ha ganado un 10% de descuento!");
                    System.out.println("Valor de descuento: $" + descuento1);
                    System.out.println("Valor total a pagar: $" + total1);
                    break;
                case 1:
                    double descuento2 = valorCompra * 0.3;
                    double total2 = valorCompra - descuento2;
                    System.out.println("¡Ha ganado un 30% de descuento!");
                    System.out.println("Valor de descuento: $" + descuento2);
                    System.out.println("Valor total a pagar: $" + total2);
                    break;
                case 2:
                    double descuento3 = valorCompra * 0.5;
                    double total3 = valorCompra - descuento3;
                    System.out.println("¡Ha ganado un 50% de descuento!");
                    System.out.println("Valor de descuento: $" + descuento3);
                    System.out.println("Valor total a pagar: $" + total3);
                    break;
                case 3:
                    System.out.println("¡Ha ganado una compra gratis!");
                    System.out.println("Valor total a pagar: $0");
                    break;
            }
        } else {
            System.out.println("Lo siento, su compra no califica para la promoción.");
        }

        sc.close();
    }
}
