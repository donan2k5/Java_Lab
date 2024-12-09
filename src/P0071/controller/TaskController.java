package P0071.controller;

import P0071.dto.ITaskInputBuilder;
import P0071.dto.TaskInput;
import P0071.service.ITaskService;
import P0071.view.GetInputter;
import P0071.view.View;

public class TaskController {
    private final ITaskService taskService;
    private final GetInputter getInputter;
    private final View view;
    private final ITaskInputBuilder taskInputBuilder;

    public TaskController(ITaskService taskService, GetInputter getInputter, View view, ITaskInputBuilder taskInputBuilder) {
        this.taskService = taskService;
        this.getInputter = getInputter;
        this.view = view;
        this.taskInputBuilder = taskInputBuilder;
    }

    public void addTask() {
        try {
            String name = getInputter.getString("Requirement Name: ");
            int taskTypeId = getInputter.getInt("Task Type: ");
            String date = getInputter.getStringDateValue("Date: ");
            double planFrom = getInputter.getDouble("From: ");
            double planTo = getInputter.getDouble("To: ");
            String assignee = getInputter.getString("Assignee: ");
            String reviewer = getInputter.getString("Reviewer: ");

            taskService.addTask(taskInputBuilder
                    .buildName(name)
                    .buildTaskTypeId(taskTypeId)
                    .buildDate(date)
                    .buildPlanFrom(planFrom)
                    .buildPlanTo(planTo)
                    .buildAssignee(assignee)
                    .buildReviewer(reviewer)
                    .build()
            );
            view.display("Task added successfully");
        }catch (IllegalArgumentException e){
            view.displayError(e.getMessage());
        }
    }

    public void deleteTask() {
        int taskId = getInputter.getInt("ID: ");
        if (!taskService.removeTask(taskId)) {
            view.display("Task not found");
            return;
        }
        view.display("Task deleted successfully");
    }

    public void displayTasks() {
        var tasks = taskService.getAllTasks();
        if (tasks.isEmpty()) {
            view.display("No tasks to display");
            return;
        }
        view.displayAll(tasks);
    }
}
