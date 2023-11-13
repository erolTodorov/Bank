package Bank;

public class ChekingBalance extends BankAccount{ 
	
	private int freeTransaction;
	private double  transactionFee;
	
	public ChekingBalance(String owner, double balance, int freeTransaction, double transactionFee) {
		super(owner, balance);
		this.freeTransaction = freeTransaction;
		this.transactionFee = transactionFee;
	}

	

@Override
 public boolean Withdraw(double amount) {
    if (freeTransaction > 0) {
    	freeTransaction--;
    } else {
    	amount += freeTransaction;
    }
   return super.Withdraw(amount);
}
}