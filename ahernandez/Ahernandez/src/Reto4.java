import java.util.Scanner;
import java.util.Random;

public class Reto4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijera!");
        System.out.println("¿Cuál es tu elección? (piedra/papel/tijera)");
        String eleccion = input.nextLine().toLowerCase();
        
        int eleccionMaquina = random.nextInt(3); // 0 para piedra, 1 para papel, 2 para tijera
        String eleccionMaquinaStr = "";
        
        switch (eleccionMaquina) {
            case 0:
                eleccionMaquinaStr = "piedra";
                break;
            case 1:
                eleccionMaquinaStr = "papel";
                break;
            case 2:
                eleccionMaquinaStr = "tijera";
                break;
        }
        
        System.out.println("La máquina ha elegido " + eleccionMaquinaStr + ".");
        
        if (eleccion.equals(eleccionMaquinaStr)) {
            System.out.println("¡Es un empate!");
        } else if (eleccion.equals("piedra")) {
            if (eleccionMaquinaStr.equals("papel")) {
                System.out.println("¡La máquina gana!");
            } else {
                System.out.println("¡Tú ganas!");
            }
        } else if (eleccion.equals("papel")) {
            if (eleccionMaquinaStr.equals("tijera")) {
                System.out.println("¡La máquina gana!");
            } else {
                System.out.println("¡Tú ganas!");
            }
        } else if (eleccion.equals("tijera")) {
            if (eleccionMaquinaStr.equals("piedra")) {
                System.out.println("¡La máquina gana!");
            } else {
                System.out.println("¡Tú ganas!");
            }
        } else {
            System.out.println("Elección inválida. Debes elegir piedra, papel o tijera.");

            input.close();
        }
    }
}
