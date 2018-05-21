package bankaccountapp;

public class Savings extends Account {
	
	//list specific properties to saving accounts
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	//constructor to initialise saving account
	public Savings(String name, String sSn, double initDeposit) {
		super(name,sSn,initDeposit);
		accountnumber = "1" + accountnumber;
		setSafetyDepositBox();
	}	
	@Override
	public void setRate() {
		rate =getBaseRate() - 0.25;
	}
	
	private void setSafetyDepositBox() {
		 safetyDepositBoxID =(int) (Math.random() * Math.pow(10, 3));
		 safetyDepositBoxKey =(int) (Math.random() * Math.pow(10, 4));
		 //System.out.println(safetyDepositBoxID);
	 }
	
	//list specific methods to saving accounts
	public void showInfo() {
		System.out.println("Account Type: Saving");
		super.showInfo();
		System.out.println(
				"Your Saving Account Features"+
				"\n Safety Deposit Box ID: " + safetyDepositBoxID+
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
		
	}
}
