package Encapsulation;

public class Student {
	
	//nextline method is used for accepct the space between two name
	//next is not accepct the space between two name
	
	private int admissionID;
	private long phoneNumber;
	private String name;
	private String emailID;

	public int getAdmissionID() {
		return admissionID;
	}

	public void setAdmissionID(int admissionID) {
		this.admissionID = admissionID;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}
