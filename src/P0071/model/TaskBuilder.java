package P0071.model;


public class TaskBuilder implements ITaskBuilder {
    private int id;
    private String name;
    private String taskType;
    private String dueDate;
    private double dueTime;
    private String assignee;
    private String reviewer;


    @Override
    public ITaskBuilder buildId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public ITaskBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ITaskBuilder buildTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    @Override
    public ITaskBuilder buildDate(String date) {
        this.dueDate = date;
        return this;
    }

    @Override
    public ITaskBuilder buildTime(double time) {
        this.dueTime = time;
        return this;
    }

    @Override
    public ITaskBuilder buildAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    @Override
    public ITaskBuilder buildReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    @Override
    public Task build() {
        return new Task(id, name, taskType, dueDate, dueTime, assignee, reviewer);
    }

}
