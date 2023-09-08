package day06;

public class Method02 {

	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public static int sunnum(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);				
	}
	public static double div(double num1, double num2) {
		return (double)num1 / num2;			
	}
	public static void rem(int num1, int num2) {
		int result = num1 % num2;				
	}
	
	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기 작성
		 * 
		 * 메서드는 + - * / %
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		 * +일때 호출 => 메인에서 출력
		 * -일때 호출 => 메인에서 출력
		 * *일떄 호출 => 메서드에서 출력
		 * /일떄 호출 => 메서드에서 출력 => 리턴을 double로 설정
		 * %일떄 호출 => 메서드에서 출력
		 * */
		int sum = sum(3,5);
		System.out.println(sum);
		
		int sunnum = sunnum(5,1);
		System.out.println(sunnum);

		mul(10,20);
		double num3 = div(10,20);
		System.out.println(num3);
		rem(10,20);
		int method01 = Method01.sum(10, 30); //Method01클래스에서 정의한 sum메서드 호출
		System.out.println(method01);
		
		//다른 클래스에 있는 메서드를 사용(static 있는 경우)
		//=> 클래스명.메서드명
		//클래스 => 정의서 => 객체를 생성해서 메서드를 사용
		//현재 시점에서 객체 생성없이 메서드를 사용할 수 있는 이유는 static 때문.
		
		//(static이 없는 경우) : 선언만 해놓고 생성이 되어있지 않다는 것을 의미
		//객체를 생성 => 클래스 필요
		Method02 me = new Method02(); //클래스 생성
		int s = me.sum(20,30); //메서드 호출
		System.out.println("me 객체 생성 후 sum 호출: "+s);
		
		
	}

}
