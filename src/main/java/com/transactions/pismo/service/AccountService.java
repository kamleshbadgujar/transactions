package com.transactions.pismo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.transactions.pismo.entity.Account;

@Service
public interface AccountService {
	Account createAccount(Account accountRequest);
	
	Optional<Account> getAccount(Long accountId);
}
