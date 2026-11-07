package org.lunguda.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    public void workingWHMaps(){
        Map<Object, Object > map = new HashMap<>();
        map.put(new Person("Doe", 22), new Diamond("African Diamond"));

        // accessing an element
        System.out.println(map.get(new  Person("Doe", 22)).hashCode());
        System.out.println(map.get(new  Person("Doe", 22)));
    }

    class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAge());
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name +'\'' +
                    "age'" + age +'\'' +
            '}';
        }
    }

    record Diamond(String name){}
}
