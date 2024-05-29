package Controller;

import java.util.ArrayList;

public class Empresa {

    String nombre, ubicacion, tipoVenta;
    double presupuesto;
    ArrayList<Persona> personas;

    public Empresa(String nombre, String ubicacion, String tipoVenta, double presupuesto, ArrayList<Persona> personas1) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipoVenta = tipoVenta;
        this.presupuesto = presupuesto;
        this.personas = personas1;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public double salarioPromedio() {
        double salarios = 0;
        for (Persona persona : personas) {
            salarios += persona.getSalario();
        }
        return personas.isEmpty() ? 0 : salarios / personas.size();
    }

    public void aumentoDeSueldo() {
        double salarioPromedio = salarioPromedio();
        double nuevoSalario = 0;
        for (Persona persona : personas) {
            if (persona.getSalario() < salarioPromedio) {
                nuevoSalario = persona.getSalario()* 1.10;
                persona.setSalario(nuevoSalario);
            }
        }
    }
    public double edadPromedio() {
        double edades = 0;
        for (Persona persona : personas){
            edades += persona.getEdad();
        }
        return personas.isEmpty() ? 0 : edades / personas.size();
    }

    @Override
    public String toString() {
        return String.format("---Empresa---\n Nombre %s\n Ubicacion: %s\n Tipo de venta: %s\n Presupuesto %.2f\n ---Empleados--- \n%s", nombre, ubicacion, tipoVenta, presupuesto, personas);
    }
}
