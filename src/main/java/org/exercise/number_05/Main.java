package org.exercise.number_05;
import org.exercise.Input.Input;

public class Main {
    public static void main(String[] args){
        String c = Input.string();
        System.out.println(c);
        String[] name = c.split(".", 2);
        for (String object: name){
            System.out.println(object);
        }

            }
        }



