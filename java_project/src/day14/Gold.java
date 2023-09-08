package day14;
//* - Gold등급
//*   제품을 구매할때 10% 할인(saleRatio=0.1) / 보너스포인트 2% 적립
public class Gold extends Customer{
	//멤버변수
	double saleRatio;
	//생성자
	public Gold() {}
	public Gold(int customerID, String customerName) {
		super(customerID, customerName); //부모에게서 가져오기
		customerGrade = "Gold"; //등급 = 골드
		saleRatio = 0.1; //10% 할인
		bonusRatio = 0.02;	//2% 보너스 적립
	}
	//메서드
	//'Gold'용으로 가격 메서드 바꿔주기
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio); //보너스, int로  형변환해줘야함
		price -= (int)(price*saleRatio); //가격할인
		return price;
	}
	//getter setter
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

}