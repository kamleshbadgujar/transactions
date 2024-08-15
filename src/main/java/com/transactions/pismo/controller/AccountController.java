package com.transactions.pismo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transactions.pismo.entity.Account;
import com.transactions.pismo.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	Logger log = LoggerFactory.getLogger(AccountController.class);
	
    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account accountRequest) {
    	log.info("BEGIN :: AccountController.createAccount method accountRequest {}", accountRequest );
        Account account = accountService.createAccount(accountRequest);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<Account> getAccount(@PathVariable Long accountId) {
    	log.info("BEGIN :: AccountController.createAccount method accountId {}", accountId );
        return accountService.getAccount(accountId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
