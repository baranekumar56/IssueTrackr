package com.example.mk4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.Instant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
//@RestController
public class Mk4Application {

    public static final Logger log = LoggerFactory.getLogger(Mk4Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Mk4Application.class, args);
    }
//    @GetMapping("/hello")
//    public String sayHello(@RequestParam(value="barane", defaultValue = "world") String name){
//        return String.format("Hello %s", name);
//    }
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
//            log.info("Searching document for specific ticket number:");
//            Ticket t = repo.findTicketById(Long.valueOf(1L));
//            log.info(t.toString());
//
//        };
//    }
}


//@Controller
//class HtmlController{
//    @GetMapping("/")
//    public String renderHtml(){
//    return "landingPage";
//    }

