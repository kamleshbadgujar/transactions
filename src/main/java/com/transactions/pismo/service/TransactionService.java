package com.transactions.pismo.service;

import org.springframework.stereotype.Service;

import com.transactions.pismo.entity.Account;
import com.transactions.pismo.entity.OperationType;
import com.transactions.pismo.entity.Transaction;

@Service
public interface TransactionService {
	Transaction createTransaction(Account account, OperationType operationType, Double amount);
}
