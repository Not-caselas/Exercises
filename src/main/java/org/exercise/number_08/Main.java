package org.exercise.number_08;
import org.exercise.Input.Input;

import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        System.out.println("Choose an option:" +
                " a) add a number to the list" +
                " s) sum the elements of the list" +
                " d) destroy the last element of the list");

        Stack<Double> array = new Stack<>();
        while (0<10) {
            String input_1 = Input.string();
            if (input_1.equals("a")) {
                String number = Input.string();
                array.add(Double.parseDouble(number));
            }
            else if (input_1.equals("s")) {
                Double sum = array.stream().mapToDouble(Double::doubleValue).sum();
                System.out.println(sum);
            }
            else if (input_1.equals("d")) {
                array.pop();
            }
            else if (input_1.equals("")) {
                break;
            }
        }
    }
}



