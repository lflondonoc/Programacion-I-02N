package co.edu.uniquindio.poo;

public class Empleado extends Persona{
    private double salario;

    public Empleado(String nombre, String cedula, String edad, double salario) {
        super(nombre, cedula, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", salario=" + salario + ", cedula=" + cedula + ", edad=" + edad + "]";
    }

    
    
}
