package day04;

import java.util.Scanner;

public class while연습 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 나 자신의 수만 가지는 수
		 * 소수 : 3,5,7,11,13,17
		 * */
          
		/* num를 입력받아서 num가 소수인지 아닌지 판별
		 * ex) num = 13 => 소수입니다.
		 *     num = 12 => 소수가 아닙니다.
		 * */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int num = scan.nextInt();
//		int count = 0;
//		for(int i=1;i<=num;i++) {
//		if(num%i==0) {
//			//System.out.print(i+"  ");
//			count = count +1; //count++;
//		}			
//			}
//		if(count ==2) {
//			System.out.println("소수입니다");
//		} else { System.out.println("소수가 아닙니다");
//		}
//		scan.close();
	
		
		
		
		//2~100까지 중 소수 출력				
		int count1 = 0;
		for(int k=2; k<=100; k++) { //num 2~100까지
			count1 = 0; //각 num마다 약수의 개수를 0부터 시작
			for(int i=1;i<=k;i++) { //약수를 구하기 위해 돌려야 하는 값
				if(k%i==0) { //약수
					count1++;
				}
			}
			//약수 2개인지 체크
			if(count1 == 2) {
				System.out.print(k+" ");
			} 			
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}		
	}


