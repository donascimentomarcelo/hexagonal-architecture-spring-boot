package br.com.pdi.hexagonal.infrastructure.repositories;

import br.com.pdi.hexagonal.application.domain.event.Event;
import br.com.pdi.hexagonal.application.domain.event.EventId;
import br.com.pdi.hexagonal.application.repositories.EventRepository;
import br.com.pdi.hexagonal.infrastructure.jpa.entities.EventEntity;
import br.com.pdi.hexagonal.infrastructure.jpa.repositories.EventJpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

// Interface Adapter
@Component
public class EventDatabaseRepository implements EventRepository {

    private final EventJpaRepository eventJpaRepository;

    public EventDatabaseRepository(final EventJpaRepository EventJpaRepository) {
        this.eventJpaRepository = Objects.requireNonNull(EventJpaRepository);
    }

    @Override
    public Optional<Event> eventOfId(final EventId anId) {
        Objects.requireNonNull(anId, "id cannot be null");
        return this.eventJpaRepository.findById(UUID.fromString(anId.value()))
                .map(EventEntity::toEvent);
    }

    @Override
    @Transactional
    public Event create(final Event Event) {
        return this.eventJpaRepository.save(EventEntity.of(Event))
                .toEvent();
    }

    @Override
    @Transactional
    public Event update(Event Event) {
        return this.eventJpaRepository.save(EventEntity.of(Event))
                .toEvent();
    }

    @Override
    public void deleteAll() {
        this.eventJpaRepository.deleteAll();
    }
}
