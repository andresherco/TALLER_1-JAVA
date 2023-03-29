package poo.retoCuatro;

public class Circulo extends Figura {

    private double pi = 3.14;
    private double radio;

    // Constructor
    public Circulo(double pi, double radio) {
        this.pi = pi;
        this.radio = radio;
    }

    // Métodos getter y setter
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea() para calcular el área del cuadrado
    @Override
    public void calcularArea() {
        double radioElevado = radio * radio;
        double area = pi * radioElevado;
        System.out.println("El área del cuadrado es: " + area);
    }
}