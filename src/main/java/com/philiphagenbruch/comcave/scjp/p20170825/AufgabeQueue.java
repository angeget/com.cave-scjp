package com.philiphagenbruch.comcave.scjp.p20170825;

import java.time.Instant;
import java.util.PriorityQueue;
import java.util.Queue;

public class AufgabeQueue {

    public static void main(final String[] args) {
        final Queue<Task> tasks = new PriorityQueue<>(new Task.TaskPriorityComparator());

        tasks.add(new Task("Auto waschen", Task.Priority.LOW, Instant.parse("2017-08-27T12:00:00.00Z")));
        tasks.add(new Task("Müll rausbringen", Task.Priority.LOW, Instant.parse("2017-08-27T08:00:00.00Z")));
        tasks.add(new Task("Einkaufen", Task.Priority.NORMAL, Instant.parse("2017-08-25T21:00:00.00Z")));
        tasks.add(new Task("Rechnung bezahlen", Task.Priority.HIGH, Instant.parse("2017-08-28T08:00:00.00Z")));

        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }

    }

}
