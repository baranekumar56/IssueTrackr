package com.example.mk4.Ticket;

import java.util.Date;
import java.util.List;

import com.example.mk4.models.Ticket;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerInterceptor;



@RestController
@RequestMapping("Ticket/")
public class TicketController {
    private final TicketService ticketService ;
    public static final Logger log = LoggerFactory.getLogger(TicketController.class);
    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

//    @Controller
//    public static class AuthInterceptor implements HandlerInterceptor{
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

    @GetMapping("all")
    List<Ticket> all(){
        return this.ticketService.getTickets();
    }

    @PutMapping("addTicket")
    Ticket Add(@RequestBody Ticket t){
        log.info(t.toString());
       return ticketService.addTicket(t);
    }
    @PostMapping("getPending")
    List<Ticket> getpending(@RequestBody Ticket dt){
        String dept = dt.getDept();
        return ticketService.getPending(dept);
    }

    @PostMapping("{id}/Update/state")
    boolean stateUpdate(@RequestBody Ticket st,@PathVariable Integer id){
        String state = st.getState();
        return ticketService.updateState(id, state) != null;
    }
    @PostMapping("{id}/Update/assignedTo")
    boolean assignedToUpdate(@RequestBody Ticket st,@PathVariable Integer id){
        String assignedTo = st.getAssignedTo();
        return ticketService.updateAssignedTo(id, assignedTo) != null;
    }
    @PostMapping("{id}/Update/closedTime")
    boolean closedTimeUpdate(@RequestBody Ticket st,@PathVariable Integer id){
        Date closedTime = st.getClosedTime();
        return ticketService.updateClosedTime(id, closedTime) != null;
    }
    @PostMapping("{id}/Update/dept")
    boolean deptUpdate(@RequestBody Ticket st,@PathVariable Integer id){
        String dept = st.getDept();
        return ticketService.updateDept(id, dept) != null;
    }

    @PostMapping("search/{info}")
    List<Ticket> search(@PathVariable String info){
        return ticketService.findByInfo(info);
    }

}
