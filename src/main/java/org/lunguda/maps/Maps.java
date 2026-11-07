package org.lunguda.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public Maps() {
    }

    public void workingWMaps(){
        Map<Integer, Object> map = new HashMap<>();
        // adding to a map
        map.put(1, new Person("John", 22));
        map.put(2, new Person("Mary", 23));
        map.put(3, new Person("Jane", 24));
        map.put(4, new Person("Julie", 25));

        // accessing the elements.
        System.out.println(map);
        System.out.println("\n\nThe size of the map: " + map.size());
        System.out.println("\n\nThe keys in the map: " + map.keySet());
        System.out.println("\n\nThe values in the map: " + map.values());
        System.out.println("\n\nThe entry set in the map: " + map.entrySet());
        System.out.println("\n\nAccessing a value: " + map.get(1));

        System.out.println("\n\nLooping through a map: ");
        // using a forEach
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        // using an entry set
        map.entrySet()
                .forEach(
                        x -> System.out.println(x.getKey() + " :- " + x.getValue())
                );

    }

    record Person(String  name, int age) {}
}
