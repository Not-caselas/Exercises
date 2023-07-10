package org.exercise.number_09;

public class AnimalDeGranja extends Animal implements IPropietario {

    public String propietario;
    public AnimalDeGranja(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);

    }


    @Override
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
