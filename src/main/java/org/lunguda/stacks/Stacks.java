package org.lunguda.stacks;

import java.util.Stack;

public class Stacks {
    public Stacks() {
    }

    public void workingWStacks() {
        Stack<Integer> stack = new Stack<>();
        // methods used on a stack
        stack.push(1);
        stack.push(2);
        stack.push(4);

        // finding out what is on top of the stack
        System.out.println(stack.size());
        System.out.println(stack.size());
    }
}
