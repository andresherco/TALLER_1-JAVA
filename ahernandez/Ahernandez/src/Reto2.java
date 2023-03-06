import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
         
        Scanner lectura= new Scanner(System.in);


            System.out.println("ingrese el peso del bebe:   ");
                int pesoBb;
                    pesoBb = lectura.nextInt();

                    System.out.println("ingrese los mese del bebe:  ");
                        int mesesBb;
                            mesesBb = lectura.nextInt();

                                double resultado = (double)(pesoBb + 10) / (mesesBb * 10) *8;


                                    System.out.println("la dosis del bebe es de: " + resultado);

 lectura.close();




    }
    
}
