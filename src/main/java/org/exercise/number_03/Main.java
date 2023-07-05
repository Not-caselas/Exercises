package org.exercise.number_03;
import org.exercise.Input.Input;

public class Main {
    public static void main(String[] args){

        Integer c = Input.integer();
        for (int i=1; i<=c; i++) {
            if (c%i==0){
                System.out.println(i+" is a divisor of "+c);
            }
        }
        }
}

