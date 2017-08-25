package com.philiphagenbruch.comcave.scjp.p20170825;

import java.time.Instant;
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
            int r = o2.priority.ordinal() - o1.priority.ordinal();

            if (r == 0) {
                r = o1.dueBefore.compareTo(o2.dueBefore);
            }

            return r;
        }
    }

    private String description;
    private Priority priority;
    private Instant dueBefore;

    Task(final String description, final Priority priority, final Instant dueBefore) {
        this.description = description;
        this.priority = priority;
        this.dueBefore = dueBefore;
    }

    String getDescription() {
        return description;
    }

    Instant getDueBefore() {
        return dueBefore;
    }

    Priority getPriority() {
        return priority;
    }

    void setDescription(final String description) {
        this.description = description;
    }

    void setDueBefore(final Instant dueBefore) {
        this.dueBefore = dueBefore;
    }

    void setPriority(final Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task [description=" + description + ", priority=" + priority + "]";
    }

}
