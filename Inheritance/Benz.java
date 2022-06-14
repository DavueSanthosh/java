package Inheritance;

public class Benz extends Maruti 
{

	  Benz()
	{
		System.out.println("Class Benz");
	}

	public void speed() 
	{
      super.speed();
		System.out.println("Speed:100Kmph");

	}

}
