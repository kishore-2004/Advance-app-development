package com.partyplanner.partyplanner.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.partyplanner.partyplanner.Entity.UserLogin;

public interface UserLoginRepo extends JpaRepository<UserLogin, Integer> {
    Optional<UserLogin> findByEmail(String email);
}
