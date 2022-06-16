package com.example.crudprtc3.Repository;

import com.example.crudprtc3.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
