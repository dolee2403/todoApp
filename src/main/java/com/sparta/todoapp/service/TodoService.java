package com.sparta.todoapp.service;

import com.sparta.todoapp.controller.TodoRequestDTO;
import com.sparta.todoapp.repository.Todo;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sparta.todoapp.repository.TodoRepository;
import lombok.AllArgsConstructor;

import java.util.List;


@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    //할 일 생성
    public Todo createTodo(TodoRequestDTO dto) {
        var newTodo = dto.todoEntity();
        return todoRepository.save(newTodo);

    }

    //할 일 단건 조회
    public Todo getTodo(Long todoId) {
        return todoRepository.findById(todoId)
                .orElseThrow(IllegalArgumentException::new);
    }

    //할 일 전체 조회
    public List<Todo> getTodos() {
        return todoRepository.findAll(Sort.by("createAt").descending());
    }

}
