package com.transactions.pismo.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.transactions.pismo.entity.Account;
import com.transactions.pismo.entity.OperationType;
import com.transactions.pismo.entity.Transaction;
import com.transactions.pismo.repository.TransactionRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService {
	
	Logger log = LoggerFactory.getLogger(TransactionServiceImpl.class);
	
	@Autowired
    private TransactionRepository transactionRepository;
	
	@Autowired
	private AccountService accountService;

	@Override
	@Transactional
	public Transaction createTransaction(Account account, OperationType operationType, Double amount) {
		Transaction transactionRes = null;
		log.info("BEGIN :: TransactionServiceImpl.createTransaction method account, amount {}, {}", account, amount);
        Transaction transaction = new Transaction();
        transaction.setAccount(account);
        transaction.setOperationType(operationType);
        transaction.setAmount(amount);
        transaction.setEventDate(LocalDateTime.now());
        transactionRes = transactionRepository.save(transaction);
        log.info("END :: TransactionServiceImpl.createTransaction method transactionRes, {}", transactionRes);
        return transactionRes;
	}

}
