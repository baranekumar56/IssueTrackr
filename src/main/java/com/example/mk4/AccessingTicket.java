package com.example.mk4;

import java.time.Instant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;


public class AccessingTicket {
    public static final Logger log = LoggerFactory.getLogger(AccessingTicket.class);

    public static void main(String[] args) {
        SpringApplication.run(Mk4Application.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(TicketRepository repo){
//        return (args ) -> {
//
//            Instant instant = Instant.now();
//            Date date = Date.from(instant);
//            repo.save(new Ticket("There is a breach in the security", date));
//            repo.save(new Ticket("Database storage is running out in critical", date));
//
//            log.info("Tickets found:");
//            repo.findAll().forEach(ticket -> {
//                log.info(ticket.toString());
//            });
//            log.info("");
//
//        };
//    }

}
