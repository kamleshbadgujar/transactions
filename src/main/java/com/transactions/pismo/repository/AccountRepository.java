package com.transactions.pismo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactions.pismo.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
