package com.example.mk4;

import com.example.mk4.Ticket.TicketController;
import com.example.mk4.user.userController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@SpringBootApplication
@RestController
public class Mk4Application implements WebMvcConfigurer{

    public static void main(String[] args) {

        SpringApplication.run(Mk4Application.class, args);
    }
//    @Bean
//    public TicketController.AuthInterceptor TicketauthInterceptor() {
//        return new TicketController.AuthInterceptor();
//    }
//
//    @Bean
//    public userController.AuthInterceptor UserauthInterceptor(){
//        return new userController.AuthInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(TicketauthInterceptor())
//                .addPathPatterns("/Ticket/**");
//        registry.addInterceptor(UserauthInterceptor())
//                .addPathPatterns("user/**")
//                .excludePathPatterns("/login","/signup","/logout");
//    }
}