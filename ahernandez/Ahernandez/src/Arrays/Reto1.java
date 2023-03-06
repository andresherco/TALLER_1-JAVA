package Arrays;

import java.util.Scanner;
import java.util.Random;

public class Reto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int valorGlobal = 100;
        int valorGanado = 0;
        int contador = 0;
        boolean jugar = true;

        while (jugar) {
            System.out.println("Ingrese su apuesta:");
            int apuesta = input.nextInt();
            contador++;

            int moneda = rand.nextInt(2); 

            System.out.println("La moneda cayó en: " + (moneda == 0 ? "cara" : "sello"));

            if ((moneda == 0 && apuesta == 0) || (moneda == 1 && apuesta == 1)) {
                valorGanado += apuesta;
                valorGlobal += apuesta;
                apuesta *= 2;
                System.out.println("Ganaste! Tu ganancia es: " + apuesta);
            } else {
                valorGlobal -= apuesta;
                System.out.println("Perdiste. Tu apuesta se ha restado del valor global.");
            }

            System.out.println("¿Desea seguir jugando? (S/N)");
            String respuesta = input.next();

            if (respuesta.equalsIgnoreCase("N")) {
                jugar = false;
            }
        }

        System.out.println("Has jugado " + contador + " veces y acumulaste " + valorGanado + " de ganancia.");

        input.close();
    }
}
