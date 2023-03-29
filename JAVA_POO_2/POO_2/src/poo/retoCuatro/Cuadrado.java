package poo.retoCuatro;

public class Cuadrado extends Figura {

    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Métodos getter y setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Implementación del método calcularArea() para calcular el área del cuadrado
    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }
}