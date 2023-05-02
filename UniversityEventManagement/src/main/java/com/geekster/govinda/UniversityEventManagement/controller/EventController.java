package com.geekster.govinda.UniversityEventManagement.controller;

import com.geekster.govinda.UniversityEventManagement.model.Event;
import com.geekster.govinda.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/eventMangament")
public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping("/event")

    public Iterable<Event> findAllEvent(){
        return eventService.findAllEvent();

    }

    @PostMapping(value ="/postEvent")

    public String addEvent(@RequestBody List<Event> eventList){

        return eventService.addedEvent(eventList);
    }

    @GetMapping(value = "/event/{eventId}")

    public Optional<Event> getEventById(@PathVariable Integer eventId){

        return eventService.findEventById(eventId);
    }


    @DeleteMapping(value = "/event/{eventId}" )

    public String DeleteById(@PathVariable Integer eventId){

        eventService.deleteEventById(eventId);

        return "Deleted event By id";
    }




}
