package com.partyplanner.partyplanner.mapper;

import com.partyplanner.partyplanner.Dto.AdminDto;
import com.partyplanner.partyplanner.Entity.Admin;


public class AdminMapper {

    public static AdminDto mapToAdminDto(Admin admin) {
        AdminDto adminDto = new AdminDto();
        adminDto.setId(admin.getId());
        adminDto.setEmail(admin.getEmail());
        adminDto.setPassword(admin.getPassword());
        return adminDto;
    }

    public static Admin mapToAdmin(AdminDto adminDto) {
        return new Admin(
                adminDto.getId(),
                adminDto.getEmail(),
                adminDto.getPassword());
    }
}
