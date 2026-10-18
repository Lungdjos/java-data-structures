package org.lunguda.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public Lists(){}

    public void workWLists() {
        // defining a list
        List<String> colors = new ArrayList<>();
        // adding elements to a list
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Green");
        System.out.print("\n" + colors);

        // methods associated with lists
        System.out.print("\nSize of the list: " + colors.size());
        System.out.print("\nContains that returns a bool: " + colors.contains("Red"));
        System.out.print("\nGetting the first item in the list: " + colors.getFirst());
        System.out.print("\nGetting the last item in the list: " + colors.getLast());

        // accessing elements in a list
        System.out.println("\nAccessing of element in a list using enhanced for: ");
        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        System.out.println("\nAccessing of element in a list using a for loop: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // unmodified lists
        List<String> unmodifiable = List.of(
                "Red", "Green", "White", "Orange"
        );
        unmodifiable.forEach(System.out::println);
    }
}
