package com.example.mk4.Login;

import com.example.mk4.models.user;
import com.mysql.cj.log.Log;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {
    LoginService loginService;

    public LoginController(LoginService service){
        this.loginService = service;
    }
    @GetMapping("/login")
    public String sendLogin(){
        return "Login page";
    }

    @GetMapping("/signup")
    public String sendSignup(){
        return "Signup page";
    }

    @PutMapping("/signup")
    public user signup(@RequestBody user u){
        return loginService.signup(u);
    }


    @PostMapping("/login/validation")
    public String validate(@RequestBody user u){
        if(loginService.empValidation(u))
            return "Present";
        return "Not Present";
    }
}
