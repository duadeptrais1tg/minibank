package account;

import java.time.LocalDateTime;

import exceptions.InsufficientFundsException;
import exceptions.NegativeAmountException;

public abstract class BankAccount {
	private String accountNumber;
	private String ownerName;
	private double balance;
	private LocalDateTime createdAt;
	public BankAccount(String accountNumber, String ownerName, double balance, LocalDateTime createdAt) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		this.createdAt = createdAt;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getOwnerString() {
		return ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public  void deposit(double amount) throws NegativeAmountException {
		if(amount <= 0) {
            throw new NegativeAmountException("Số tiền nạp phải lớn hơn 0.");
        }
        balance += amount;
	}
	public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
		if(amount <= 0) {
			throw new NegativeAmountException("Số tiền rút phải lớn hơn 0.");
		}
		if(amount > balance) {
			throw new InsufficientFundsException("Số dư không đủ thực hiện.");
		}
		balance -= amount;
	}
	public String printInfo() {
		return accountNumber + "-" + ownerName + "-" + balance ;
	}
}
