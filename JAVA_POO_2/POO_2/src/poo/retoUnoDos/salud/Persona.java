package poo.retoUnoDos.salud;
import java.util.Scanner;

public class Persona {
private String tipoDocumento;
private int numeroDocumento;
private String nombre;
private String apellido;
private double peso;
private double estatura;
private int edad;
private String sexo;

public void pedirDatos() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el tipo de documento: ");
    this.tipoDocumento = sc.nextLine();
    System.out.print("Ingrese el número de documento: ");
    this.numeroDocumento = sc.nextInt();
    sc.nextLine(); // Limpiar el buffer de entrada
    System.out.print("Ingrese el nombre: ");
    this.nombre = sc.nextLine();
    System.out.print("Ingrese el apellido: ");
    this.apellido = sc.nextLine();
    System.out.print("Ingrese el peso en kg: ");
    this.peso = sc.nextDouble();
    System.out.print("Ingrese la estatura en m: ");
    this.estatura = sc.nextDouble();
    System.out.print("Ingrese la edad: ");
    this.edad = sc.nextInt();
    sc.nextLine(); // Limpiar el buffer de entrada
    System.out.print("Ingrese el sexo: ");
    this.sexo = sc.nextLine();
    sc.close();
}

public void mostrarPersona() {
    System.out.println("Tipo de documento: " + this.tipoDocumento);
    System.out.println("Número de documento: " + this.numeroDocumento);
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Apellido: " + this.apellido);
    System.out.println("Peso: " + this.peso + " kg");
    System.out.println("Estatura: " + this.estatura + " m");
    System.out.println("Edad: " + this.edad);
    System.out.println("Sexo: " + this.sexo);
}



public String calcularImc() {
    double pesoActual = peso / Math.pow(estatura, 2);
    if (pesoActual < 20) {
        return "PESOBAJO";
    } else if (pesoActual >= 20 && pesoActual <= 25) {
        return "PESOIDEAL";
    } else {
        return "SOBREPESO";
    }
}


public boolean mayorEdad() {
    return edad >= 18;
}
}