package com.sparta.todoapp.service1;

import com.sparta.todoapp.dto.ScheduleCreateRequest;
import com.sparta.todoapp.dto.ScheduleResponse;
import com.sparta.todoapp.model.Schedule;
import com.sparta.todoapp.repository1.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ScheduleService {

    private final ScheduleRepository repository;

    public Long create(ScheduleCreateRequest request) {
        Schedule schedule = new Schedule(request.getTitle(),
                request.getDescription(),
                request.getPassword(),
                request.getManager()
        );
        return repository.save(schedule).getId();
    }

    public ScheduleResponse findById(Long id) {
        Schedule schedule = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("없습니다."));

        return new ScheduleResponse(schedule.getName(),
                schedule.getDescription(),
                schedule.getManager());
    }
    public List<ScheduleResponse> findAll() {
        List<Schedule> schedules = repository.findAll();
        List<ScheduleResponse> scheduleResponses = new ArrayList<>();

        for (Schedule schedule : schedules) {
            ScheduleResponse response = new ScheduleResponse(schedule.getName(),
                    schedule.getDescription(),
                    schedule.getManager());

            scheduleResponses.add(response);
        }
        return scheduleResponses;
    }

    public void deleteByID(Long id) {
        Schedule schedule = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Schedule not found with id: " + id));
        repository.delete(schedule);
    }

}
