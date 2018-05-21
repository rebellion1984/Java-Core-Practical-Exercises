package bankaccountapp;

public class Checking extends Account{

	//list specific properties to checking accounts
	private int debitCardNumber;
	private int debitCardPIN;
	//constructor to initialise checking account
	public Checking(String name, String sSn, double initDeposit) {
		super(name,sSn,initDeposit);
		accountnumber = "2" + accountnumber;
		setDebitCard();
	}
	@Override
	public void setRate() {
		rate =getBaseRate() * 0.15;
	}
	
	//list specific methods to checking accounts
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" +
				"\n Debit Card NO: " + debitCardNumber +
				"\n Debit Card Pin: "+ debitCardPIN
				);
	}
}
