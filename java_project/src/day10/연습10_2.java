package day10;

public class 연습10_2 {

	public static void main(String[] args) {
		/* Card 클래스 구성 
		 *  멤버변수 : 
		 * 모양 => 4가지 모양 ♥  ♣  ♠  ◆ 
		 * 숫자 => 1 10 J(11) Q(12) K(13)
		 * 생성자 : 하트1(♥1)
		 * 모양/숫자가 들어올 수 없는 값이 들어오면 => ♥1   $45(x)
		 * */
		
	}

}
class Card1{
	private char shape;
	private int num;
	
	public Card1() {
		this.shape = '♥';
		this.num = 1;
	}
	
	public void print() {
		System.out.println(shape);
		switch(num) {
		case 11: System.out.println("J"); break;
		case 12: System.out.println("Q"); break;
		case 13: System.out.println("K"); break;
		default: System.out.println(num);
		}	
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥': case '♣': case'♠': case'◆':
			this.shape = shape;
			break;
			default: this.shape = '♥'; //기본값 하트로 설정
		}		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<1 || num>13) {
			this.num = 1; //기본값 1로 설정
		} else {
		this.num = num;
	}
	}
	

	
	
	
	
	
	
	
	
	
	
		
	
}