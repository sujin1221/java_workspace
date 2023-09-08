package day14;
/*  5.VIP등급
 * 제품을 구매할때 20% 할인
 * 보너스 포인트 5% 적립
 * 전담상담사를 갖는다.(int agentID)
 * saleRatio 추가해주기
 * */

/* - VIP등급
 *   제품을 구매할때 20% 할인(saleRatio) / 보너스포인트 5% 적립
 *   전담상담사를 갖는다. (int agentID)
 * */
public class VIP extends Customer{
	//멤버변수
	private int agentID;
	double saleRatio;
	//생성자
	public VIP() {}
	public VIP(int agentID, int customerID, String customerName) {
		super(customerID, customerName); //부모에게 고객아이디랑 고객명 가져오기
		customerGrade = "VIP";
		bonusRatio = 0.05; //보너스포인트 5%
		saleRatio = 0.2; //제품할인률 20%
		this.agentID = agentID;
	}
	//'VIP'용으로 가격 메서드 바꿔주기
	//할인율을 반영해야하기 때문에 가격 메서드를 재정의해야함.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //보너스
		return price-(int)(price*saleRatio); //가격할인
	}
	//'VIP'용으로 고객 출력 메서드 추가 변경
	//'VIP'등급에서는 전담상담사 번호도 추가해야하기 때문에 재정의!
	public String customerInfo() {
		return super.customerInfo()+" 전담상담사 번호는 "+agentID+" 입니다."; //부모+추가할값
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

}
