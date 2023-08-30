package day07;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 단 1개를 주고, 구구단을 출력
		 * */
				
		
		//2부터 9까지 반복하여 모든 단을 출력
		for(int i=2;i<=9;i++) {
			gugu(i);
			System.out.println();
		}
		System.out.println("--------");
		
		
	}
	/* 기능 : 단이 주어지면 그 단의 구구단을 출력(출력은 리턴x)
	 * */
	public static void gugu(int num) {
		for(int i=1;i<=9;i++) {
    System.out.println(num+"*"+i+"="+num*i);
		}
	}

	

	
	
	
	
	
	
	
}

