package Inheritance;

public class Maruti extends Car 
{

	  Maruti() 
	{
		System.out.println("Class Maruti");
	}

	public void brand(String name)
	{

		System.out.println("Brand:" + " "+name);

	}

	public void speed() {
		System.out.println("Speed:90Kmph");

	}
}
