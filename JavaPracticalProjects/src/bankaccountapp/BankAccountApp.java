package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		List<Account> accounts = new LinkedList<Account>();

		

		// read a csv file, then create new accounts based on that data
		String file = "D:\\WS-Robel-New\\JavaPracticalProjects\\src\\NewBankAccounts.csv";
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			//System.out.println("New Account");
			String name = accountHolder[0];
			String sSn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);

			//System.out.println(name + " " + sSn + " " + accountType + " $" + initDeposit);

			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name,sSn,initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name,sSn,initDeposit));
			}else {
				System.out.println("Error reading account type");
			}
		}
		//accesing a single element
		//accounts.get(5).showInfo();
		
		//accessing the whole elements
		for(Account acc: accounts) {
			System.out.println("***************");
			acc.showInfo();
		}
	}

}
