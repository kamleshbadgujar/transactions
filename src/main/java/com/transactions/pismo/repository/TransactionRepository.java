package com.transactions.pismo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactions.pismo.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
