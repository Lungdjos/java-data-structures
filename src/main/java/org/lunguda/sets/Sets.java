package org.lunguda.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets(){}
    public void workingWSet(){
        Set<Ball> ballSet = new HashSet<Ball>();
        ballSet.add(new Ball("Orange"));
        ballSet.add(new Ball("White"));
        ballSet.add(new Ball("Green"));

        // to access all the elements in a set, use iterator or forEach
        ballSet.forEach(System.out::println);

        Set<Ball> orderedSet = new TreeSet<Ball>();
        orderedSet.add(new Ball("Orange"));
        orderedSet.add(new Ball("White"));
        orderedSet.add(new Ball("Green"));

        // to access all the elements in a set, use iterator or forEach
        orderedSet.forEach(System.out::println);
    }

    record Ball(String color){}
}
