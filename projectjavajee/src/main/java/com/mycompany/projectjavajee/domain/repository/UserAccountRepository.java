package com.mycompany.projectjavajee.domain.repository;

import com.mycompany.projectjavajee.domain.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {
    
}
