package P0071.service;

import P0071.model.ITaskBuilder;
import P0071.model.Task;
import P0071.dto.TaskInput;

import java.util.Map;

public class TaskService implements ITaskService {
    private final Map<Integer, Task> map;
    private final ITaskBuilder taskBuilder;
    private int nextId = 1;

    public TaskService(Map<Integer, Task> map, ITaskBuilder taskBuilder) {
        this.map = map;
        this.taskBuilder = taskBuilder;
    }

    @Override
    public boolean addTask(TaskInput taskInput) throws IllegalArgumentException {
        String taskType = getTaskType(taskInput.getTaskTypeId());
        double time = getTime(taskInput.getPlanFrom(), taskInput.getPlanTo());
        map.put(nextId,
                taskBuilder
                        .buildId(nextId)
                        .buildName(taskInput.getName())
                        .buildTaskType(taskType)
                        .buildDate(taskInput.getDate())
                        .buildTime(time)
                        .buildAssignee(taskInput.getAssignee())
                        .buildReviewer(taskInput.getReviewer())
                        .build()
        );
        nextId++;
        return true;
    }

    @Override
    public boolean removeTask(int id) {
        if (!map.containsKey(id)) {
            return false;
        }
        map.remove(id);
        return true;
    }

    @Override
    public Map<Integer, Task> getAllTasks() {
        return map;
    }

    private String getTaskType(int taskTypeId) {
        return switch (taskTypeId) {
            case 1 -> "Code";
            case 2 -> "Test";
            case 3 -> "Design";
            case 4 -> "Review";
            default -> null;
        };
    }

    private double getTime(double planFrom, double planTo) throws IllegalArgumentException{
        if(planFrom > planTo) {
            throw new IllegalArgumentException("Plan to must be greater than plan from");
        }
        return planTo - planFrom;
    }

}
