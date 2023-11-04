package com.sebo.backendtest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@AllArgsConstructor
public class STask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Getter
    private String text;

    @Getter
    private String taskday;

  public STask(String text, String taskday) {
    this.text = text;
    this.taskday = taskday;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setTaskday(String taskday) {
    this.taskday = taskday;
  }
  public STask() {
    this.text = "nema";
    this.taskday = "nikad";
  }

  @Override
  public String toString() {
    return "STask{" +
      "Id=" + Id +
      ", text='" + text + '\'' +
      ", taskday='" + taskday + '\'' +
      '}';
  }

  public void setId(Long id) {
      this.Id = id;
  }
}
