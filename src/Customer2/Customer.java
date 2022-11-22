package Customer2;

public class Customer {
	//필드
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//생성자
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
		

	//메소드
	private void initCustomer() {
		customerGrade = "SILVER";
	}
	
	
	public int calcPrice(int price) {
		
	}
	
	public String showCustomerInfo() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}