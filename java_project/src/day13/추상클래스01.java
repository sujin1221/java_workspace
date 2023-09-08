package day13;

public class 추상클래스01 {

	public static void main(String[] args) {
		/* 추상클래스 : 추상 메서드 + 일반 메서드 + 멤버변수 + 상수(final)
		 * 추상클래스는 미완성 클래스를 의미함 (객체를 생성할 수 없음)
		 * 추상메서드란 메서드의 선언부만 있고 구현은 없는 메서드
		 * 
		 * 키워드: abstract
		 * abstract 클래스명 / abstract 메서드명 앞에 추가
		 * 
		 * abstract 리턴타입 메서드명(매개변수); //추상메서드
		 * - 부모 클래스에서 상속을 받았을때 특정 메서드가 자식 클래스에서 자주 오버라이딩 될 떄 해당 메서드를 추상 메서드로 작성
		 * - 상속을 받은 클래스에서 추상메서드가 있다면 반드시 구현해야함
		 * - 내 클래스도 추상 클래스가 됨.
		 * */
		Dog d = new Dog("뽀삐", "개과");
		d.printInfo();
		d.howl();
		Cat c = new Cat("김애옹","고양이과"); //추상클래스를 구현하지않을시, 생성불가!
		c.printInfo();
		c.howl();

	}

}
//추상클래스를 상속받는 DOG, CAT 클래스 생성
//상속받은 추상클래스를 구현하지 않으면 자신의 클래스도 추상클래스여야 함!
//=> 구현하지 않을시, 객체를 생성 할 수 없음.
class Dog extends Animal{
	public Dog() {}
	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	public void howl() {
		System.out.println("멍멍");		
	}	
}
class Cat extends Animal{ 
	public Cat() {}
	public Cat(String name, String category) {
		super.name = name;
		super.category = category;
	}
	@Override
	public void howl() {
		System.out.println("애옹");
		
	}
}

//메인 밖에서 만들기
abstract class Animal{
	public String name;
	public String category;
	
	public void printInfo() {
		System.out.println("------------");
		System.out.println("이름: "+name);
		System.out.println("종류: "+category);
	}
	abstract public void howl(); //추상 메서드
}