package poo.retoTres;

public class Empleado extends Persona {
private String nombreCargo;
private double valorHoraTrabajo;
private int horasTrabajadas;
private String departamento;

public Empleado(String tipoDoc, String documento, String nombre, String apellido, String cargo, double valorHoraTrabajo, int horasTrabajadas, String departamento) {
    super(tipoDoc, documento, nombre, apellido);
    this.nombreCargo = cargo;
    this.valorHoraTrabajo = valorHoraTrabajo;
    this.horasTrabajadas = horasTrabajadas;
    this.departamento = departamento;
}

public String getNombreCargo() {
    return nombreCargo;
}

public void setNombreCargo(String nombreCargo) {
    this.nombreCargo = nombreCargo;
}

public double getValorHoraTrabajo() {
    return valorHoraTrabajo;
}

public void setValorHoraTrabajo(double valorHoraTrabajo) {
    this.valorHoraTrabajo = valorHoraTrabajo;
}

public int getHorasTrabajadas() {
    return horasTrabajadas;
}

public void setHorasTrabajadas(int horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
}

public String getDepartamento() {
    return departamento;
}

public void setDepartamento(String departamento) {
    this.departamento = departamento;
}

public double calcularHonorarios() {
    double honorarios = valorHoraTrabajo * horasTrabajadas * (1 - 0.00966);
    return honorarios;
}

public void imprimirDatos() {
    System.out.println("Tipo de documento: " + getTipoDocumento());
    System.out.println("Número de documento: " + getDepartamento());
    System.out.println("Nombre: " + getNombreCargo());
    System.out.println("Apellido: " + getApellidos());
    System.out.println("Cargo: " + nombreCargo);
    System.out.println("Horas trabajadas: " + horasTrabajadas);
    System.out.println("Valor por hora: " + valorHoraTrabajo);
    System.out.println("Total a pagar: " + calcularHonorarios());
}

}
