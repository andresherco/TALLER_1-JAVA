import java.util.Scanner;
import java.util.Random;

public class Reto3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
                System.out.println("¡Bienvenido al juego del carisellazo!");
                    System.out.println("¿Qué eliges, cara o sello? (c/s)");
                        String eleccion = input.nextLine().toLowerCase();
        
                            if (eleccion.equals("c") || eleccion.equals("s")) {
                                int resultado = random.nextInt(2); // 0 para cara, 1 para sello
            
                                    if (resultado == 0) {
                                        System.out.println("¡Cayó cara!");
                                            if (eleccion.equals("c")) {
                                                  System.out.println("¡Ganaste!");
                                                        } else {
                                                              System.out.println("¡Perdiste!");
                                                                }
                                                                    } else {
                                                                        System.out.println("¡Cayó sello!");
                                                                             if (eleccion.equals("s")) {
                                                                                   System.out.println("¡Ganaste!");
                                                                                             } else {
                                                                                                       System.out.println("¡Perdiste!");
                                                                                                              }
                                                                                                                     }
                                                                                                                         } else {
                                                                                                                               System.out.println("Elección inválida. Debes elegir 'c' o 's'.");
                                                                                                                                      }

        input.close();
    }
}
