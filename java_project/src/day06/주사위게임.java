package day06;

import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 수 : 1부터 6까지 랜덤 수 출력
		 * ex)
		 * 주사위 3 => 3칸 이동 => "27칸 남았습니다" 출력
		 * 주사위 6 => 6칸 이동 => "??칸 남았습니다" 출력
		 * ...
		 * 도착~~!! 총 이동 횟수: ?번 완주 
		 * */
		Scanner scan = new Scanner(System.in);
		int random = 0;
		int num = 30; //목표값
		int sum = 0; //합산거리
		int cnt = 0; //이동횟수
		while(sum<num) { //true값이 되어야 반복			
			System.out.println("주사위를 던지려면 엔터를 누르세요");
			scan.nextLine();			
			random = (int)(Math.random()*6)+1; //random 수 생성
			sum += random; //거리합산
			cnt++;
			System.out.println("주사위"+random+"칸 이동"+(num-sum)+"칸 남았습니다");
		} System.out.println("완주~!! 총 이동횟수: "+cnt);
			scan.close();
	
			
		
		

	

}
}
