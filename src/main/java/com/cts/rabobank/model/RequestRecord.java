package com.cts.rabobank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

@XmlRootElement(name = "record")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestRecord {
	@XmlAttribute(name = "reference")
	@JsonProperty(value="Reference")
	private int transactionRef;
	@JsonProperty(value="Account Number")
	private String accountNumber;
	@JsonProperty(value="Start Balance")
	private double startBalance;
	@JsonProperty(value="Mutation")
	private double mutation;
	@JsonProperty(value="Description")
	private String description;
	@JsonProperty(value="End Balance")
	private double endBalance;
	private boolean isValid;

	private static final NumberFormat formatter = new DecimalFormat("#0.00");

	public void checkBalanceValidation(){
		this.isValid=Double.parseDouble(formatter.format((this.getStartBalance() + this.getMutation()))) == Double.parseDouble(formatter.format(this.getEndBalance()));
	}


	public int getTransactionRef() {
		return transactionRef;
	}
	public void setTransactionRef(int transactionRef) {
		this.transactionRef = transactionRef;
	}
	public double getStartBalance() {
		return startBalance;
	}
	public void setStartBalance(double startBalance) {
		this.startBalance = startBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getMutation() {
		return mutation;
	}
	public void setMutation(double mutation) {
		this.mutation = mutation;
	}
	public double getEndBalance() {
		return endBalance;
	}
	public void setEndBalance(double endBalance) {
		this.endBalance = endBalance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonIgnore
	@JsonProperty(value = "valid")
	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean valid) {
		isValid = valid;
	}
}
