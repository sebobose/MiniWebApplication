package com.sebo.backendtest.rest;

import com.sebo.backendtest.entities.STask;
import com.sebo.backendtest.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<STask> ListTasks() {
        return taskService.listAll();
    }

    @PostMapping(value = "/tasks")
    public ResponseEntity<STask> AddTask(@RequestBody STask task) {
        taskService.addTask(task);
        return ResponseEntity.ok(task);
    }

    @DeleteMapping("tasks/{id}")
    public ResponseEntity<STask> DeleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("tasks/{id}")
    public ResponseEntity<STask> UpdateTask(@RequestBody STask task, @PathVariable Long id) {
        task.setId(id);
        taskService.updateTask(task);
        return ResponseEntity.ok(task);
    }
}
