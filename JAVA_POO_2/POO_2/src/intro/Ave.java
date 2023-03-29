package intro;

public class Ave extends Animal {
    // Atributos
    private float envergadura;


    //Constructor
    public Ave() {

    }

    public Ave(float envergadura) {
        this.envergadura = envergadura;
    }

    public Ave(String nombre, int edad, float envergadura) {
        super(nombre, edad);
        this.envergadura = envergadura;
    }

    //Metodo 
    public void mostrarAve(){
        System.out.println("El nombre del animal es " + getNombre() + "tiene " + getEdad() + " y el tamaño de su envergadura es " + this.envergadura);
    }
}
