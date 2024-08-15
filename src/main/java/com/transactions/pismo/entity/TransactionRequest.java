package com.transactions.pismo.entity;

public class TransactionRequest {
	
	private Long accountId;
	
	private Long operationTypeId;
	
	private Double amount;
	
	public Long getAccountId() {
		return accountId;
	}
	public Long getOperationTypeId() {
		return operationTypeId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public void setOperationTypeId(Long operationTypeId) {
		this.operationTypeId = operationTypeId;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
