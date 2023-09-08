package day12;

public class Class05 {

	public static void main(String[] args) {
		/* static이 붙은 멤버변수/멤버(클래스안에 포함되어 있다)메서드들은 클래스 멤버변수/메서드라고 함
		 * static이 안붙은 멤버변수/메서드들은 객체(인스턴스) 멤버변수/메서드라고 함
		 * 
		 *  - 객체 멤버변수/메서드들은 객체를 통해 사용되고 생성된다
		 *  - 각 객체마다 독립적으로 변수/메서드가 사용된다
		 *  
		 *  - 클래스 멤버변수/메서드는 클래스를 통해서 사용됨(생성도 마찬가지임)
		 *  - 클래스명.메서드/변수 호출 (객체를 통해서 호출이 가능하나 일반적으로 그렇게 하지는 않음)
		 *  - 클래스 멤버변수는 하나의 멤버변수를 모든 객체가 공유하고 사용함.
		 *  - 모든 객체들이(하나의 클래스를 통해 생성되는 모든 객체를 의미함) 동일한 값을 사용한다면 'static'을 붙이는 것을 고려할 수 있음(필수는 아님)
		 *  
		 *  클래스/객체 변수들은 생성 시점이 달라서 메서드에서 사용될 수 있는 환경도 다름
		 *  - 객체멤버는 이미 클래스가 생성된 후에 생성이 됨 / 클래스의 멤버 메서드를 객체에서는 사용할 수 있음
		 *  - 클래스 멤버 변수는 클래스/객체의 멤버에서 모두 사용 가능함
		 *  - 클래스 멤버 메서드는 클래스/객체 멤버에서 모두 사용 가능함
		 *  - 객체 멤버 변수(static이 없는)는 클래스 멤버 메서드에서 사용할 수 없음 (객체를 만들어야지만 사용할 수 있음) 
		 *  - 객체 멤버 메서드는 클래스 멤버 메서드에서 사용할 수 없음 (객체를 만들어야지만 사용할 수 있음)   
		 * */
		Tv t = new Tv();
		t.isPower();
		t.printBrand(); //클래스 멤버 메서드 호출 => 잘 사용하지 않음	
		
	}
	
}
class Tv{
	private boolean power;
	public static final String brand = "삼성"; //final : 최종변수(수정할 수 없다는 의미를 지님
	
	
	public void isPower() {
		System.out.println("제조사: "+brand);
		if(!power) {
			power =  true;
			System.out.println("티비가 켜졌습니다");
		} else {
			power = false;
			System.out.println("티비가 꺼졌습니다");
		}
	}
	public static void printBrand() {
		System.out.println("제조사: "+brand);
		//System.out.println("전원상태: "+power); => 클래스 메서드에서 객체의 멤버변수를 사용할 수 없음! 
	}
	
}
