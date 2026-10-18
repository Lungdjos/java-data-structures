package org.lunguda.arrays;

import java.util.Arrays;

public class ArrayS {
    public ArrayS() {
    }

    public void workingStrings() {
        // defining an array requires specifying the size.
        String[] colors = new String[5];
        // add colors to the array
        colors[0] = "Purple";
        colors[1] = "Red";
        colors[3] = "Green";
        colors[4] = "Blue";

        // to see the array
        System.out.println("This is a toString array presentation: ");
        System.out.println("This is a deep toString array presentation: ");

        // accessing elements in an array
        System.out.println("\nForward accessing of element in an array: ");
        for (int i = 0; i < colors.length; i++) {
            // print each element
            System.out.println(colors[i]);
        }

        System.out.println("\nReverser accessing of element in an array: ");
        for (int i = colors.length - 1; i >= 0; i--) {
            // print each element
            System.out.println(colors[i]);
        }

        // using enhance for-loop
        System.out.println("\nAccessing of element in an array using enhanced for: ");
        for (String color : colors) {
            System.out.println(color);
        }

        // using streams for-each
        System.out.println("\nAccessing of element in an array using forEach: ");
        Arrays.stream(colors).forEach(System.out::println);
    }

    public void  workingNumbers(){

    }
}
