package day12;

public class 상속02 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모 클래스에게 물려받은 메서드를 재정의 하는 것
		 * 부모 클래스의 메서드와 선언부가 일치해야함
		 * 접근제한자는 같거나 더 넓은 범위 접근제한자를 써야 함 => 범위 축소는 불가능함
		 * */
Dog d= new Dog();
d.info();
d.howl();

Tiger t = new Tiger("어흥히","고양이과");
t.info();
t.howl();
	}

}
//자식클래스2 
class Dog extends Animal{
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override //자바가 특정한 기능을 할 수 있는 주석
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍");
	}
	
}
//자식 클래스
class Tiger extends Animal{
	public Tiger(String name, String category) {
		super(name, category); //부모생성자 호출
		
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("어흥");
	}
	
}
//부모 클래스(만든 다음 자식 클래스 생성)
class Animal{
	private String name; //이름
	private String category; //종
	
	public Animal() {}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	//정보출력
	public void info() {
		System.out.println("이름: "+name);
		System.out.println("종: "+category);
	}
	//울음소리 나타내는 메서드
	public void howl() {
		System.out.println("=="+name+"의 울음소리==");		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
			
}