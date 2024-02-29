package com.partyplanner.partyplanner.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {
    private int  id;
    private String email;
    private String password;
    // private String lastName;
}
