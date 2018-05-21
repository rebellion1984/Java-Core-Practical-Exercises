package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity;
	private int defaultPasswordLength=10;
	private String alternativeEmail;
	private String companySuffix = "anycompany.com";
	
	//constructor
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED:"+this.firstName+" "+ this.lastName);
		
		//call a method asking for department - return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password +"\n");
		
		//combine elements to general email
		email = firstName.toLowerCase() + "."+ lastName.toLowerCase() +"@"+ department +"."+ companySuffix;
		//System.out.println("Your email i:s" + email);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("New worker: " + firstName +"Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter deparment code");
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==3) {return "accounting";}
		else{return "none";}
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternativeEmail = altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternativeEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name:" + firstName +" "+ lastName +
				"\nCompany Email:" + email+
				"\nMailBox Capacity:" + mailboxCapacity + "mb";
	}
	
}
