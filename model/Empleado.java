package model;

public class Empleado extends Persona {
    private String cargo;
    private int aniosExperiencia;

    public Empleado(String rut, String nombre, String email, Direccion direccion,
                    String cargo, int aniosExperiencia) {
        super(rut, nombre, email, direccion);
        this.cargo = cargo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public int getAniosExperiencia() { return aniosExperiencia; }
    public void setAniosExperiencia(int aniosExperiencia) { this.aniosExperiencia = aniosExperiencia; }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + cargo
                + ", Años de Experiencia: " + aniosExperiencia;
    }
}