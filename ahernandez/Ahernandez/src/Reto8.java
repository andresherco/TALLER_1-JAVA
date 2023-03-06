import java.util.Random;
import java.util.Scanner;

public class Reto8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        double precioTotal = 0;
        int cantidadProductos = 0;

        System.out.println("Bienvenido al Supermercado Noé");
        System.out.println("Ingrese los productos adquiridos:");

        boolean seguirComprando = true;
        while (seguirComprando) {
            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = sc.nextDouble();
            System.out.print("Ingrese la cantidad del producto: ");
            int cantidadProducto = sc.nextInt();

            precioTotal += precioProducto * cantidadProducto;
            cantidadProductos += cantidadProducto;

            System.out.print("¿Desea seguir comprando? (s/n): ");
            String respuesta = sc.next();
            seguirComprando = respuesta.equalsIgnoreCase("s");
        }

        double descuento = 0;
        String mensajeDescuento = "";

        int bolita = rnd.nextInt(4);
        switch (bolita) {
            case 0:
                descuento = precioTotal * 0.1;
                mensajeDescuento = "Obtuviste un 10% de descuento";
                break;
            case 1:
                descuento = precioTotal * 0.3;
                mensajeDescuento = "Obtuviste un 30% de descuento";
                break;
            case 2:
                descuento = precioTotal * 0.5;
                mensajeDescuento = "Obtuviste un 50% de descuento";
                break;
            case 3:
                descuento = precioTotal;
                mensajeDescuento = "Obtuviste tu compra gratis";
                break;
        }

        double valorFinal = precioTotal - descuento;

        System.out.println("Total de productos adquiridos: " + cantidadProductos);
        System.out.println("Valor total de la compra: $" + precioTotal);
        System.out.println("Bolita obtenida: " + bolita);
        System.out.println(mensajeDescuento);
        System.out.println("Valor a pagar: $" + valorFinal);

        System.out.print("Ingrese el valor con el que va a pagar: $");
        double valorPagado = sc.nextDouble();
        double cambio = valorPagado - valorFinal;
        System.out.println("Su cambio es: $" + cambio);

        System.out.println("Gracias por su compra en el Supermercado Noé");

        sc.close();
    }

}
