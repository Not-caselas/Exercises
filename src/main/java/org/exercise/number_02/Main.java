package org.exercise.number_02;
import org.exercise.Input.Input;

public class Main {
    public static void main(String[] args){

        Integer c = Input.integer();

        if (c%2==0) {
            System.out.println("El número es múltiplo de 2");
            }
        if (c%3==0) {
            System.out.println("El número es múltiplo de 3");
            }
        if (c%5==0) {
            System.out.println("El número es múltiplo de 5");
        }
        if (c%7==0) {
            System.out.println("El número el múltiplo de 7");
        }
        }
}

