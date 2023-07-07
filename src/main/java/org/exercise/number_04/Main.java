package org.exercise.number_04;
import org.exercise.Input.Input;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Integer c = Input.integer();
        for (int i = c+1; i >= 1; i--) {
            numbers.add(i);
        }
        Integer j = 1;
        Integer result = 1;
        for (int i = numbers.size() - 1; i > 0; i--) {
            result = j * numbers.get(i);
            j=result;

        }
        System.out.println(result);
    }
}

