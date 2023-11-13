package Bank;

public class SavingAccount extends BankAccount {
   private double annualInterestRate;
   

public SavingAccount(String owner, double balance, double annualInterestRate) {
	super(owner, balance);
	this.annualInterestRate = annualInterestRate;
} 
   
  public void applyAnnualInterest() {
	  double interest = balance * (annualInterestRate / 100.0);
		  balance += interest;
	  }
  }
