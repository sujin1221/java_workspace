package day03;

import java.util.Scanner;

public class for4 {

	public static void main(String[] args) {
		/* 최대 공약수 찾기
		 * 약수 : 1 부터 자기자신까지 나누어서 떨어지는 수
		 * 공약수 : 두 정수의 공통된 약수
		 * 최대공약수 : 공약수 중 가장 큰 값
		 * 8 : 1 2 48 
		 * 12 : 1 2 3 4 6 12
		 * 공약수 : 1 2 4 => 4
		 * */

		//두 정수 num1, num2를 입력받아 최대 공약수를 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int gcd = 0;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0 && num2%i==0) {
				// i => 공약수
				gcd = i;
				
			}				
		}
    System.out.println(gcd);
	
	/* 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
	 * break;
	 * 중첩 for믄일 경우 if문을 포함하는 가장 가까운 for문만 벗어날 수 있음
	 * 벗어나고 싶은 for문에 닉네임을 지어 해당 닉네임의 for문을 벗어날 수 있음
	 * */
    for(int i = num1; ; i--) {
    	if(num1%i==0 && num2%i==0) {
    		System.out.println("두 수의 최대 공약수: "+ i);
    		break;    		
    	}
    }
    scan.close();
    
    int i = 0;
	a: for(;; ) {
		for(;; ) {
			for(;; ) {				
					i++;
					if(i==10) {
						System.out.println(i+"벗어나기..");
					break a;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		}
		
		
		
		
		
		
		
		
		
	


