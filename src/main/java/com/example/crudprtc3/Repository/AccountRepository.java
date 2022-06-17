package com.example.crudprtc3.Repository;

import com.example.crudprtc3.Entity.Account;
import com.example.crudprtc3.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    public Account findByUserId(Long UserId);
    public Account findByEmail(String Email);
}
