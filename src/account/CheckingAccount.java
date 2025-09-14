package account;

import java.time.LocalDateTime;

public class CheckingAccount extends BankAccount implements IFeeDeductible {
	private double fee;
	public CheckingAccount(String accountNumber, String ownerName, double balance, LocalDateTime createdAt, double fee) {
		super(accountNumber, ownerName, balance, createdAt);
		this.fee = fee;
	}
	@Override
	public void Withdraw(double amount) throw InsufficientFundsException , NegativeAmountException {
		if(amount <= 0) throw new NegativeAmountException("Số tiền rút phải lớn hơn 0.");
		double tmp = amount + fee;
		if(amount > tmp) throw new InsufficientFundsException("Số dư không đủ thực hiện")
	}
}
