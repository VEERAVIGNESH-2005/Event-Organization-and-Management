package com.backend.backend.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend.Model.Event;

@Repository
public interface EventsRepo extends JpaRepository<Event,Long> {

}