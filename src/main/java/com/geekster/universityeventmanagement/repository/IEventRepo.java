package com.geekster.universityeventmanagement.repository;

import com.geekster.universityeventmanagement.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface IEventRepo extends CrudRepository<Event,Long> {
    List<Event> findAllByDate(LocalDate date);
}
