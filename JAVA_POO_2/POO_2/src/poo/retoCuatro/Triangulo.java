package poo.retoCuatro;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos getter y setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Implementación del método calcularArea() para calcular el área del triángulo
    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}