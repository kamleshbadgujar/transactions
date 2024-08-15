package com.transactions.pismo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transactions.pismo.entity.Account;
import com.transactions.pismo.entity.OperationType;
import com.transactions.pismo.entity.Transaction;
import com.transactions.pismo.entity.TransactionRequest;
import com.transactions.pismo.repository.OperationTypeRepository;
import com.transactions.pismo.service.AccountService;
import com.transactions.pismo.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	Logger log = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private OperationTypeRepository operationTypeRepository;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionRequest transactionRequest) {
    	log.info("BEGIN :: TransactionController.createTransaction method transactionRequest {}", transactionRequest );
        Account account = accountService.getAccount(transactionRequest.getAccountId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        OperationType operationType = operationTypeRepository.findById(transactionRequest.getOperationTypeId())
                .orElseThrow(() -> new RuntimeException("Operation Type not found"));

        Transaction transaction = transactionService.createTransaction(account, operationType, transactionRequest.getAmount());
        log.info("END :: TransactionController.createTransaction method end transaction {}", transaction );
        return ResponseEntity.ok(transaction);
    }
}
