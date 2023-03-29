package poo.retoCuatro;


public class Rectangulo extends Figura {

    private double altura;
    private double base;

    // Constructor
    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    // Métodos getter y setter
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Implementación del método calcularArea() para calcular el área del rectangulo
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El área del cuadrado es: " + area);
    }
}