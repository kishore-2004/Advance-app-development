package com.partyplanner.partyplanner.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PaymentHistory {
    private Long id;
    private String user;
    private String amount;
    private String paymentDate;
    private String paymentTime;

}
