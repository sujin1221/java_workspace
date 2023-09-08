package day16;

public class 내부클래스 {

	public static void main(String[] args) {
		/* 내부클래스: 클래스 내부에 선언한 클래스를 말함
		 * - 외부 클래스 => 내부 클래스 (클래스 안에 클래스가 하나 더 있는 상태)
		 * - 다른 외부에서는 내부클래스를 사용할 일이 없고, 내부클래스가 외부 클래스와 밀접한 연관이 있을 경우 사용해도 무관 
		 * 
		 * - 내부적으로 사용할 목적으로 만든 클래스이기때문에 private을 붙여서 사용할 것을 권장함
		 * - 내부클래스가 생성되는 시기는 외부 클래스가 생성된 후 내부 클래스가 생성됨
		 * 익명(anonymous class) 내부클래스 => 익명클래스를 사용하기위해 내부클래스를 사용함
		 * 
		 * */
		A a = new A();
		a.outPrint();
		//B b = new B(); 생성불가능

	}

}
//외부클래스: A
class A{
	private int num = 10;
	private int num2 = 20;
	private B b;
	
	public A() {
		b = new B(); //a가 생성되면 b도 생성되게 만들기
	}
	
	class B{ //내부클래스: B 
		int inNum = 100;
		public void inPrint() {
			System.out.println("외부 클래스 num "+num);
			System.out.println("외부 클래스 num2 "+num2);
			System.out.println("내부 클래스 inNum "+inNum);
		}
		
		
	}
	public void outPrint() {
		b.inPrint(); //내부 클래스의 객체 변수를 사용하여 메서드 호출한 케이스
	}
}