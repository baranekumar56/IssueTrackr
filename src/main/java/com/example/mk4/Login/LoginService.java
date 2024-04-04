package com.example.mk4.Login;

import com.example.mk4.models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    LoginRepo loginRepo;
    @Autowired
    public LoginService(LoginRepo repo){
        this.loginRepo = repo;
    }

    public boolean empValidation(user emp){
        String email = emp.getEmail();
        Optional<user> optional =  loginRepo.findByEmail(email);
        return optional.isPresent();
    }

    public user signup(user u){
        return loginRepo.save(u);
    }



}
