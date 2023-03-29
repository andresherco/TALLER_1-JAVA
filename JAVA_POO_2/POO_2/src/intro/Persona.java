package intro;

public class Persona {
    
    //Atributos
    String nombre , apellido , genero;
    int edad , idpersona;
    
    
    public Persona(){
    }


    public Persona(String nombre, String apellido, int idpersona, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idpersona = idpersona;
        this.genero = genero;
        this.edad = edad;
    }

    //Metodos

    public void mostraPersona(){
        System.out.println("El nombre suyo es: " + nombre + " y ");
    }
}
