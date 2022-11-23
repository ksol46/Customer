package Customer2;

import java.util.ArrayList;

public class CustomerApplication {
	protected static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public static void main(String[] args) {
		//silver
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		
		//골드 고객 (gold)
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerJeong = new GoldCustomer(10040, "정약용");
		
		//VIP 고객
		Customer customerYul = new VIPCustomer(10050, "이율곡", 12345);
		
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerJeong);
		customerList.add(customerYul);
		
		//모든 고객 정보 출력
		showAllCustomer();
		
		
	
		
	}
	
	//모든 고객 정보 출력
	public static void showAllCustomer() {
		
	}
	
	public static Customer findCustomer(int customerID) {
		
	}
	
	public static void showPriceBonus(Customer customer, int price) {
		
	}
	
	
	
}
	
