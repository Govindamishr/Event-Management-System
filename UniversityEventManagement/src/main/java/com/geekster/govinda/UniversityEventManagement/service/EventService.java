package com.geekster.govinda.UniversityEventManagement.service;

import com.geekster.govinda.UniversityEventManagement.model.Event;
import com.geekster.govinda.UniversityEventManagement.repository.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EventService {
    @Autowired
    EventDao eventDao;
    public Iterable<Event> findAllEvent() {

        Iterable <Event> findEvent=eventDao.findAll();
        return findEvent;
    }

    public String addedEvent(List<Event> eventList) {

        Iterable<Event> addedNewEvent=eventDao.saveAll(eventList);

        if(addedNewEvent !=null)

            return "Yes";
        else
            return "No";

    }

    public Optional<Event> findEventById(Integer eventId) {

        return eventDao.findById(eventId);
    }

    public void deleteEventById(Integer eventId) {

        eventDao.deleteById(eventId);
    }
}
