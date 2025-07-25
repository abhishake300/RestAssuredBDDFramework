package com.api.models.request;

public class TransactionRequest {
	private String accountNumber;
	private int amount;
	private String description;

	public TransactionRequest() {

	}

	public TransactionRequest(String accountNumber, int amount, String description) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.description = description;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TransactionRequest [accountNumber=" + accountNumber + ", amount=" + amount + ", description="
				+ description + "]";
	}

	public static class Builder{
		private String accountNumber;
		private int amount;
		private String description;
		
		public Builder accountNumber(String accountNumber ) {
			this.accountNumber= accountNumber;
			return this;
		}
		public Builder amount(int amount ) {
			this.amount= amount;
			return this;
		}
		public Builder description(String description ) {
			this.description= description;
			return this;
		}
		
		public TransactionRequest build() {
			TransactionRequest transactionRequest = new TransactionRequest(accountNumber, amount, description);
			return transactionRequest;
		}
	}
}
