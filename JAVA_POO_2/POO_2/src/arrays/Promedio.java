package arrays;
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int numNotas = sc.nextInt();
        
        double[] notas = new double[numNotas];
        double sumaNotas = 0;
        
        for (int i = 0; i < numNotas; i++) {
            System.out.print("Ingrese el valor de la nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            sumaNotas += notas[i];
        }
        
        double promedio = sumaNotas / numNotas;
        
        System.out.println("El promedio de las notas es: " + promedio);
        
        if (promedio < 3) {
            System.out.println("Reprobaste");
        } else if (promedio >= 3 && promedio <= 4.0) {
            System.out.println("Pasaste raspando");
        } else {
            System.out.println("Aprobaste con buenos resultados");
        }
        
        sc.close();
    }
}

