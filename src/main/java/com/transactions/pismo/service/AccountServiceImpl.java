package com.transactions.pismo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transactions.pismo.entity.Account;
import com.transactions.pismo.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
    private AccountRepository accountRepository;

	@Override
	public Account createAccount(Account account) {
	     return accountRepository.save(account);
	}

	@Override
	public Optional<Account> getAccount(Long accountId) {
		// TODO Auto-generated method stub
		return accountRepository.findById(accountId);
	}

}
