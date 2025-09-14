import java.time.LocalDateTime;

import account.BankAccount;
import account.SavingsAccount;

public class Main {
	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount("0945136094", "Pham Viet Thu", 100000.12, LocalDateTime.now(), 10);
		account.ApplyMonthlyInterest();
		System.out.println(account.getBalance());
	}
}
