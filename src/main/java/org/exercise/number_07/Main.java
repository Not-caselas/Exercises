package org.exercise.number_07;
import org.exercise.Input.Input;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
            System.out.println("Choose an option:" +
                    " a) add a number to the list" +
            " s) sum the elements of the list" +
            " d) destroy the last element of the list");

            ArrayList<String> array = new ArrayList<String>();
            String input_1 = Input.string();
            if (input_1.equals("a")){
                String number = Input.string();
                array.add(number);


            }

        }

}



