package com.example.mk4.Ticket;

import com.example.mk4.models.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket addTicket(Ticket ticket) {
        System.out.println("came1");
        return ticketRepository.save(ticket);
    }
    public List<Ticket> getTickets() {return ticketRepository.findAll();}

    public List<Ticket> getPending(String dept){
        return ticketRepository.getTicketByDept(dept);
    }

    public Integer updateState(Integer id,String state){
        Optional<Ticket> optional = ticketRepository.findById(id);
        if(optional.isPresent())
        {
            return ticketRepository.updateTicketByState(id,state);
        }
        return null;
    }
    public Integer updateAssignedTo(Integer id,String assignedTo){
        Optional<Ticket> optional = ticketRepository.findById(id);
        if(optional.isPresent())
        {
            return ticketRepository.updateTicketByAssignedTo(id,assignedTo);
        }
        return null;
    }
    public Integer updateClosedTime(Integer id, Date closedTime){
        Optional<Ticket> optional = ticketRepository.findById(id);
        if(optional.isPresent())
        {
            return ticketRepository.updateTicketByClosedTime(id,closedTime);
        }
        return null;
    }
    public Integer updateDept(Integer id,String dept){
        Optional<Ticket> optional = ticketRepository.findById(id);
        if(optional.isPresent())
        {
            return ticketRepository.updateTicketByDept(id,dept);
        }
        return null;
    }

    public List<Ticket> findByInfo(String info){
        return ticketRepository.searchByTicketInfo(info);
    }
}

