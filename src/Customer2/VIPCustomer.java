package Customer2;

public class VIPCustomer extends Customer {

	//필드
	protected int agentID;
	double saleRatio; //할인비율, 등급별로 달라서 또 다시 선언해서 사용한다.
	
	
	
	//생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}


	//적립률 정리하는 메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price - (int)(price * saleRatio);
	}



	@Override
	public String showCustomerInfo() {
		
		return super.showCustomerInfo() + ", 담당 상담원 아이디 : " + agentID;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	
	
	
	
	
	
	
}
