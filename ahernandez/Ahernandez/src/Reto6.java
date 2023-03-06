import java.util.Random;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int dado1 = rand.nextInt(6) + 1;
        int dado2 = rand.nextInt(6) + 1;

        int total = dado1 + dado2;

        System.out.println("Lanzamiento de los dados: " + dado1 + " y " + dado2);
        System.out.println("Total: " + total);

        if (total == 2 || total == 12) {
            System.out.println("¡Craps! Has perdido.");
        } else if (total == 3 || total == 11) {
            System.out.println("¡Ganaste!");
        } else if (dado1 == 1 && dado2 == 1) {
            System.out.println("¡Ganaste!");
        } else if (total == 7) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Has perdido.");
        }

        sc.close();
    }
}
