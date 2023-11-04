package com.sebo.backendtest.service;

import com.sebo.backendtest.entities.STask;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TaskService {

    List<STask> listAll();

    Optional<STask> findByTaskday(String day);

    void addTask(STask task);

    void deleteTask(Long id);

    void updateTask(STask task);
}
