package br.com.pdi.hexagonal.application.repositories;

import br.com.pdi.hexagonal.application.domain.event.Event;
import br.com.pdi.hexagonal.application.domain.event.EventId;

import java.util.Optional;

public interface EventRepository {

    Optional<Event> eventOfId(EventId anId);

    Event create(Event event);

    Event update(Event event);

    void deleteAll();
}
