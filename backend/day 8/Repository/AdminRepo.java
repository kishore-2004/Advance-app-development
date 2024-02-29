package com.partyplanner.partyplanner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.partyplanner.partyplanner.Entity.Admin;

public interface AdminRepo extends JpaRepository<Admin,Integer>{
    
}
