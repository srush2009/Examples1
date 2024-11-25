interface IBankAccount{
	double processOperation(String message);
}
class BankOperations implements IBankAccount{
	private double balance;
	
	public BankOperations(double initialBalance) {
		this.balance = initialBalance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}else {
			System.out.println("ineffi amt");
		}
	}
	@Override
	public double processOperation(String message) {
		String[] words = message.split(" ");
		double value = 0;
		
		for(String word : words) {
			try {
				value = Double.parseDouble(word);
				break;
			}catch(NumberFormatException e) {
				//ig
			}
		}
		message = message.toLowerCase();
		
		if(message.contains("deposit")|| message.contains("invest")|| message.contains("transfer")) {
			deposit(value);
		}else if(message.contains("withdraw")) {
			withdraw(value);
		}else {
			System.out.println("Op not recognized");
		}
		return balance;
	}
}

public class MainBank {
	public static void main(String[] args) {
		BankOperations bo = new BankOperations(2000.0);
		System.out.println("Ini balance - " + bo.processOperation(""));
		
	}

}
