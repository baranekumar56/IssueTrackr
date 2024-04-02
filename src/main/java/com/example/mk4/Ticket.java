package com.example.mk4;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ticketInfo;
    private Date occuredOn;

    protected Ticket() {}

    public Ticket(String ticketInfo, Date occuredOn){
        this.ticketInfo = ticketInfo;
        this.occuredOn = occuredOn;
    }

    @Override
    public String toString() {
        return String.format(
                "Ticket[id=%d, ticketInfo='%s', occuredOn=",
                id, ticketInfo) + occuredOn.toString() + "]";
    }

    public long getId() {
        return this.id;
    }
    public String getTicketInfo(){
        return this.ticketInfo;
    }
    public Date getOccuredOn(){
        return this.occuredOn;
    }
}
