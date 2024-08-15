package com.transactions.pismo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactions.pismo.entity.OperationType;

public interface OperationTypeRepository extends JpaRepository<OperationType, Long> {
}
