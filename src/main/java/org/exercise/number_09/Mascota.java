package org.exercise.number_09;

public class Mascota extends Animal implements IPropietario {

    public String nombre;

    public String propietario;
    public Mascota(String reino, String tipo, String raza, String medio, String nombre) {
        super(reino, tipo, raza, medio);
        this.nombre = nombre;
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
