package day18;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Set03 {

	public static void main(String[] args) {
		// 검색: ArrayList, LinkedList: 삽입 삭제에 유리
		// 어던 list, set, map이든 선언 -> 메서드 사용
		// 내부 동작하는 구조가 좀 다름
		// 각 list, set, map마다 본인만의 메서드 다름
		// set: treeset => 검색에 유리, 순차로 데이트를 정렬해서 저장
		
		//해당 점수들 중 가장 큰 점수와 가장 작은 점수를 출력
		int[] score = {80,89,94,78,59,84,56,60,80,90,70};
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int i =0;i<score.length;i++) {
			set.add(score[i]);
		}
		System.out.println(set);
		
		//first(): 가장 앞에 있는 값 출력
		//last(): 가장 뒤에 있는 값 출력
		System.out.println("최소값: "+set.first());
		System.out.println("최대값: "+set.last());
		
		//headSet: 지정된 객체보다 작은 값(앞) 출력
		//tailSet: 지정된 객체보다 큰 값(뒤) 출력
		System.out.println("80보다 작은 값: "+set.headSet(80)); //80보다 작은 객체
		System.out.println("80보다ㅣ 큰 값: "+set.tailSet(80)); //80보다 큰 객체
	
		//subSet: 범위를 set으로 추출
		//범위를 검색 (70은 포함 90은 미포함)
		System.out.println("70~90 사이"+set.subSet(70, 90)); //끝값은 미포함
		
		//내림차순 정렬 가능
		NavigableSet<Integer> desSet = set.descendingSet();
		System.out.println(desSet);

	}

}
