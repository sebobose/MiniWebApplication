package com.sebo.backendtest.service.impl;

import com.sebo.backendtest.dao.TaskRepository;
import com.sebo.backendtest.entities.STask;
import com.sebo.backendtest.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceJPA implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<STask> listAll() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<STask> findByTaskday(String day) {
        return taskRepository.findByTaskday(day);
    }

    @Override
    public void addTask(STask task) {
      taskRepository.save(task);
    }

  @Override
  public void deleteTask(Long id) {
    taskRepository.deleteById(id);
  }

  @Override
  public void updateTask(STask task) {
    taskRepository.save(task);
  }
}
