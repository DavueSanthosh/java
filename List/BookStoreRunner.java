package List;
import java.util.ArrayList;

public class BookStoreRunner {

	public static void main(String[] args) {
		
		OrderProcessor sub=new OrderProcessor();
		sub.printOrderDetails(sub.getOrderFromTheCustomer());
		
	}	

}
