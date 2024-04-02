package com.example.mk4;

import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.Date;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDB(TicketRepository repo){
        return args -> {
            Instant i = Instant.now();
            Date date = Date.from(i);
            log.info("Loading :"+ repo.save(new Ticket("Breach in firewall at server 788", date)));
            log.info("Loading :"+ repo.save(new Ticket("Data Base entering critical state on port 6969", date)));
        };
    }


}
