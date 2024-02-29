package com.partyplanner.partyplanner.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EventBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String eventName;

    @Column(nullable = false)
    private String eventDate;

    @Column(nullable = false)
    private String eventTime;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String organizerName;

    @Column(nullable = false)
    private String organizerEmail;

    // Constructors, getters, and setters
    public EventBooking() {
    }

    public EventBooking(String eventName, String eventDate, String eventTime, String location, String organizerName, String organizerEmail) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.location = location;
        this.organizerName = organizerName;
        this.organizerEmail = organizerEmail;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getOrganizerEmail() {
        return organizerEmail;
    }

    public void setOrganizerEmail(String organizerEmail) {
        this.organizerEmail = organizerEmail;
    }

    // toString method
    @Override
    public String toString() {
        return "EventBooking{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", eventTime='" + eventTime + '\'' +
                ", location='" + location + '\'' +
                ", organizerName='" + organizerName + '\'' +
                ", organizerEmail='" + organizerEmail + '\'' +
                '}';
    }
}
