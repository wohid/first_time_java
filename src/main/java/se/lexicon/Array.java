package se.lexicon;
import java.util.ArrayList;
import java.util.Collections;

public class Array {

    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        Integer[] array = {10, 20, 30};

        // Add all elements in array to ArrayList.
        Collections.addAll(values, array);
        // Display.
        for (int value : values) {
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();


        // Add more elements.
        Collections.addAll(values, 40, 50);

        // Display.
        for (int value : values) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
}