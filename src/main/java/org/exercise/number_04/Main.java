package org.exercise.number_04;
import org.exercise.Input.Input;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Integer> numbers= new ArrayList<Integer>();
        Integer c = Input.integer();
        for (int i=c; i>=1; i--) {
            numbers.add(i);
            }
        for (int i=numbers.size();i>0;i--);
        }

}

