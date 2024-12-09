package P0071.service;

import P0071.model.Task;
import P0071.dto.TaskInput;

import java.util.Map;

public interface ITaskService {
    public boolean addTask(TaskInput taskInput);

    public boolean removeTask(int id);

    public Map<Integer, Task> getAllTasks();
}
