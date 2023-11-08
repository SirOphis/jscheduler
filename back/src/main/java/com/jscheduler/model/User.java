package com.jscheduler.model;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class User {
  private Long id;
  private String username;
  private String email;
  private String password;
  private String firstName;
  private String lastName;
  private LocalDate birthdate;
  private List<Note> noteList;
}
