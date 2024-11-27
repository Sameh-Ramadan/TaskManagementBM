package com.taskmanagement.tasks.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Getter @Setter @ToString
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @Column(name = "task_id")
    private Long id;

    @Column(name = "title")
    @NotEmpty(message = "Title is required")
    private String title;

    @Column(name = "description")
    @NotEmpty(message = "Description is required")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "priority")
    private String priority;

}
