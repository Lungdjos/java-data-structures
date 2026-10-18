package org.lunguda;

import org.lunguda.arrays.ArrayS;
import org.lunguda.arrays._2DArrays;
import org.lunguda.lists.Lists;
import org.lunguda.queues.Queues;
import org.lunguda.stacks.Stacks;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }

        // working with arrays
        ArrayS a = new ArrayS();
        a.workingStrings();
        a.workingNumbers();

        _2DArrays b = new _2DArrays();
        b.ticTacToe();

        // working with lists
        Lists list = new Lists();
        list.workWLists();


        Stacks stack = new Stacks();
        stack.workingWStacks();

        Queues queues = new Queues();
        queues.workingWQueues();
    }
}
