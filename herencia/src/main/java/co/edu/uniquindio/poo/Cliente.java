package co.edu.uniquindio.poo;

public class Cliente extends Persona{
    private String correo;

    public Cliente(String nombre,String cedula, String edad, String correo){
        super(nombre, cedula, edad);
        this.correo=correo;

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", correo=" + correo + ", cedula=" + cedula + ", edad=" + edad + "]";
    }
    
}
