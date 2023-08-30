package day02;

import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/* 카페에 제출
		 * 만약 연산자의 종류가 들어오면 잘못된 입력~!!
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 + - * / %
		 * ex)
		 * 3 2 + => 3+2=5
		 * 6 3 / => 6/3=2
		* */	 
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자1를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.println("숫자2를 입력해주세요.");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요.");
		char op = scan.next().charAt(0); //한글자 입력 받기
		
		int a = num1+num2;
		int b = num1-num2;
		int c = num1*num2;
		double d = (double)num1/num2;
		int e = num1%num2;
		
		switch(op) {
		case '+': System.out.println(""+num1+op+num2+"="+a);
			break;
		case '-': System.out.println(""+num1+op+num2+"="+b);		
			break;
		case '*': System.out.println(""+num1+op+num2+"="+c);		
			break;
		case '/':  System.out.println(""+num1+op+num2+"="+d);	
			break;
		case '%': System.out.println(""+num1+op+num2+"="+e);		
			break;
			default:
				System.out.println("잘못된 입력~!!");			
		}
		scan.close();
		
		
		
        	
        
		
		
		
		
		
		
		
		

			
	
	
        	
        
        
       

		
		
			
			
			 
		
		

		
		

	}

}
