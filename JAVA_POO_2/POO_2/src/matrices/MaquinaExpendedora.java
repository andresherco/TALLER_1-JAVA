package matrices;

import java.util.Scanner;

public class MaquinaExpendedora {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[][] catalogoProductos = new String[4][4];

    // Llenar la máquina con los productos
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print("Ingrese el nombre del producto en la posición [" + i + "][" + j + "]: ");
            catalogoProductos[i][j] = sc.nextLine();
            System.out.print("Ingrese el precio del producto en la posición [" + i + "][" + j + "]: ");
            catalogoProductos[i][j] += " - " + sc.nextInt() + " pesos";
            sc.nextLine(); // Limpiar el buffer de entrada
        }
    }
    
    // Mostrar el catálogo de productos
    System.out.println("Catálogo de productos:");
    for (int fila = 0; fila < 4; fila++) {
        for (int columna = 0; columna < 4; columna++) {
            System.out.println(fila + "" + columna + ": " + catalogoProductos[fila][columna]);
        }
    }
    
    sc.close();
}


}