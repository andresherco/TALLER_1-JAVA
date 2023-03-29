package intro;

import java.util.Scanner;

public class Animal {
    // Atributos
    private String nombre;
    private int edad;
    private Scanner lectura = new Scanner(System.in);

    // Metodo Constructor
    public Animal() {

    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos accesores GETTER / SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodos
    public void registrarAnimal() {
        // Cuerpo método

        System.out.println("Ingrese el nombre del animal:");
        nombre = lectura.nextLine();

        System.out.println("Ingrese la edad del animal:");
        edad = lectura.nextInt();
    }

    public void mostrarAnimal() {
        System.out.println("El nombre del animal es: " + nombre + " y su edad es " + edad);
    }
}