import java.util.Scanner;

public class Reto1 {
   

    public static void main(String[] args) {
        
        Scanner lectura= new Scanner(System.in);

            System.out.println("Ingrese los grados Fahrenheit");
                int Fahrenheit;
                    Fahrenheit = lectura.nextInt();


                        System.out.println("los grados Fahrenheit a Centigrados son:   " + (Fahrenheit-32 )/1.8 + "°C"   );

lectura.close();



    }





    
}

