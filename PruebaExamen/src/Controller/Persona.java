package Controller;
public class Persona {
    String nombre, cargo;
    int edad;
    double salario;

    public Persona(String nombre, String cargo, int edad, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.edad = edad;
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return String.format("\nNombre: %s\n Cargo: %s\n Edad: %d\n Salario: %.2f\n", nombre, cargo, edad, salario);
    }
    
}
