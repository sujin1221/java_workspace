package day07;

import java.util.Scanner;

public class Method05 {

	public static void main(String[] args) {
		/* 2~100까지의 소수를 출력
		 * 2~100까지 for문을 돌려서 메서드 호출하여 true라면 출력
		 * */
		for(int i=2;i<=100;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		//2부터100까지의 소수의 합계 출력
		int sum = 0;
		for(int i=2;i<=100;i++) {
			if(isPrime(i)) {
				sum += i;
			}				
			}
		System.out.println(sum);
		
		//값을 입력받아서 소수인지 아닌지 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력: ");
		int num = scan.nextInt();
//		if(isPrime(num)) {
//			System.out.println("소수입니다");
//		} else { System.out.println("소수가 아닙니다");		
//		}
		System.out.println(isPrime(num)? "소수" : "소수x");
		scan.close();

		
	}
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단(소수가 맞으면 true 아니면 false)
	 * 소수 : 1과 자기 자신만을 약수로 가지는 수
	 * 리턴타입 : boolean
	 * 매개변수 : 정수 => int num
	 * 메서드명 : isPrime
	 * */
	public static boolean isPrime(int num) {
		int cnt =0;
		for(int i=1;i<=num;i++) { //1부터 num까지 반복하여 약수의 개수를 확인
			if(num%i ==0) { //약수 찾기
				cnt++;				
			}
		}
		if(cnt == 2) {
			return true; 
		}
		return false;
	}

              
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
			


	
	


