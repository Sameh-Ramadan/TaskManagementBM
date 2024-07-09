package com.taskmanagement.tasks.service;


import com.taskmanagement.tasks.model.Task;
import com.taskmanagement.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    public Task findById(Long taskId) {
        Optional<Task> opt = taskRepository.findById(taskId);
        return opt.get();
    }

    public boolean existsById(Long id) {
        return taskRepository.existsById(id);
    }

    public Task updateTask(Long id, Task task) {
        task.setId(id);
        return taskRepository.save(task);

    }
    public boolean deleteTask(Long id) {
        taskRepository.deleteById(id);
        return true;
    }

//    public List<Task> searchTasks(String title, String description, String status) {
//        Specification<Task> spec = new TaskSpecification(title, description, status);
//        return taskRepository.findAll(spec);
//    }

}
