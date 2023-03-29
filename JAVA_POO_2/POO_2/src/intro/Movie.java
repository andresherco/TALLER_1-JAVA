package intro;

import java.util.Scanner;

public class Movie {
    // Atributos
    private Scanner lectura = new Scanner(System.in);
    private String name;
    private int duration;
    String category;
    public String director;

    // Metodo constructor
    public Movie() {

    }

    public Movie(String name, int duration, String category, String director) {
        this.name = name;
        this.duration = duration;
        this.category = category;
        this.director = director;
    }

    // Metodos
    public void addMovie() {
        System.out.println("|| FORMULARIO DE PELICULA ||");
        System.out.println("Ingrese el nombre de la pelicula: ");
        name = lectura.nextLine();

        System.out.println("Ingrese la duracion de la pelicula: ");
        duration = lectura.nextInt();

        System.out.println("Ingrese la categoria de la pelicula: ");
        category = lectura.next();

        System.out.println("Ingrese el director de la pelicula:  ");
        director = lectura.next();
    }

    public void changeCategory() {
        System.out.println("|| ACTUALIZACION DE CATEGORIA DE LA PELICULA ||");
        System.out.println("Ingrese la categoria de la pelicula a la cual quiere cambiar: ");
        category = lectura.next();

        System.out.println("La categoria a la cual se cambio fue:  " + category);
    }

    public void addCredits() {
        System.out.println("|| ACTUALIZACION DE MINUTOS  ");
        int durationAct = duration + 15;
        System.out.println("Se aumento 15 minutos a la duracion de la pelicula:  " + durationAct);

    }

    public void showMovie() {
        System.out.println("|| DATOS LA DE PELICULA ||");
        System.out.println("Nombre de la pelicula: " + name);
        System.out.println("La duracion de la pelicula es: " + duration);
        System.out.println("La categoria de la pelicula es: " + category);
        System.out.println("El director de la pelicula es: " + director);
    }
}
