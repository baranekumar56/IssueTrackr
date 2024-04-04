package com.example.mk4.Ticket;

import java.util.List;

import com.example.mk4.models.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    private final TicketService ticketService ;
    public static final Logger log = LoggerFactory.getLogger(TicketController.class);
    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    @GetMapping("/")
    public String sayHello(){
        return "SimplePost";
    }

    @GetMapping("/Tickets")
    List<Ticket> all(){
        return this.ticketService.getTickets();
    }

    @PostMapping("/addTicket")
    Ticket Add(@RequestBody Ticket t){
        log.info(t.toString());
       return ticketService.addTicket(t);
    }

}
