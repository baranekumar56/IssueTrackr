package com.example.mk4;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Repository
public class TicketRepository{
    private final JdbcClient jdbcClient;

    public TicketRepository(JdbcTemplate jdbcTemplate,JdbcClient jdbcClient)
    {
        this.jdbcClient = jdbcClient;
    }

    public List<Ticket> findAll(){
        return jdbcClient.sql("SELECT * FROM ticket")
                .query((t, rowNum)-> new Ticket(
                        t.getString("Location"),
                        t.getString("Category"),
                        t.getString("TicketInfo"),
                        t.getString("ConfigurationItem"),
                        t.getString("Priority"),
                        t.getDate("Opened"),
                        t.getString("OpenedBy"),
                        t.getString("State"),
                        t.getString("AssignmentGroup"),
                        t.getString("AssignedTo"),
                        t.getDate("ClosedTime")
                ))
                .list();
    }

    public Ticket save(Ticket t){
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcClient.sql("INSERT INTO ticket(Location,Category,TicketInfo,ConfigurationItem,Priority,Opened,OpenedBy,State,ClosedTime) VALUES(:Location,:Category,:TicketInfo,:ConfigurationItem,:Priority,:Opened,:OpenedBy,:State,:ClosedTime) ")
                .params(Map.ofEntries(
                        Map.entry("Location",t.getLocation()),
                        Map.entry("Category",t.getCategory()),
                        Map.entry("TicketInfo",t.getTicketInfo()),
                        Map.entry("ConfigurationItem",t.getConfigurationItem()),
                        Map.entry("Priority",t.getPriority()),
                        Map.entry("Opened",t.getOpened()),
                        Map.entry("OpenedBy",t.getOpenedBy()),
                        Map.entry("State",t.getState()),
                        Map.entry("AssignmentGroup",t.getAssignmentGroup()),
                        Map.entry("AssignedTo",t.getAssignedTo()),
                        Map.entry("ClosedTime",t.getClosedTime())
                ))
                .update(keyHolder);
        t.setTicketId(Integer.parseInt(Objects.requireNonNull(keyHolder.getKey()).toString()));
        return t;
    }




}

