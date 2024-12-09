package P0071;

import P0071.controller.TaskController;
import P0071.dto.ITaskInputBuilder;
import P0071.dto.TaskInputBuilder;
import P0071.model.ITaskBuilder;
import P0071.model.Task;
import P0071.model.TaskBuilder;
import P0071.service.ITaskService;
import P0071.service.TaskService;
import P0071.view.GetInputter;
import P0071.view.View;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Task> map = new HashMap<>();
        ITaskBuilder taskBuilder = new TaskBuilder();

        ITaskService taskService = new TaskService(map, taskBuilder);

        GetInputter getInputter = new GetInputter();
        View view = new View();
        ITaskInputBuilder taskInputBuilder = new TaskInputBuilder();

        TaskController taskController = new TaskController(taskService, getInputter, view, taskInputBuilder);

        while (true) {
            System.out.println("-----Task Program-----");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Task");
            System.out.println("4. Exit");
            int choice = getInputter.getInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    System.out.println("-----Add Task-----");
                    taskController.addTask();
                    break;
                case 2:
                    System.out.println("-----Delete Task-----");
                    taskController.deleteTask();
                    break;
                case 3:
                    System.out.println("-----Task-----");
                    taskController.displayTasks();
                    break;
                default:
                    return;
            }
        }
    }
}

