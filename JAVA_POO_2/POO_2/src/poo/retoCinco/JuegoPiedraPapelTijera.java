package poo.retoCinco;
import java.util.Scanner;

public class JuegoPiedraPapelTijera implements Juego {
  private int jugadorPuntos;
  private int computadoraPuntos;
  private Scanner scanner;

  public JuegoPiedraPapelTijera() {
      jugadorPuntos = 0;
      computadoraPuntos = 0;
      scanner = new Scanner(System.in);
  }

  @Override
  public void iniciar() {
      System.out.println("Bienvenido al juego de piedra, papel o tijera.");
      System.out.println("El juego consiste en ganar tres rondas seguidas.");

      while (jugadorPuntos < 3 && computadoraPuntos < 3) {
          jugar();
      }

      finalizar();
  }

  @Override
  public void jugar() {
      System.out.println("Elije una opción:");
      System.out.println("1. Piedra");
      System.out.println("2. Papel");
      System.out.println("3. Tijera");

      int opcionJugador = scanner.nextInt();
      int opcionComputadora = (int) (Math.random() * 3) + 1;

      System.out.println("La computadora eligió: " + opcionComputadora);

      if (opcionJugador == opcionComputadora) {
          System.out.println("Empate.");
      } else if ((opcionJugador == 1 && opcionComputadora == 3) || 
                 (opcionJugador == 2 && opcionComputadora == 1) || 
                 (opcionJugador == 3 && opcionComputadora == 2)) {
          System.out.println("Ganaste la ronda.");
          jugadorPuntos++;
          computadoraPuntos = 0;
      } else {
          System.out.println("Perdiste la ronda.");
          computadoraPuntos++;
          jugadorPuntos = 0;
      }
  }

  @Override
  public void finalizar() {
      if (jugadorPuntos == 3) {
          System.out.println("¡Felicidades, ganaste el juego!");
      } else {
          System.out.println("Lo siento, perdiste el juego.");
      }
  }

  public static void main(String[] args) {
      Juego juego = new JuegoPiedraPapelTijera();
      juego.iniciar();
  }
}