package co.edu.uniquindio.poo;

public class Empleado extends Persona{
    private String horario;

    public Empleado(String nombre, String apellido, String cedula, String telefono, String horario) {
        super(nombre, apellido, cedula, telefono);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + ", horario=" + horario + ", apellido=" + apellido + ", cedula=" + cedula
                + ", telefono=" + telefono;
    }

    
    
}
