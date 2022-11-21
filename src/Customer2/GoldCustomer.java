package Customer2;

public class GoldCustomer extends Customer {
	//필드
	double saleRatio; //할인율
	
	
	//생성자
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}


	//메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int)(price * saleRatio); //타입변환
		//price는 int이고, saleRatio는 double이라서 타입변환을 해줬다.
	}
	

	
	
	
	
	
}
