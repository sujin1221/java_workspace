package day09;

public class Methodex02 {

	public static void main(String[] args) {
		/* 두 정수의 사칙연산(+ - * / %)을 처리 
		 * */
		int a = 10;
		int b = 5;
		
		Methodex02 me = new Methodex02();
		int hap = me.sum(a, b);
		System.out.println(hap);
		
		
		
		

		
		
		
		
		
	}
	//사칙 연산의 메서드 생성(static 없이 생성)
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	public double div(int num1, int num2) {
		return (double)num1/num2;
	}
	public int rem(int num1, int num2) {
		return num1%num2;
	}

}
