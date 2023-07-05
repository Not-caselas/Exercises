package org.exercise.number_07;
import org.exercise.Input.Input;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
            System.out.println("Choose an option:" +
                    " a) add a number to the list" +
            " s) sum the elements of the list" +
            " d) destroy the last element of the list");

            ArrayList<Double> array = new ArrayList<Double>();
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
                Integer i = ArrayList.size();
                array.remove(i-1);

           }
        }
}



