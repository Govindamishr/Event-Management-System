package com.geekster.govinda.UniversityEventManagement.repository;

import com.geekster.govinda.UniversityEventManagement.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EventDao extends CrudRepository<Event,Integer> {


}
