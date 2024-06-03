package com.sparta.todoapp.dto;

import lombok.Getter;

@Getter
public class ScheduleCreateRequest {

    private String title;

    private String description;

    private String manager;

    private String password;
}
