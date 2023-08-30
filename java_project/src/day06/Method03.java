package day06;

import java.util.Scanner;

public class Method03 {
	public static int add(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	public static int sunnum(int num1, int num2) {
		int result = num1-num2;
		return result;
	}
	public static int mul(int num1, int num2) {
		int result = num1*num2;
		return result;
	}
	public static double div(double num1, double num2) {
		return(double)num1/num2;
		
	}
	public static int rem(int num1, int num2) {
	 return num1%num2;
	}
	
	
	public static void main(String[] args) {
		/* 메서드를 활용한 계산기 작성
		 * 연산자 : + - / * %
		 * 두 수와 연산자를 입력받아서 메서드를 활용하여 연산
		 * */
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char ch = scan.next().charAt(0);		
		
		switch(ch) {
		case '+' : System.out.println(num1+"+"+num2+"="+add(num1, num2));   break;
		case '-' : System.out.println(num1+"-"+num2+"="+sunnum(num1,num2)); break;
		case '*' : System.out.println(num1+"*"+num2+"="+mul(num1,num2));   break;
		case '/' : System.out.println(num1+"/"+num2+"="+div(num1,num2));   break;
		case '%' : System.out.println(num1+"%"+num2+"="+rem(num1,num2));   break;
		default : System.out.println("잘못된 연산자입니다.");
		} 
		System.out.println("계산 종료~!");
		
	
		
		
		
		double[] d2 = rem2(num1, num2);
		System.out.println(d2[0]+"..."+d2[1]);
	}

	/* 기능 : 두 정수를 입력받아 두 정수의 몫과 나머지를 double[]로 리턴
	 * 리턴타입 : double 타입의 배열
	 * 매개변수 : 두 정수
	 * 변수명 : rem2
	 * % : rem2를 호출하여 몫과 나머지를 출력
	 * */	
		public static double[] rem2(int num1,int num2) {
			double d[] = new double[2];
			d[0] = num1 / num2;
			d[1] = num1 % num2;
			return d;
		}
	
	
	
}

