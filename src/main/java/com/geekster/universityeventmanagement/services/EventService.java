package com.geekster.universityeventmanagement.services;

import com.geekster.universityeventmanagement.model.Event;
import com.geekster.universityeventmanagement.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private IEventRepo iEventRepo;
    public Event addEvent(Event event) {
        return iEventRepo.save(event);
    }

    public Optional<Event> updateEvent(Long eventId, Event event) {
        Optional<Event> optionalEvent = iEventRepo.findById(eventId);
        if (optionalEvent.isPresent()) {
            Event existingEvent = optionalEvent.get();
            existingEvent.setEventName(event.getEventName());
            existingEvent.setLocationOfEvent(event.getLocationOfEvent());
            existingEvent.setDate(event.getDate());
            existingEvent.setStartTime(event.getStartTime());
            existingEvent.setEndTime(event.getEndTime());
            iEventRepo.save(existingEvent);
        }
        return optionalEvent;
    }

    public boolean deleteEvent(Long eventId) {
        if (iEventRepo.existsById(eventId)) {
            iEventRepo.deleteById(eventId);
            return true;
        }
        return false;
    }

    public List<Event> getAllEventsByDate(LocalDate date) {
        return iEventRepo.findAllByDate(date);
    }

}
