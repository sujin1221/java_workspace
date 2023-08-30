package day09;

import java.util.Scanner;

public class BaseballGame {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/* day08 과제 -> 메서드로 변경
		 * 1. 랜덤번호 생성 메서드
		 * 2. 배열에 추가하는 메서드(+중복제거 메서드) 1+2 해도 됨!
		 * 3. 출력 메서드
		 * 4. 스트라이크 메서드 => 개수 리턴
		 * 5. 볼 메서드 => 개수 리턴
		 * */
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		//랜덤수 범위
		int count = 9;
		int start = 1;
		int s=0, b=0;
		int cnt = 0; //게임횟수
		
		randomArray(comNum, count, start);
		System.out.println(">야구게임 시작!");
		System.out.println("컴퓨터가 숫자를 결정하였습니다!");
		
		while(s!=3) {
			//사용자 번호 받기
			System.out.println("1~9까지 3개의 숫자를 입력하시오.");
			for(int i=0;i<myNum.length;i++) {
				myNum[i] = scan.nextInt();
			}
			cnt++; //게임횟수 증가
			
			//결과 출력
			s = strike(comNum, myNum);
			b = ball(comNum, myNum);
			
			if(s!=0) {
				System.out.print(s+"s ");
			}
			if(b!=0) {
				System.out.print(b+"b ");
			}
			System.out.println(); //줄바꿈용
			System.out.println("게임횟수: "+cnt);
			if(s==0 && b==0) {
				System.out.println("OUT!!");
			} 
			if(s==3) {
			System.out.println("정답입니다!");
			break;
		}
		}
		
		
		

	}
	/* 랜덤번호 생성 : 매개변수로 범위 설정
	 * 매개변수 => 개수, 시작값
	 * if처리 => 개수와 시작값의 값이 바뀌어서 들어올 때 처리
	 * */
	
	//1.랜덤번호 생성 메서드(1~9)
	public static int random(int count, int start) {
		if(count < start) { //값이 바뀌어서 들어오는 경우
			int tmp = count;
			count = start;
			start = tmp;			
		}
		return (int)(Math.random()*count)+start;
	}
	//2.+중복 확인 메서드
	public static boolean isContain(int arr[], int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	//3.배열 생성 메서드
	//리턴 타입 : boolean => 배열이 잘 생성되면 true 아니면 false 리턴
	//매개변수 : 배열, count, start
	public static boolean randomArray(int arr[], int count, int start) {
		if(arr==null) {
			return false;
		}
		if(count < arr.length) {
			return false;
		}
		int i = 0;
		while(i <arr.length) {
			int r = random(count, start);
			if(!isContain(arr, r)) {
				arr[i] = r;
				i++;
			}
		}
		return true;
	}
	//4.배열 출력 메서드
	public static void printArray(int arr[]) {
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println(); //줄바꿈
	}
	//스트라이크 메서드
	//기능 : com[], my[] 위치와 값이 모두 일치하면 count 리턴
	public static int strike(int com[], int my[]) {
		int cnt = 0;
		for(int i=0;i<com.length;i++) {
			if(com[i]==my[i]) { 
				cnt++;
			}
		}
		return cnt;
	}
	//볼 메서드
	//기능 : com[], my[] 비교해서 위치 상관없이 일치하면 count 증가 리턴
	public static int ball(int com[], int my[]) {
		int cnt = 0;
		for(int i=0;i<com.length;i++) {
			if(isContain(my, com[i])) { //위치 상관없이 b,s 일치한다면
				cnt++;
			}
		}
		return cnt- strike(com, my); //스트라이크를 포함하고 있는 개수 - 스트라이크
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
