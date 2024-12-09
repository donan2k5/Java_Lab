package P0071.dto;

public interface ITaskInputBuilder {
    ITaskInputBuilder buildName(String name);

    ITaskInputBuilder buildTaskTypeId(int taskTypeId);

    ITaskInputBuilder buildDate(String date);

    ITaskInputBuilder buildPlanFrom(double planFrom);

    ITaskInputBuilder buildPlanTo(double planTo);

    ITaskInputBuilder buildAssignee(String assignee);

    ITaskInputBuilder buildReviewer(String reviewer);

    TaskInput build();
}
