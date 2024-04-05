package com.example.mk4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class Mk4Application {

    public static final Logger log = LoggerFactory.getLogger(Mk4Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Mk4Application.class, args);
    }
}