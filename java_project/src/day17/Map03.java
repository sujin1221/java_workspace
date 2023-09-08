package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Map03 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 과목:점수, 합계, 평균
		 * 종료 키워드가 나올때까지 반복 (종료 키워드는 0)
		 * 과목>국어 점수>89
		 * 다시입력? 종료(0) >
		 * 종료 후 과목:점수, 합계, 평균 출력
		 * */	
		HashMap<String, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		do {
		System.out.println("과목> ");
		String a = scan.next();
		System.out.println("점수> ");
		int b = scan.nextInt();
		map.put(a, b);
		System.out.println("다시입력? 종료(0) >");
		menu = scan.nextInt();
		} while(menu != 0);
		int sum = 0; 
		for(String tmp : map.keySet()) {		
			sum = sum+map.get(tmp);
			System.out.println(tmp+":"+map.get(tmp)); //value 추출
		}
		System.out.println("합계: "+sum);
		System.out.println("평균: "+sum/map.size());
		
		double avg = 0; //초기화 안하면 오류나므로 초기화 해주기
		avg = sum/3;
		System.out.println("평균: "+avg);

	}
		
		
	

}
