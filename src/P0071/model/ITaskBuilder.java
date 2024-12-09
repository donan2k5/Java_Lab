package P0071.model;

import java.time.LocalDate;

public interface ITaskBuilder {
    ITaskBuilder buildId(int id);

    ITaskBuilder buildName(String name);

    ITaskBuilder buildTaskType(String taskType);

    ITaskBuilder buildDate(String date);

    ITaskBuilder buildTime(double time);

    ITaskBuilder buildAssignee(String assignee);

    ITaskBuilder buildReviewer(String reviewer);

    Task build();
}
