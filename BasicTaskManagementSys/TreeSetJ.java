import java.util.*;

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class TreeSetJ {
    public static void main(String[] args) {
        TreeSet<Task> taskSet = new TreeSet<>();

        // Adding tasks
        taskSet.add(new Task("Write report", 2));
        taskSet.add(new Task("Prepare presentation", 1));
        taskSet.add(new Task("Review document", 3));
        taskSet.add(new Task("Attend meeting", 2));

        // Displaying tasks in sorted order based on priority
        System.out.println("Tasks:");
        for (Task task : taskSet) {
            System.out.println(task);
        }
    }
}
