package com.example.mk4.user;

import com.example.mk4.models.user;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    userService userService;

    public userController(userService service){
        this.userService = service;
    }

//    @Controller
//    public static class AuthInterceptor implements HandlerInterceptor {
//        @Override
//        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
//            HttpSession session = request.getSession();
//            String email = (String) request.getAttribute("email");
//            String password = (String) request.getAttribute("password");
//            if(email == null){
//                response.sendRedirect("/?error=login");
//                return false;
//            }
//            return true;
//
//        }
//    }
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

