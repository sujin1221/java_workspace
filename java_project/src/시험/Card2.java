package 시험;

public class Card2 {
/* CardPack 클래스:
 * 카드팩 = 52장의 카드들
 * 멤버변수: 카드를 52장 담을 수 있는 배열
 * 생성자: 52장의 카드를 모두 생성
 * 메서드: 
 * 1. 카드를 섞는 기능
 * 2. 카드를 한장 빼내는 기능
 * 3. 카드 출력 => Card클래스의 print 메서드 사용
 * 4. 카드 초기화 메서드(원상복구)
 * */
	
	//멤버변수선언
		private char shape; //모양
		private int num; //숫자
		
	//생성자
	  public Card2() {
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
		  default: System.out.print(num+"");
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
		default: this.shape='♥';
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

