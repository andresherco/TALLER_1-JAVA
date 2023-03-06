import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {


Scanner lectura = new Scanner(System.in);
System.out.println("ingrese un numero ");
int numberOne ;
numberOne = lectura.nextInt();


System.out.println("ingrese un segundo numero ");
int numberTwo ;
numberTwo = lectura.nextInt();
lectura.nextLine();

System.out.println("ingrese su nombre");
String name;
name = lectura.nextLine();


System.out.println("Hola  " +name +" ,los numeros ingresados fueron "+ numberOne + " y "+ numberTwo + ". El resultado de la sumatoria de los dos numeros es:   "+ (numberOne+numberTwo)     );

lectura.close();


//EJERCICIO REALIZADO PRO ANDRES FELIPE HERNANDEZ CORREDOR 08/02/2023


    }
}
