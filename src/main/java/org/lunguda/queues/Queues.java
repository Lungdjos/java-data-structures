package org.lunguda.queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public Queues(){}

    public void workingWQueues(){
        Queue<Person> supermarket = new LinkedList<>();
        // adding elements in a queue
        supermarket.add(new Person("John", 21));
        supermarket.add(new Person("Doe", 23));
        supermarket.add(new Person("Mark", 29));
        supermarket.add(new Person("Mary", 41));

        // seeing the item in front of a queue
        System.out.println(supermarket.size());

        System.out.println(supermarket.peek());

        // removing the element
        System.out.println(supermarket.poll());

        System.out.println(supermarket.size());

        System.out.println(supermarket.peek());
    }

    record Person(String name, int age){}
}
