package com.transactions.pismo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.transactions.pismo.repository.OperationTypeRepository;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionsApplication {
	
	 @Autowired
	 private OperationTypeRepository operationTypeRepository;

	public static void main(String[] args) {
		SpringApplication.run(TransactionsApplication.class, args);
	}

}
