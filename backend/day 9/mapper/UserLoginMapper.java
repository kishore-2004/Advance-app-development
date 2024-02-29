package com.partyplanner.partyplanner.mapper;

import com.partyplanner.partyplanner.Dto.UserLoginDto;
import com.partyplanner.partyplanner.Entity.UserLogin;

public class UserLoginMapper {

    public static UserLoginDto mapToUserLoginDto(UserLogin userLogin) {
        UserLoginDto userdto = new UserLoginDto();
        userdto.setId(userLogin.getId());
        userdto.setEmail(userLogin.getEmail());
        userdto.setPassword(userLogin.getPassword());
        return userdto;
        // return new UserLoginDto(
        //         userLogin.getId(),
        //         userLogin.getEmail(),
        //         userLogin.getPassword()
        //         );
    }

    public static UserLogin mapToUserLogin(UserLoginDto UserLoginDto) {
        return new UserLogin(
                UserLoginDto.getId(),
                UserLoginDto.getEmail(),
                UserLoginDto.getPassword());
    }

}
