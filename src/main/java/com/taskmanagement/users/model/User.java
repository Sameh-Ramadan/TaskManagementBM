package com.taskmanagement.users.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name="user_id")
    private Long id;

    @Column(name="username")
    @NotEmpty
    private String username;

    @Column(name="password")
    @NotEmpty
    @JsonIgnore
    private String password;

    @Column(name="first_name")
    @NotEmpty
    private String firstName;

    @Column(name="last_name")
    @NotEmpty
    private String lastName;

    @Column(name="role")
    @NotEmpty
    private String role;


}
