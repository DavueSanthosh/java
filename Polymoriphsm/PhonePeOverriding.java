package Polymoriphsm;

class TransferMoney {

	String AccountHolder;
	Long AccountNumber;
	String UPIID;
	String UPIBarcode;

	public void BankAccount(String AccountHolder, Long AccountNumber) {

		System.out.println("Transfer payment to Bank account");
		System.out.println("AccountHolder:" + " " + AccountHolder);
		System.out.println("Account Number:" + "" + AccountNumber);
		System.out.println(" ");

	}

	public void UPI(String UPIID) {

		System.out.println("Transfer payment to UPI");
		System.out.println("UPI ID:" + UPIID);
		System.out.println(" ");

	}

}

public class PhonePeOverriding extends TransferMoney {

	@Override
	public void UPI(String UPIBarcode) {

		System.out.println(" ");
		System.out.println("Transfer payment to UPI");
		System.out.println("UPI Bracode:" + UPIBarcode);

	}

}
