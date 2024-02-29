package com.partyplanner.partyplanner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.partyplanner.partyplanner.Entity.EventBooking;

public interface EventBookingRepo extends JpaRepository<EventBooking,Integer> {
    
}
