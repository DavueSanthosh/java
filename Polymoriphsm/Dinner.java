package Polymoriphsm;

public class Dinner extends Food{

	public Dinner() {
		//super(2);
		System.out.println("Subway");
	}
	{
		System.out.println("Intalizer block");
	}
      @Override
    public void meat() {
    	  System.out.println("Mc D");
    	super.meat();
    }
}
