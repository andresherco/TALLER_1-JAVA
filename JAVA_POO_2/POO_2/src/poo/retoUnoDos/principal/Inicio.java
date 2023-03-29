package poo.retoUnoDos.principal;

import poo.retoUnoDos.salud.Persona;

public class Inicio {
  public static void main(String[] args) {
    Persona primeraPersona = new Persona();
    primeraPersona.pedirDatos();
    primeraPersona.mostrarPersona();

    String indiceMasaCorporal = primeraPersona.calcularImc();
    if (indiceMasaCorporal.equals("PESOBAJO")) {
      System.out.println("El peso está por debajo de lo ideal");
    } else if (indiceMasaCorporal.equals("PESOIDEAL")) {
      System.out.println("El peso es ideal");
    } else {
      System.out.println("Tiene sobrepeso");
    }

    if (primeraPersona.mayorEdad()) {
      System.out.println("Es mayor de edad");
    } else {
      System.out.println("Es menor de edad");
    }
  }
}
