package com.example.mk4.Ticket;

import com.example.mk4.models.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket addTicket(Ticket ticket) {
        System.out.println("came1");
        return ticketRepository.save(ticket);
    }
    public List<Ticket> getTickets() {return ticketRepository.findAll();}
}

