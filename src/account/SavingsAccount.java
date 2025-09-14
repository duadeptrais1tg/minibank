package account;

import java.time.LocalDateTime;

public class SavingsAccount extends BankAccount implements IInterestBearing {
	private double annualInterestRate;
	public SavingsAccount(String accountNumber, String ownerName, double balance, LocalDateTime createdAt, double annuaIInterestRate) {
		super(accountNumber, ownerName, balance, createdAt);
		this.annualInterestRate = annuaIInterestRate;
	}
	@Override
	public void ApplyMonthlyInterest() {
		double tmp = annualInterestRate / 12 / 100;
		setBalance(getBalance() + getBalance() * tmp);
	}
}
