package day02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		/* 국어 영어 수학 정수를 입력받아서
		 * 합계와 평균 평가를 출력
		 * 평가는 평균이 90이상이면 A
		 * 평균이 80 이상이면 B
		 * 70 이상이면 C
		 * 나머지는 D
		 * 입력받는 값이 0보다 작거나 100보다 크면 '잘못된 값입니다'
		 * */
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		System.out.println("국어 : "+num1);
		int num2 = scan.nextInt();
		System.out.println("영어: "+num2);
		int num3 = scan.nextInt();
		System.out.println("수학 : "+num3);
		int sum = 0;
		double avg = 0;
		sum = num1+num2+num3;
		avg = sum/3.0;
		if(avg>=90) {
			System.out.println("A");
		} else if(avg>=80) {
			System.out.println("B");
		} else if(avg>=70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		} 
		if(num1<0 || num1>100) {
			System.out.println("잘못된 값입니다.");
		} else {
			System.out.println("--------");
		} if(num2<0 || num2>100) {
			System.out.println("잘못된 값입니다.");
		} else {
			System.out.println("--------");
		} if(num3<0 || num3>100) {
				System.out.println("잘못된 값입니다.");
			} else {
				System.out.println("--------");
		}
			
		scan.close();
		
			
		}




	}
	

	
