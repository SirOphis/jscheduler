package com.jscheduler.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
public class Note {
  private Long id;
  private String title;
  private List<Task> taskList;
}
