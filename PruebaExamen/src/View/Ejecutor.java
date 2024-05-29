package View;
import Controller.Empresa;
import Controller.Persona;
import java.util.ArrayList;
public class Ejecutor {
    public static void main(String[] args) {
        ArrayList <Persona> personas1 = new ArrayList<>();
        ArrayList <Persona> personas2 = new ArrayList<>();
        ArrayList <Empresa> empresas = new ArrayList<>();
        personas1.add(new Persona("Pedro", "Cocinero", 45, 1200));
        personas1.add(new Persona("Mario", "Guardia", 27, 800));
        personas1.add(new Persona("Jesus", "Cocinero", 32, 1800));
        personas1.add(new Persona("Bonifasio", "Mesero", 22, 400));
        personas2.add(new Persona("Bob", "Secretario", 25, 1200));
        personas2.add(new Persona("Maria", "CEO", 45, 5000));
        personas2.add(new Persona("Sofia", "Mecanico", 30, 3500));
        personas1.add(new Persona("Patricio", "CEO", 65, 2500));
        Empresa empresa1 = new Empresa("Fulanitos", "Av.30 de julio", "Comida Rapida", 30000, personas1);
        Empresa empresa2 = new Empresa("Bonifacios", "Calle San bonifacio", "Vehiculos", 500000, personas2);
        empresas.add(empresa1);
        empresas.add(empresa2);
        for(Empresa empresa: empresas){
            System.out.println(empresa);
            System.out.println("Salario Promedio de "+ empresa.getNombre() + ": " + empresa.salarioPromedio());
            System.out.println("Edad Promedio de empleados en " + empresa.getNombre() + ": " + empresa.edadPromedio());
            System.out.println("Con un aumento del 10% a los empleados con salario menor al salario promedio");
            empresa.aumentoDeSueldo();
            System.out.println(empresa);
            System.out.println("Salario Promedio de "+ empresa.getNombre() + ": " + empresa.salarioPromedio());
            System.out.println("Edad Promedio de empleados en " + empresa.getNombre() + ": " + empresa.edadPromedio());
            
        }
    }
}
