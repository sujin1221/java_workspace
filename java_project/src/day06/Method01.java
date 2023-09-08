package day06;

public class Method01 {
	
	//메서드 선언위치

	public static void main(String[] args) {
		/* 메서드 : 기능 / 함수
		 * 접근제어자(재한자) : 접근할 수 있는 주체의 제한범위 설정 가능
		 * 리턴 타입 : 메서드의 실행 결과로 받을 수 있는 정보의 값(반드시 '자료형'이어야 함)
		 * 메서드명 : 메서드의 이름은 소문자로 시작함.(클래스명만 대문자)
		 * 매개변수 : 메서드를 실행하기 위헤서 필요로 하는 값(자료형 변수형)
		 * 메서드 선언구현 :
		 * 접근제어자 리턴타입 메서드명(매개변수, 매개변수){
		 * 구현;
		 * }
		 * 메서드 선언 위치 :
		 * 클래스 안, 다른 메서드 밖
		 * */
		int sum = sum(3,5);
		System.out.println(sum);
		
		int sum1 = sum(sum, 10);
		System.out.println(sum1);
		
		int mul = mul(2,4);
		System.out.println(mul);
		
		int mul1 = mul(mul, 5);
		System.out.println(mul1);
		
		sum2(10,20);

	}
       //메서드 선언 위치
	/* 1.
	 * 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 알려줘야 하는 값 => 합(int)
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 메서드명 : sum
	 * */
	public static int sum(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	public static int mul(int num3, int num4) {
		int result = num3*num4;
		return result;
	}
	public static void sum2(int num5, int num6) {
		System.out.println(num5+num6);
		return; //메서드를 빠져나감
	}
		
	/* 2.
	 * 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타입 : int
	 * 매개변수 : int num3, int num4
	 * 메서드명 : mul
	 * */
	
	
	/* 3.
	 * 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입 : 없음(void)
	 * 매개변수 : int num1, int num2
	 * 메서드명 : sum2
	 * */
}
