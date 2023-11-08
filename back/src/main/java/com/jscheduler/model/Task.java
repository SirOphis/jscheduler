package com.jscheduler.model;

import com.jscheduler.model.enums.TaskType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Task {
  private Long id;
  private String title;
  private String description;
  private LocalDate dueDate;
  private boolean isDone;
  private TaskType taskType;
}
