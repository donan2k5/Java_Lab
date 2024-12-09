package P0071.dto;

public class TaskInputBuilder implements ITaskInputBuilder {
    private String name;
    private int taskTypeId;
    private String date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String reviewer;

    @Override
    public ITaskInputBuilder buildName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ITaskInputBuilder buildTaskTypeId(int taskTypeId) {
        this.taskTypeId = taskTypeId;
        return this;
    }

    @Override
    public ITaskInputBuilder buildDate(String date) {
        this.date = date;
        return this;
    }

    @Override
    public ITaskInputBuilder buildPlanFrom(double planFrom) {
        this.planFrom = planFrom;
        return this;
    }

    @Override
    public ITaskInputBuilder buildPlanTo(double planTo) {
        this.planTo = planTo;
        return this;
    }

    @Override
    public ITaskInputBuilder buildAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    @Override
    public ITaskInputBuilder buildReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    @Override
    public TaskInput build() {
        return new TaskInput(name, taskTypeId, date, planFrom, planTo, assignee, reviewer);
    }
}
