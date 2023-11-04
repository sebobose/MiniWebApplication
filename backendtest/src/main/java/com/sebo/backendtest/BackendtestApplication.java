package com.sebo.backendtest;

import com.sebo.backendtest.dao.TaskRepository;
import com.sebo.backendtest.entities.STask;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendtestApplication.class, args);
    }

    @Bean
  CommandLineRunner init(TaskRepository taskRepository) {
      return args -> {
        System.out.println("pocetak");
        STask Task1 = new STask("operi auto", "4.11.2023");
        taskRepository.save(Task1);
        STask Task2 = new STask("usisaj auto", "4.11.2023");
        taskRepository.save(Task2);
        taskRepository.findAll().forEach(System.out::println);
      };
    }
}
