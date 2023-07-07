package org.exercise.number_09;

public class Animal {
    public String reino;
    public String tipo;
    public String raza;
    public String medio;

    public Animal(String reino,String tipo,String raza,String medio) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
    }
    public Animal(Animal animal) {
        this.reino = animal.reino;
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.medio = animal.medio;
    }

    @Override
    public String toString() {
        return "no sé que poner aquí";
    }
}
