package se.lexicon;

import java.util.Arrays;

public class Count {

    static int count;
    public static void main(String [] args){
        int [] array = new  int[3];
        array [0] = count++;
        array [1] = count ++;
        array [2] = count++;
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
        }



    }
}
