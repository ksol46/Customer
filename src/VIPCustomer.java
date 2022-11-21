
public class VIPCustomer extends Customer {
	//필드
	protected int agentID; //상담원 아이디
	double saleRatio; //할인비율, 등급별로 다르기 때문에 따로 또 선언해서 사용한다.
	
	
	//생성자, 클래스 이름과 같다. 기본적으로 매개변수 값을 그대로 가져오는데
	//상담원 아이디도 있기 때문에 추가 해줌
	//VIP등급에 맞는 정보 바꿔줌
	public VIPCustomer (int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
		
	}


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


	
	
	//메소드, 오버라이드 2개 시켜준다.
	
	
}
