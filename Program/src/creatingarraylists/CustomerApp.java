package creatingarraylists;
import java.util.*;
import java.util.ArrayList;

public class CustomerApp {
private static ArrayList<Customer> custList;
	
	public static void main(String[] args) {
		//empty customer array created
		ArrayList<Customer> custList = new ArrayList<Customer>();
		//creating customer objects
		Customer cust1 = new Customer("John", 55);
		Customer cust2 = new Customer("May", 25);
		Customer cust3 = new Customer("June", 30);
		
		//adding to the array
		
		custList.add(cust1);
		custList.add(cust2);
		custList.add(cust3);
		
	//get iterator
		Iterator custIterator = custList.iterator();
	
		while(custIterator.hasNext()) {
			Customer cust = (Customer)custIterator.next();
			System.out.println(cust);
		}
		
	
	
		
	}
}
