package com.example.mk4;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Database extends JpaRepository<Ticket, Long> {

}
