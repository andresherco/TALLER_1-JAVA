package poo.retoCuatro;

import java.util.Scanner;

public class Ejecucion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Seleccione la figura geométrica a la cual desea calcular el área: ");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triángulo");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la medida del lado del cuadrado:");
                    double lado = sc.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado);
                    cuadrado.calcularArea();
                    break;
                case 2:
                    System.out.println("Ingrese la medida de la base del triángulo:");
                    double base = sc.nextDouble();
                    System.out.println("Ingrese la medida de la altura del triángulo:");
                    double altura = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(base, altura);
                    triangulo.calcularArea();
                    break;
                case 3:
                    System.out.println("Ingrese la medida de la base del rectángulo:");
                    double baseRec = sc.nextDouble();
                    System.out.println("Ingrese la medida de la altura del rectángulo:");
                    double alturaRec = sc.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(alturaRec, baseRec);
                    rectangulo.calcularArea();
                    break;
                case 4:
                    System.out.println("Ingrese la medida del radio del círculo:");
                    double radio = sc.nextDouble();
                    Circulo circulo = new Circulo(3.14, radio);
                    circulo.calcularArea();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        }
        
        sc.close();

    }

}