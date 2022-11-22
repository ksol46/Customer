package Customer2;

import java.util.ArrayList;

public class CustomerApplication {
	
	private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static void main(String[] args) {
		//실버
		Customer customerKim = new Customer(001, "김영진");
		Customer customerSong = new Customer(002, "송정희");
		
		//골드
		Customer customerPark = new Customer(003, "박소희");
		Customer customerSon = new Customer(004, "손민지");
		
		//VIP
		Customer customerGo = new Customer(005, "고찬희", 0406);

		customerList.add(customerKim);
		customerList.add(customerSong);
		customerList.add(customerPark);
		customerList.add(customerSon);
		customerList.add(customerGo);
		
		
		
		
		
	}

}
