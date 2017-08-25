package com.philiphagenbruch.comcave.scjp.p20170825;

import java.util.PriorityQueue;
import java.util.Queue;

public class AufgabeQueue {

    public static void main(final String[] args) {
        final Queue<Task> tasks = new PriorityQueue<>(new Task.TaskPriorityComparator());

        tasks.add(new Task("Auto waschen", Task.Priority.LOW));
        tasks.add(new Task("Einkaufen", Task.Priority.NORMAL));
        tasks.add(new Task("Rechnung bezahlen", Task.Priority.HIGH));

        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }

    }

}
