package com.partyplanner.partyplanner.Controller;
// package com.partyplanner.partyplanner.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.partyplanner.partyplanner.Dto.AdminDto;
import com.partyplanner.partyplanner.Service.AdminService;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("")
    public ResponseEntity<List<AdminDto>> getAllAdmins() {
        List<AdminDto> admins = adminService.getAllAdmins();
        return ResponseEntity.ok(admins);
    }

    @PostMapping("/post")
    public String addAdmin(@RequestBody AdminDto dto ) {
        return adminService.addNewAdmin(dto);
    }
    // public ResponseEntity<AdminDto> createAdmin(@RequestBody AdminDto adminDto) {
    //     AdminDto newAdminDto = adminService.createAdmin(adminDto);
    //     return new ResponseEntity<>(newAdminDto, HttpStatus.CREATED);
    // }


    @GetMapping("/{id}")
    public ResponseEntity<AdminDto> getAdminById(@PathVariable("id") int id) {
        AdminDto adminDto = adminService.getAdminById(id);
        if (adminDto != null) {
            return ResponseEntity.ok(adminDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdminDto> updateAdmin(@PathVariable("id") int id, @RequestBody AdminDto adminDto) {
        AdminDto updatedAdminDto = adminService.updateAdmin(id, adminDto);
        if (updatedAdminDto != null) {
            return ResponseEntity.ok(updatedAdminDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable("id") int id) {
        adminService.deleteAdmin(id);
        return ResponseEntity.noContent().build();
    }
}
