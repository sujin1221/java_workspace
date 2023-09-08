package day17;

import java.util.HashMap;

public class Map02 {

	public static void main(String[] args) {
		/* Map을 이용하여 과목과 점수를 입력하고
		 * 합계와 평균을 출력하기
		 * --홍길동 점수
		 * 국어 89
		 * 영어 78
		 * 수학 96
		 * 합계:
		 * 평균:
		 * */
		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 89);
		map.put("영어", 78);
		map.put("수학", 96);
		
//		System.out.println(map.get("국어"));
//		System.out.println(map.get("영어"));
//		System.out.println(map.get("수학"));
		
		int sum = 0; 
		for(String tmp : map.keySet()) {		
			sum = sum+map.get(tmp);
			System.out.println(tmp+":"+map.get(tmp)); //value 추출
		}
		System.out.println("합계: "+sum);
		
		double avg = 0;
		avg = sum/3;
		System.out.println("평균: "+avg);

	}

}
