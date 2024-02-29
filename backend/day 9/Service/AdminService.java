package com.partyplanner.partyplanner.Service;
// package com.partyplanner.partyplanner.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.partyplanner.partyplanner.Dto.AdminDto;
import com.partyplanner.partyplanner.Entity.Admin;
import com.partyplanner.partyplanner.mapper.AdminMapper;
import com.partyplanner.partyplanner.Repository.AdminRepo;
// import com.partyplanner.partyplanner.Repository.AdminRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepository;

    public List<AdminDto> getAllAdmins() {
        List<Admin> admins = adminRepository.findAll();
        List<AdminDto> adminDtos = new ArrayList<>();
        for (Admin admin : admins) {
            adminDtos.add(AdminMapper.mapToAdminDto(admin));
        }
        return adminDtos;
    }

    // public AdminDto createAdmin(AdminDto adminDto) {
    //     Admin admin = AdminMapper.mapToAdmin(adminDto);
    //     Admin savedAdmin = adminRepository.save(admin);
    //     return AdminMapper.mapToAdminDto(savedAdmin);
    // }
    public String addNewAdmin(@RequestBody AdminDto dto) {
        Admin admin = new Admin();
        admin.setEmail(dto.getEmail());
        admin.setPassword(dto.getPassword());
        return "added";
    }

    public AdminDto getAdminById(int id) {
        Admin admin = adminRepository.findById(id).orElse(null);
        return AdminMapper.mapToAdminDto(admin);
    }

    public AdminDto updateAdmin(int id, AdminDto adminDto) {
        Admin existingAdmin = adminRepository.findById(id).orElse(null);
        if (existingAdmin != null) {
            existingAdmin.setEmail(adminDto.getEmail());
            existingAdmin.setPassword(adminDto.getPassword());
            Admin updatedAdmin = adminRepository.save(existingAdmin);
            return AdminMapper.mapToAdminDto(updatedAdmin);
        }
        return null;
    }

    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
}
