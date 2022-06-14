package Polymoriphsm;

public class Phonepe {

	String UPI;
	Long PhoneNumber;
	String AccountHolder;
	Long AccountNumber;

	public void transferMoney(String UPI) {

		System.out.println("PAYMENT TRANSFER to UPI Id");
		System.out.println("UPI ID :" + " " + UPI);
		System.out.println(" ");
	}

	public void transferMoney(Long PhoneNumber) {

		System.out.println("PAYMENT TRANSFER to PhoneNumber");
		System.out.println("PhoneNumber: " + PhoneNumber);
		System.out.println(" ");
	}

	public void transferMoney(String AccountHolder, Long AccountNumber) {

		System.out.println("PAYMENT TRANSFER to Bank Account");
		System.out.println("Account Holder:" + AccountHolder);
		System.out.println("Account Number:" + AccountNumber);
		System.out.println(" ");
	}

}
