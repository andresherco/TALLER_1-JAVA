package Matrices;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] productos = new String[16][2];
        int opcion;

        
        System.out.println("Ingrese el nombre y precio de los 16 productos: ");
        for (int i = 0; i < productos.length; i++) {
            System.out.print("Producto " + (i + 1) + " nombre: ");
            productos[i][0] = input.nextLine();
            System.out.print("Producto " + (i + 1) + " precio: ");
            productos[i][1] = input.nextLine();
        }

        
        System.out.println("Catalogo de productos:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Codigo: " + i + " Producto: " + productos[i][0] + " Precio: " + productos[i][1]);
        }


        input.close();
    }
}

