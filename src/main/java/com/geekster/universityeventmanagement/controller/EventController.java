package com.geekster.universityeventmanagement.controller;

import com.geekster.universityeventmanagement.model.Event;
import com.geekster.universityeventmanagement.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@Validated
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("addEvent")
    public Event addEvent(@Validated @RequestBody Event event) {
        return  eventService.addEvent(event);
    }

    @PutMapping("updateEvent/{eventId}")
    public Optional<Event> updateEvent(@PathVariable Long eventId, @Validated @RequestBody Event event) {
        return eventService.updateEvent(eventId, event);
    }

    @DeleteMapping("deleteEvent/{eventId}")
    public boolean deleteEvent(@PathVariable Long eventId) {
        return eventService.deleteEvent(eventId);
    }

    @GetMapping("getAllEventsByDate")
    public List<Event> getAllEventsByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date) {
        return eventService.getAllEventsByDate(date);
    }
}
