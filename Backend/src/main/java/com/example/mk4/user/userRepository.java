package com.example.mk4.user;
import com.example.mk4.models.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepository extends JpaRepository<user,Integer>{
    Optional<user> findByEmail(String email);
}
