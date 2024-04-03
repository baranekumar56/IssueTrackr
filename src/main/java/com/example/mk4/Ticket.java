package com.example.mk4;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
public class Ticket {
    private Integer TicketId;
    private String Location;
    private String Category;
    private String TicketInfo;
    private String ConfigurationItem;
    private String Priority;

    private Date Opened;
    private String OpenedBy;
    private String State;
    private String AssignmentGroup;
    private String AssignedTo;
    private Date ClosedTime;

    protected Ticket() {}

    public Ticket(Integer id,String location, String category, String ticketInfo, String configurationItem,
                        String priority, Date opened, String openedBy, String state,
                        String assignmentGroup, String assignedTo, Date closedTime){

        this.TicketId = id;
        this.Location = location;
        this.Category = category;
        this.TicketInfo = ticketInfo;
        this.ConfigurationItem = configurationItem;
        this.Priority = priority;
        this.Opened = opened;
        this.OpenedBy = openedBy;
        this.State = state;
        this.AssignmentGroup = assignmentGroup;
        this.AssignedTo = assignedTo;
        this.ClosedTime = closedTime;
    }

//    public Ticket(String location, String category, String ticketInfo, String configurationItem,
//                  String priority, Date opened, String openedBy, String state,
//                  String assignmentGroup, String assignedTo, Date closedTime){
//        this.Location = location;
//        this.Category = category;
//        this.TicketInfo = ticketInfo;
//        this.ConfigurationItem = configurationItem;
//        this.Priority = priority;
//        this.Opened = opened;
//        this.OpenedBy = openedBy;
//        this.State = state;
//        this.AssignmentGroup = assignmentGroup;
//        this.AssignedTo = assignedTo;
//        this.ClosedTime = closedTime;
//    }

    // Getters
    public Integer getTicketId() {
        return TicketId;
    }

    public String getLocation() {
        return Location;
    }

    public String getCategory() {
        return Category;
    }

    public String getTicketInfo() {
        return TicketInfo;
    }

    public String getConfigurationItem() {
        return ConfigurationItem;
    }

    public String getPriority() {
        return Priority;
    }

    public Date getOpened() {
        return Opened;
    }

    public String getOpenedBy() {
        return OpenedBy;
    }

    public String getState() {
        return State;
    }

    public String getAssignmentGroup() {
        return AssignmentGroup;
    }

    public String getAssignedTo() {
        return AssignedTo;
    }

    public Date getClosedTime() {
        return ClosedTime;
    }

    public void setTicketId(Integer id) {this.TicketId = id;}

    // toString method
    @Override
    public String toString() {
        return "Ticket{" +
                "TicketId='" + TicketId + '\'' +
                ", Location='" + Location + '\'' +
                ", Category='" + Category + '\'' +
                ", TicketInfo='" + TicketInfo + '\'' +
                ", ConfigurationItem='" + ConfigurationItem + '\'' +
                ", Priority='" + Priority + '\'' +

                ", Opened=" + Opened +
                ", OpenedBy='" + OpenedBy + '\'' +
                ", State='" + State + '\'' +
                ", AssignmentGroup='" + AssignmentGroup + '\'' +
                ", AssignedTo=" + AssignedTo +
                ", ClosedTime=" + ClosedTime +
                '}';
    }
}
