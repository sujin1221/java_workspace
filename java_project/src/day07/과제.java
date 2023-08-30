package day07;

import java.util.Scanner;

public class 과제 {
       //공통변수들 선언 == 멤버 변수
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/* 계산기 만들기
		 * + - * / % 각각 메서드 만들기 => 메서드에서 바로 출력
		 * ex) 3 5 => 메뉴
		 * 원하는 대상을 선택해주세요 >
		 * 1.덧셈 2.뺼셈 3.곱셈 4.나눗셈 5.나머지
		 * 각 기능 메서드 => 바로 출력(3 + 5 = 8)
		 * 
		 * 1. 숫자를 입력받는 메서드 => 숫자를 배열에 담아 리턴
		 * 2. 메뉴 메서드 =? 메뉴를 출력하고 메뉴의 번호를 입력받아 리턴
		 * 3. 각 기능 메서드들
		 * 
		 * main에서 할 일
		 * 1)1번 메서드 호출 => 숫자의 배열을 받기
		 * 2)2번 메서드 호출 => 내 선택 번호 가져오기
		 * 3)switch(번호)
		 * 4)기능 메서드 호출
		 * */
		
		int[] a = num();      //1번 메서드 가져오기
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		int b = menu();       //2번 메서드 가져오기
		//System.out.println(b);
		
		switch(b){
			case 1 : sum(a[0],a[1]); break; //3번 메서드 호출
			case 2 : sun(a[0],a[1]); break;
			case 3 : mul(a[0],a[1]); break;
			case 4 : div(a[0],a[1]); break;
			case 5 : rem(a[0],a[1]); break;
			default : System.out.println("?????");
		    } 
		System.out.println("---계산기 종료!---"); //모든 계산이 끝나면~
	
		
		
		
		
		
		
		
	}
	
	//1. 숫자 입력받는 메서드 만들기
	//매개변수 : x
	//리턴타입 : 배열 > int[]
	//메서드명 : num
	public static int[] num() {
		System.out.println("정수 2개를 입력하세요. > ");
		int[] a = new int[2]; //숫자를 배열 2개에 담아 리턴
		a[0]= scan.nextInt();
		a[1] = scan.nextInt();
		return a;
	}
	//2. 메뉴 메서드 만들기
	//매개변수 : x
	//리턴타입 : 메뉴에서 선택한 값 => int
	//메서드명 : menu()
	public static int menu() {
		System.out.println("메뉴를 선택하세요 > ");
		System.out.println("1.덧셈 | 2.뺼셈 | 3.곱셈 | 4.나눗셈 | 5.나머지");
		int c = scan.nextInt();
		return c;
	}
	//3. 연산 기능 메서드 만들기(출력=리턴x=void)
	//리턴타입 : void
	//매개변수 : 배열
	public static void sum(int num1, int num2) {
	System.out.println(num1+"+"+num2+"="+(num1+num2));
	return;
	}
	public static void sun(int num1, int num2) {
	System.out.println(num1+"-"+num2+"="+(num1-num2));
	return;
	}
	public static void mul(int num1, int num2) {
	System.out.println(num1+"*"+num2+"="+(num1*num2));
	return;
    }		
	public static void div(int num1, int num2) {
	System.out.println(num1+"/"+num2+"="+(double)(num1/num2)); //double로 출력
	return;
    }	
	public static void rem(int num1, int num2) {
	System.out.println(num1+"%"+num2+"="+(num1%num2));
	return;				
	}
	
    }
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

