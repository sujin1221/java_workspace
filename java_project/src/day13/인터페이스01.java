package day13;

public class 인터페이스01 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상 메서드와 상수(final)로만 이루어진 클래스
		 * 추상메서드는 선언부만 있고 구현은 없음
		 * => 키워드 : abstract이지만 인터페이스에서는 키워드를 안붙여도 상관없음 
		 * 
		 * interface 인터페이스명{
		 * - 기능 요약서
		 * - 자체적으로 사용 불가능, 인터페이스를 구현한 클래스로 활용
		 * - 구현 키워드 : implements
		 * - 인터페이스는 멤버변수가 없음, 항상 이부분을 염두에 두고 메서드 정리를 해야함
		 * }
		 * 
		 * - 상속은 단일상속이 원칙(부모는 하나)
		 * - 인터페이스 구현은 여러개가 가능함.
		 * */
		Tv t = new Tv();
		t.turnOn();
		t.channelUp();
		t.channelDown();
		t.turnOff();

	}
}
interface Power{
	abstract void turnOn();
	abstract void turnOff();	
}
interface Remocon{
	void channelUp();
	void channelDown();
}





class Tv implements Power, Remocon{ //다중구현가능
private boolean power;
private int channel;

	@Override
	public void channelUp() {
		channel++;
		if(channel>100) {
			channel=0;
		}
		System.out.println("채널: "+channel);
	}

	@Override
	public void channelDown() {
		channel--;
		if(channel<0) {
			channel=100;
		}
	System.out.println("채널: "+channel);	
	}

	@Override
	public void turnOn() {
	power = true;
	System.out.println("티비가 켜졌습니다.");		
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("티비가 꺼졌습니다.");		
	} 
	
}