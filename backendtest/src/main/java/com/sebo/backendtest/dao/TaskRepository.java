package com.sebo.backendtest.dao;

import com.sebo.backendtest.entities.STask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<STask, Long> {

    Optional<STask> findByTaskday(String Day);
}
