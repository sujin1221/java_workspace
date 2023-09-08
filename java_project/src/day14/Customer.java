package day14;

public class Customer {
/* 고객 클래스
 * 일반고객 / Gold고객 / VIP고객 / main ㅇ
 * 
 * 멤버변수: 
 * 고객id: int customerID ㅇ
 * 고객이름: string customerName ㅇ
 * 고객등급: stirng customerGrade ㅇ
 * 보너스 포인트: int bonusPoint ㅇ
 * 보너스포인트적립비율: double bonusRatio = (bonusPoint*가격)+bonusRatio ㅇ 
 * 
 * customer 객체 생성시 
 * 기본customerGrade: Silver ㅇ 
 * 기본 bonusRatio: 0.01 ㅇ
 * 
 * 1.메서드:
 * 보너스 적립 계산 메서드(메서드명: calcPrice(int price))
 * => 보너스를 적립하고 할인여부 체크하여 구매 price 리턴
 * 구매금액을 주고, 적립보너스계산, bonusPoint 누적, 실 구매금액 리턴
 * 
 * 2.출력메서드(메서드명: customerInfo())
 * EX) '홍길동'님의 등급은 'VIP'이며, 보너스 포인트는 '1000'점입니다. ㅇ
 * 전담 상담사 번호는 1111입니다. => VIP만 출력되도록 설정
 * 
 * 3.Silver등급
 * 제품을 살떄 할인 없음
 * 보너스 포인트 1% 적립
 * 
 * 4.Gold등급
 * 제품을 구매할때 10% 할인
 * 보너스 포인트 2% 적립
 * saleRatio
 * 
 * 5.VIP등급
 * 제품을 구매할때 20% 할인
 * 보너스 포인트 5% 적립
 * 전담상담사를 갖는다.(int agentID)
 * saleRatio
 * */	
	//멤버변수
	//하위클래스에서 접근이 가능하도록 'protected' 선언
	protected int customerID; 
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;	
	//생성자
	public Customer() {}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	//보너스적립계산메서드
	//보너스를 적립하고, 할인여부 체크하여 구매, price 리턴
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio); //보너스만 계산, silver 등급은 할인이 없음! , 'int'로 형변환
		return price;
	}
	//출력메서드
	//ex) '홍길동'님의 등급은 'VIP'이며, 보너스 포인트는 '1000'입니다. 
	public String customerInfo() {
		return customerName+"님의 등급은 '"+customerGrade+"'이며, 보너스 포인트는 '"+bonusPoint+"'점 입니다.";
	}
	//getter setter
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
	
	
	
	
	
}
