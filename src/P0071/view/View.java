package P0071.view;

import P0071.model.Task;

import java.util.Map;

public class View {
    public void displayAll(Map<Integer, Task> map) {
        System.out.printf("%-5s%-15s%-15s%-15s%-10s%-15s%-15s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");

        for (Integer i : map.keySet()) {
            Task task = map.get(i);
            System.out.printf("%-5d%-15s%-15s%-15s%" +
                            "-10.1f%-15s%-15s\n",
                    task.getId(), task.getName(), task.getTaskType(), task.getDueDate(),
                    task.getDueTime(), task.getAssignee(), task.getReviewer());
        }
    }

    public void display(String msg) {
        System.out.println(msg);
    }

    public void displayError(String msg) {
        System.err.println(msg);
    }

}
