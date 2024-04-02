package com.example.mk4;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface TicketRepository extends CrudRepository<Ticket, Long>{

    Ticket findTicketById(Long id);
}

