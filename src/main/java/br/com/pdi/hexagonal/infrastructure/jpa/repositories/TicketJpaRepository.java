package br.com.pdi.hexagonal.infrastructure.jpa.repositories;

import br.com.pdi.hexagonal.infrastructure.jpa.entities.TicketEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TicketJpaRepository extends CrudRepository<TicketEntity, UUID> {

}
