package com.example.mk4.user;

import com.example.mk4.models.user;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    userService userService;

    public userController(userService service){
        this.userService = service;
    }
    @GetMapping("/login")
    public String sendLogin(){
        return "Login page";
    }

    @GetMapping("/all")
    public List<user> listAll(){
        return userService.loginRepo.findAll();
    }
    @GetMapping("/signup")
    public String sendSignup(){
        return "Signup page";
    }

    @PutMapping("/signup")
    public user signup(@RequestBody user u){
        return userService.signup(u);
    }


    @PostMapping("/login/validation")
    public String validate(@RequestBody user u){
        if(userService.empValidation(u))
            return "Present";
        return "Not Present";
    }


}

