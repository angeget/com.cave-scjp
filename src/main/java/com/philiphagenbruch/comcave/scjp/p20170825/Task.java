package com.philiphagenbruch.comcave.scjp.p20170825;

import java.util.Comparator;

class Task {

    enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    interface TaskComparator extends Comparator<Task> {}

    static class TaskPriorityComparator implements TaskComparator {

        @Override
        public int compare(final Task o1, final Task o2) {
            return o2.priority.ordinal() - o1.priority.ordinal();
        }
    }

    private String description;
    private Priority priority;

    Task(final String description, final Priority priority) {
        this.description = description;
        this.priority = priority;
    }

    String getDescription() {
        return description;
    }

    Priority getPriority() {
        return priority;
    }

    void setDescription(final String description) {
        this.description = description;
    }

    void setPriority(final Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task [description=" + description + ", priority=" + priority + "]";
    }

}
