package intro;

public class Inicio {
    public static void main(String[] args) {
        Persona personaUno = new Persona("Jose", "Jimenez", 123456456, "Masculino", 15);
        personaUno.mostraPersona();
        Persona personaDos = new Persona("Cesar", "Montealegre", 215646845, "Masculino", 15);
        personaDos.mostraPersona();
    }
}
