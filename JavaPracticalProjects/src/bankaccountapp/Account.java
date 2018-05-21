package bankaccountapp;

//we named it abstract, because we are not going to create classes from it
public abstract class Account implements IBaseRate {

	// list common properties for saving and checking accounts
	private String name;
	private String sSn;
	private double balance;
	
	protected String accountnumber;
	protected double rate;
	private static int index = 10000;

	// constructor to set base properties and initialise the account
	public Account(String name, String sSn, double initDeposit) {
		this.name = name;
		this.sSn = sSn;
		this.balance = initDeposit;

		// set account number
		index++;
		this.accountnumber = setAccountNumber();
		setRate();
	}

	/*
	 * abstract method to force both classes (Savings and Checking) to have their
	 * own implementations of rate. For example, rate for Checking could be 15%
	 * (0.15) and for Savings could be 25% (2.25)
	 */

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoOfSSN = sSn.substring(sSn.length() - 2, sSn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;

	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance +accruedInterest;
		System.out.println("Accrued Interest: £"+accruedInterest);
		printBalance();
	}

	// list common methods - transactions
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing £" + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing £" + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering £" + amount + "to" + toWhere);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}

	public void showInfo() {
		System.out.println(
				"Name: " + name + "\nAccount No: " + accountnumber + "\nBalance: " + balance + "\nRate: " + rate + "%");
	}
}
