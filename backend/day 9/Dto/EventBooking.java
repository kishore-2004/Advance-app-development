package com.partyplanner.partyplanner.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventBooking {
    private Long id;
    private String EventName;
    private String EventDate;
    private String EventTime;
    private String location;
    private String organizerName;
    private String organizerEmail;
}


