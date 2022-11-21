
public class GoldCustomer extends Customer {
	//필드
	double saleRatio; //할인율
	
	//생성자
	public GoldCustomer (int customerID, String customerName) {
		super(customerID, customerName);
		//Customer에 있는 매개변수를 호출해오지만
		//제시된 할인율이 달라서 super를 이용해 새로운 등급과 적립율을 선언해준다.
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}

	//메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price = (int)(price * saleRatio); //할인금액 리턴
				
	}
	
	
}
