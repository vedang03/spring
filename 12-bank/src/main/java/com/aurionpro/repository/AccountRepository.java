package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
