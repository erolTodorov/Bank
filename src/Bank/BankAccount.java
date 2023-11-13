package Bank;

public class BankAccount {
	
	String  owner;
	double balance;
	
	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = 0.0;
	}
    
	public void Deposit(double amount) {
		balance += amount;
	}
	
	public boolean Withdraw(double amount) {
		
		if(balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}
	public double chekBalance () {
		return balance;
	}
	
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	} 
	
	

}
