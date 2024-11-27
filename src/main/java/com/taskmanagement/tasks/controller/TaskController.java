package com.taskmanagement.tasks.controller;

import com.taskmanagement.tasks.exception.ResourceNotFoundException;
import com.taskmanagement.tasks.model.Task;
import com.taskmanagement.tasks.service.TaskService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="v1/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> createTask(@Valid @RequestBody Task task) {
        return ResponseEntity.ok(taskService.createTask(task));
    }

    @GetMapping(value="/all")
    public List<Task> getAllTasks() {
        return taskService.findAllTasks();
    }

    @GetMapping(value="/{taskId}")
    public ResponseEntity<Task> getTask(@PathVariable("taskId") long taskId) {
        verifyTask(taskId);
        Task task = taskService.findById(taskId);
        return new ResponseEntity<> (task, HttpStatus.OK);
    }

    @PutMapping(value="/{taskId}")
    public ResponseEntity<String> updateTask( @PathVariable("taskId") Long taskId,@Valid @RequestBody Task task) {
        verifyTask(taskId);
        taskService.updateTask(taskId, task);
        return ResponseEntity.ok("Task with id "+ taskId+ " updated");
    }

    @DeleteMapping(value="/{taskId}")
    public ResponseEntity<?>  deleteTask( @PathVariable("taskId") Long taskId) {
        verifyTask(taskId);
        taskService.deleteTask( taskId );
        return ResponseEntity.ok("Task with id "+ taskId+ " deleted");
    }

    protected void verifyTask(Long taskId) throws ResourceNotFoundException {
        if(!taskService.existsById(taskId)) {
            throw new ResourceNotFoundException("Task with id " + taskId + " not found");
        }
    }

    @GetMapping("/search")
    public List<Task> searchTasks(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) String status) {

        return taskService.searchTasks(title, description, status);
    }

}
