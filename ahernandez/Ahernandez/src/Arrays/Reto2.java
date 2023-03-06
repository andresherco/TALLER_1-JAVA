package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Reto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de competidores: ");
        int numCompetidores = scanner.nextInt();

        String[] nombres = new String[numCompetidores];
        double[] tiempos = new double[numCompetidores];

        for (int i = 0; i < numCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor " + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Ingrese el tiempo del competidor " + (i + 1) + " (en segundos): ");
            tiempos[i] = scanner.nextDouble();
        }

        // Ordenar los tiempos de menor a mayor
        Arrays.sort(tiempos);

        System.out.println("Resultados:");
        for (int i = 0; i < numCompetidores; i++) {
            System.out.println(nombres[i] + ": " + tiempos[i] + " segundos");
        }

        // El ganador es el nadador con el tiempo más bajo
        System.out.println("El ganador es " + nombres[0] + " con un tiempo de " + tiempos[0] + " segundos.");

        scanner.close();
    }
}
