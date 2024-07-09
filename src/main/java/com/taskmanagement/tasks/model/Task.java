package com.taskmanagement.tasks.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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