package day10;

public class Class04 {

	public static void main(String[] args) {
		/* Card 클래스 생성
		 * 포커카드 
		 * 멤버변수 : 4가지의 모양(♥ ♣ ♠ ◆), 1~10까지의 숫자(j11 q12 k13)
		 * 생성자 : 하트1(♥1) => 기본값
		 * 모양/숫자가 들어올 수 없는 값이 들어오면 '♥1'로 변경되도록 세팅
		 * */
		Card c = new Card();
		c.print();
		c.setShape('♣');
		c.setNum(13);
		c.print();
		
		c.setShape('&');
		c.setNum(-5);
		c.print();
	}

}
class Card{
	private char shape; //모양
	private int num; //숫자
	
//생성자
  public Card() {
	  shape = '♥';
	  num = 1;
  }
//메서드
  public void print() {
	  System.out.print(shape);
	  switch(num) {
	  case 11: System.out.print("J "); break;
	  case 12: System.out.print("Q "); break;
	  case 13: System.out.print("K "); break;
	  default: System.out.print(num+""); //나머지 숫자
	  }
      }
public char getShape() {
	return shape;
}
public void setShape(char shape) {
	switch(shape) {
	case '♥': case '♣': case '♠': case '◆':
	this.shape = shape;
	break;
	default: this.shape='♥'; //나머지 모양은 하트로 변경!
}
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	if(num < 1 || num > 13) {
		this.num = 1;
	} else {
		this.num = num;	
	}
}
  
	
	
	
	
	
	
	
	
}
