package com.sparta.todoapp.controller1;

import com.sparta.todoapp.dto.ScheduleCreateRequest;
import com.sparta.todoapp.dto.ScheduleResponse;
import com.sparta.todoapp.model.Schedule;
import com.sparta.todoapp.service1.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody ScheduleCreateRequest request) {
        Long id = scheduleService.create(request);
        return ResponseEntity.ok(id + "Schedule created");
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScheduleResponse> findById(@PathVariable Long id) {
        ScheduleResponse response = scheduleService.findById(id);

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<ScheduleResponse>> findAll() {
        List<ScheduleResponse> response = scheduleService.findAll();
        return ResponseEntity.ok(response);
    }

}
