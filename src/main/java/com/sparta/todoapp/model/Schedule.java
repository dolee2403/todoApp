package com.sparta.todoapp.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String password;

    @Column
    private String manager;

    @Column
    private String createdAt;

    public Schedule(String name, String description, String password, String manager) {
        this.name = name;
        this.description = description;
        this.password = password;
        this.manager = manager;
        this.createdAt = LocalDateTime.now().toString();
    }
}
