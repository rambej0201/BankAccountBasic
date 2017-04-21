public class Account {
	
	private int id;
	private double balance;
	private double interest;

	
	Account() {
		id = 0;
		balance = 0;
		interest = 0;
	}
	Account(int num, double b, double i) {
		id = num;
		balance = b;
		interest = i;
	}
	public int getId() {
		return id;
	}
	public void setId(int num) {
		id = num;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double b) {
		balance = b;
	}
	public double getInterest(){
		return interest;
	}
	public void setInterest(double i){
		interest = i;
	}
	
	//deposit method
	public void deposit(int amount) {
		if (amount > 0)
			balance += amount;
	}
	
	//withdraw method
	public void withdraw(int amount) {
		if (amount <= balance)
			balance -= amount;
	}
	
	//interest adding method 
	public void addInterest(int i){
		if (i > 0)
			balance = ((balance * i ) / 100) + balance;
		
	}
		
	public static void main(String[] argv) {
		
		Account a1 = new Account(1122, 0, 2);
		
		System.out.println("Account balance is "+a1.balance+" default interest rate is"+a1.interest+"%");
		a1.deposit(800); //depositing 800
		System.out.println("Account balance after first 800 depositing "+a1.balance+" default interest rate is "+a1.interest+"%");
		a1.deposit(200); //depositing more 200
		System.out.println("Account balance after second 200 deositing "+a1.balance+" default interest rate is "+a1.interest+"%");
		a1.addInterest(2); //calculating interest at default 2% and adding to balance
		System.out.println("Account balance after adding 2% interest is "+a1.balance);
		a1.withdraw(20); //withdrawing 20 from balance 
		System.out.println("Account balance after withdrawign 20 from account is "+a1.balance);
		a1.addInterest(10); //calculating interest at 10% and adding to balance
		System.out.println("Account balance after adding 10% interest is "+a1.balance);
	
	}
}