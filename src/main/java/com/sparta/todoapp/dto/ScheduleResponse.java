package com.sparta.todoapp.dto;

import com.sparta.todoapp.model.Schedule;
import com.sparta.todoapp.repository1.ScheduleRepository;
import lombok.Getter;

@Getter
public class ScheduleResponse {
    private String name;

    private String description;

    private String manager;

    public ScheduleResponse(String name, String description, String manager) {
        this.name = name;
        this.description = description;
        this.manager = manager;
    }
}

