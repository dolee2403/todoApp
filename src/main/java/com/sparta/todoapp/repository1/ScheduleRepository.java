package com.sparta.todoapp.repository1;

import com.sparta.todoapp.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
