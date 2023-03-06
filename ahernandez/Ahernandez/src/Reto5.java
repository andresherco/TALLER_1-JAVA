import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();

       
        System.out.print("Ingresa tu apellido: ");
        String apellido = input.nextLine();

      
        System.out.println("Longitud del nombre: " + nombre.length());
        System.out.println("Longitud del apellido: " + apellido.length());

      
        System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
        System.out.println("Apellido en minúsculas: " + apellido.toLowerCase());

     
        String nombrecompleto = nombre + " " + apellido;
        System.out.println("Nombre completo: " + nombrecompleto);

      
        String iniciales = nombre.substring(0, 2);
        String nombrecompleto2 = iniciales + apellido;
        System.out.println("Nombre completo (iniciales): " + nombrecompleto2);

        input.close();
    }
}
