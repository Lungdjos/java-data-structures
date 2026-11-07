package org.lunguda.sets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets(){}
    public void workingWSet(){
        Set<Ball> ballSet = new HashSet<Ball>();
        ballSet.add(new Ball("Orange"));
        ballSet.add(new Ball("White"));
        ballSet.add(new Ball("Green"));

        // removing a ball from a set
        ballSet.remove(new Ball("Orange"));

        // to access all the elements in a set, use iterator or forEach
        ballSet.forEach(System.out::println);

//        Set<Ball> orderedSet = new TreeSet<Ball>();
//        orderedSet.add(new Ball("Orange"));
//        orderedSet.add(new Ball("White"));
//        orderedSet.add(new Ball("Green"));
//
//        // to access all the elements in a set, use iterator or forEach
//        orderedSet.forEach(System.out::println);
    }

//    record Ball(String color){}

    // if using a class instead of a record.
    class Ball{
        String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return  true;
            if (obj == null || getClass() != obj) return false;
            Ball other = (Ball) obj;
            return Objects.equals(color, other.color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
