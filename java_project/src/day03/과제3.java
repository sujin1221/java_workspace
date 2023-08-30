package day03;

import java.util.Scanner;

public class 과제3 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50 사이의 랜덤 수를 생성하여 맞추는 게임
		 * ex)컴퓨터가 랜덤으로 수를 생성 :  35
		 * 입력 > 10
		 * up~!!
		 * 입력> 20
		 * UP~!!
		 * 입력>40
		 * down~!!
		 * 입력>35
		 * 정답~!!
		 * */		
		Scanner scan = new Scanner(System.in);
	    int a = (int)(Math.random()*50)+1;
	    
	    for(;;) 
	    {		
	    System.out.println("수를 입력하시오.");		
		int num = scan.nextInt();
		
		if(a==num) {
			System.out.println("정답~!!");
			break;
		} else if(a>num) {
			System.out.println("up~!!");
		} else {
			System.out.println("down~!!"); }
	    }
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	}


