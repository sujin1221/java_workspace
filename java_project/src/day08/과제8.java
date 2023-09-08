package day08;

import java.util.Scanner;

public class 과제8 {
	static Scanner scan = new Scanner(System.in); //(1). 입력을 위한 스캐너 열기

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성(1~9까지) => 중복x
		 * user가 3자리 숫자를 맞추면 종료되는 게임
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball
		 * 아무것도 없으면 out
		 * => 3 5 7
		 *    3 6 7 => 2strike
		 *    
		 *    3 5 7
		 *    3 7 6 => 1strike 1ball
		 *    
		 *    3 5 7
		 *    7 3 5 => 3ball
		 *    
		 *    3 5 7
		 *    1 2 6 => out
		 * 
		 * --야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자 입력(1~9, 3자리) :
		 * 3 4 5
		 * 결과
		 * 3s 다맞으면 종료(게임 횟수 출력)
		 * */
		
		//(2). 변수 선언
		int comNum[] = new int[3]; //com 배열
		int myNum[] = new int[3]; //user 배열
		int count = 0; //게임 횟수 출력용 변수
		
		//(3). 컴퓨터가 결정한 숫자를 중복되지 않게 추출
		for(int i=0;i<comNum.length;i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(comNum[i] == comNum[j]) {
					i--;
					break; //for(j)구문을 빠져나감
				}
			}
			
		}
//		for(int tmp : comNum) {
		//System.out.print(tmp+" "); //출력확인용
	
		//lotto 메서드와 randomArray 배열과 PrintArray배열을 호출
		//static 메서드는 객체 생성없이 클래스명.메서드명()으로 호출이 가능함.
//		System.out.println();
//		Lotto.randomArray(comNum);
//		Lotto.printArray(comNum);
		
		//static이 아닌 경우 : 객체를 생성하여 객체명.메서드명() 호출 가능.
//		Lotto l = new Lotto(); //객체 생성
//		l.randomArray(comNum);
//		l.printArray(comNum);
		System.out.println("야구게임 시작!");
		System.out.println("컴퓨터가 숫자를 정했습니다!");
		
		//(4). 사용자 숫자 입력받기
		while(true) {
			int s = 0; //strike 개수
			int b = 0; //ball 개수
			System.out.println("숫자 입력 > ");
			for(int i=0;i<myNum.length;i++) {
				myNum[i] = scan.nextInt();				
			}
			count++; //게임 횟수 카운트 증가
			
			//(5).숫자 비교
			for(int i=0;i<comNum.length;i++) { //컴퓨터 숫자 기준
				for(int j=0;j<myNum.length;j++) { //사용자 숫자 기준
					//strike 기준 --> 자리와 숫자가 일치
					if(comNum[i] == myNum[j] && i == j) { 
						s++;						
					} else if(comNum[i] == myNum[j] && i != j) {
						b++;
					}
				}
			}			
			//(6).출력
			if(s==0 && b==0) {
				System.out.println("==OUT!==");
			} else {
				System.out.println(s+"s "+b+"b");
				System.out.println("게임횟수: "+count);
			}
			if(s==3) {
				System.out.println("==정답~!==");
				System.out.println("게임횟수: "+count);
				break; //while구문 벗어나기!
			}
		}
		scan.close();
	
	
	}	









}