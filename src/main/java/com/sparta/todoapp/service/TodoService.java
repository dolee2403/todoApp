package com.sparta.todoapp.service;

import com.sparta.todoapp.controller.TodoRequestDTO;
import com.sparta.todoapp.repository.Todo;
import org.springframework.stereotype.Service;

import com.sparta.todoapp.repository.TodoRepository;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    //할 일 생성
    public Todo createTodo(TodoRequestDTO dto) {
        var newTodo = dto.todoEntity();
        return todoRepository.save(newTodo);

    }
}
