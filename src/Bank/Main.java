package Bank;

public class Main {
	public static void main(String[] args) {
    
		ChekingBalance checkingAccount = new ChekingBalance("Ano",4000,4,6);
		BankAccount account1 = new BankAccount("Abo",4000);
		SavingAccount savingsAccount = new SavingAccount ("Ado",5000,4.5);
		
		account1.Deposit(1000.0);
        checkingAccount.Deposit(2000.0);
        savingsAccount.Deposit(5000.0);

        account1.Withdraw(500.0);
        checkingAccount.Withdraw(100.0);
        savingsAccount.applyAnnualInterest();
		
		
		System.out.println("Bank Account Balance: " + account1.chekBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.chekBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.chekBalance());
}
}