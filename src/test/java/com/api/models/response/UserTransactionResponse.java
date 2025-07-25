package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class UserTransactionResponse {

	private int id;
	private String transactionReference;
	private String sourceAccount;
	private String targetAccount;
	private int amount;
	private int balanceAfterTransaction;
	private String type;
	private String status;
	private String description;
	private String transactionDate;
	
	public UserTransactionResponse() {
		
	}
	public UserTransactionResponse(int id, String transactionReference, String sourceAccount, String targetAccount,
			int amount, int balanceAfterTransaction, String type, String status, String description,
			String transactionDate) {
		super();
		this.id = id;
		this.transactionReference = transactionReference;
		this.sourceAccount = sourceAccount;
		this.targetAccount = targetAccount;
		this.amount = amount;
		this.balanceAfterTransaction = balanceAfterTransaction;
		this.type = type;
		this.status = status;
		this.description = description;
		this.transactionDate = transactionDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransactionReference() {
		return transactionReference;
	}
	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}
	public String getSourceAccount() {
		return sourceAccount;
	}
	public void setSourceAccount(String sourceAccount) {
		this.sourceAccount = sourceAccount;
	}
	public String getTargetAccount() {
		return targetAccount;
	}
	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBalanceAfterTransaction() {
		return balanceAfterTransaction;
	}
	public void setBalanceAfterTransaction(int balanceAfterTransaction) {
		this.balanceAfterTransaction = balanceAfterTransaction;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	@Override
	public String toString() {
		return "UserTransactionResponse [id=" + id + ", transactionReference=" + transactionReference
				+ ", sourceAccount=" + sourceAccount + ", targetAccount=" + targetAccount + ", amount=" + amount
				+ ", balanceAfterTransaction=" + balanceAfterTransaction + ", type=" + type + ", status=" + status
				+ ", description=" + description + ", transactionDate=" + transactionDate + "]";
	}
	
	

}
