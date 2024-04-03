package com.example.mk4;

import java.util.Date;

public class Ticket {
    private Integer ticketId;
    private String location;
    private String category;
    private String ticketInfo;
    private String configurationItem;
    private String priority;

    private Date opened;
    private String openedBy;
    private String state;
    private String assignmentGroup;
    private String assignedTo;
    private Date closedTime;

    protected Ticket() {}

    public Ticket(Integer ticketId, String location, String category, String ticketInfo, String configurationItem,
                  String priority, Date opened, String openedBy, String state,
                  String assignmentGroup, String assignedTo, Date closedTime){
        this.ticketId = ticketId;
        this.location = location;
        this.category = category;
        this.ticketInfo = ticketInfo;
        this.configurationItem = configurationItem;
        this.priority = priority;
        this.opened = opened;
        this.openedBy = openedBy;
        this.state = state;
        this.assignmentGroup = assignmentGroup;
        this.assignedTo = assignedTo;
        this.closedTime = closedTime;
    }

    // Getters
    public Integer getTicketId() {
        return ticketId;
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public String getTicketInfo() {
        return ticketInfo;
    }

    public String getConfigurationItem() {
        return configurationItem;
    }

    public String getPriority() {
        return priority;
    }

    public Date getOpened() {
        return opened;
    }

    public String getOpenedBy() {
        return openedBy;
    }

    public String getState() {
        return state;
    }

    public String getAssignmentGroup() {
        return assignmentGroup;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public Date getClosedTime() {
        return closedTime;
    }

    // Setters
    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    // toString method
    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", location='" + location + '\'' +
                ", category='" + category + '\'' +
                ", ticketInfo='" + ticketInfo + '\'' +
                ", configurationItem='" + configurationItem + '\'' +
                ", priority='" + priority + '\'' +
                ", opened=" + opened +
                ", openedBy='" + openedBy + '\'' +
                ", state='" + state + '\'' +
                ", assignmentGroup='" + assignmentGroup + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", closedTime=" + closedTime +
                '}';
    }
}

