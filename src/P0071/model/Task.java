package P0071.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    private int id;
    private String name;
    private String taskType;
    private LocalDate dueDate;
    private double dueTime;
    private String assignee;
    private String reviewer;

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Task(int id, String name, String taskType, String dueDate, double time, String assignee, String reviewer) {
        this.id = id;
        this.name = name;
        this.taskType = taskType;
        this.dueDate = LocalDate.parse(dueDate, DATE_FORMAT);
        this.dueTime = time;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public double getDueTime() {
        return dueTime;
    }

    public void setDueTime(double dueTime) {
        this.dueTime = dueTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getDueDate() {
        return dueDate.format(DATE_FORMAT);
    }

    public void setDueDate(String dueDate) {
        this.dueDate = LocalDate.parse(dueDate, DATE_FORMAT);
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
}
