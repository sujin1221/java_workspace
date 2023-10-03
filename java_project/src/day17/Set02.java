package day17;

import java.util.HashSet;

public class Set02 {

	public static void main(String[] args) {
		/* set 생성 후
		 * 1~45까지 랜덤수 6개 생성 후 출력
		 * */
		HashSet<Integer> set = new HashSet<>();	//정렬이 필요할때는 TreeSet을 사용함
		
		//while문으로 돌릴 경우
		while(set.size()!=6) { //6개가 될때까지 채워줌
		int a = (int)(Math.random()*45)+1; //랜덤값
		set.add(a);	
		}
		System.out.println(set);
		
		//for문으로 돌릴 경우
		for(int i=0;set.size()<6;i++) {
			int a = (int)(Math.random()*45)+1; //랜덤값
			set.add(a);	
			}
			System.out.println(set);
		}
		

	}
	


