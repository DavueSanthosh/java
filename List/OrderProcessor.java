package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class OrderProcessor {

	Scanner scan = new Scanner(System.in);
	ArrayList<Book> bookList = new ArrayList<Book>();

	public ArrayList<Book> getOrderFromTheCustomer() {

		int bookCount;
		System.out.println("Enter the count");
		bookCount = scan.nextInt();

		
	//	for (int index = 0; index < bookCount; index++) {
		int index = 0;  

		while (index < bookCount) {
			
					
		bookList.add(getBookDataFromTheCustomer(bookCount));
		index++;

		}
		

		return bookList;

	}

	public Book getBookDataFromTheCustomer(int bookCount) {
		int id;
		int quantity;
		String name;
		String author;
		String publisher;

		System.out.println("Book ID");
		id = scan.nextInt();

		System.out.println("Quantity of the Book");
		quantity = scan.nextInt();

		System.out.println("Book name");
		name = scan.next();

		System.out.println("Author of the book");
		author = scan.next();

		System.out.println("Year of Publisher");
		publisher = scan.next();

		Book library = new Book(id, quantity, name, author, publisher);
		return library;
	}

	public void printOrderDetails(ArrayList<Book> bookList) {
		
		//for (Book book : bookList) {
		
     for (int i = 0; i < bookList.size(); i++) {
    	 Book book = bookList.get(0);
		
	
			System.out.println("Book ID : " + book.id);
			System.out.println("Book Quantity : " + book.quantity);
			System.out.println("Book Name : " + book.name);
			System.out.println("Book Author : " + book.author);
			System.out.println("Book Publisher : " + book.publisher);
     }
		}

	}

