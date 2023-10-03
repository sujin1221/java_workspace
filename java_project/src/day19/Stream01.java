package day19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* stream(스트림): 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * 요소가 하나씩 흘러가는 형태로 처리
		 * 스트림을 생성하여 연산을 수행하면 스트림은 소모가 됨
		 * 재사용이 불가능함 -> 다른 연산을 수행하려면 다시 스트림 생성을 해야함
		 * 스트림 연산은 기존 자료를 변경하지 않음
		 * 
		 * 중간연산: filter(조건에 맞는 요소만 추출), distinct(중복제거), sorted(정렬), map(추출) ....
		 * 최종연산: sum(), forEach(), reduce(계산) ....
		 * */
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
		int[] arr = {10,20,30,40,50};
		IntStream arrStream = Arrays.stream(arr); //int스트림과 integer스트림은 다름
		Long cnt = arrStream.count(); //이미 소모가 됨
		//int sum = arrStream.sum(); //위에서 소모되었으므로 사용x, 다시 사용 불가능
		
		int sum = Arrays.stream(arr).sum(); //기존의 값을 쓸 수 없기 때문에 
		System.out.println(cnt);
		System.out.println(sum);
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		int sum1 = Arrays.stream(arr).filter(b->b>=30).sum();
		System.out.println(sum1);
		
		String[] str = {"a","b","c","d"};
		Stream<String> strStream = Arrays.stream(str);
		
		/* 성적 배열에서 70이상인 점수만 합계를 출력
		 * */
		int[] numArr = {50,78,96,85,45,35,12};
		int sum6 = 0;
		//기존방식:
		System.out.println("-----기존방식-----");
		for(int i=0;i<numArr.length;i++) {
			if(numArr[i]>= 70) {
				sum6 += numArr[i];
			}
		}
		System.out.println("java 구현: "+sum6);
		System.out.println("-----스트림으로 출력-----");
		//스트림으로 출력:
		int sum2 = Arrays.stream(numArr).filter(b->b>=70).sum(); //변수는 아무거나 선언해도 ㄱㅊ sum count같은 함수 뒤에는 foreach가 붙지 못함
		System.out.println("stream으로 구현: "+sum2);
		
		//리스트로 스트림 생성
		//리스트로 성적 리스트 생성 70이상인 점수만 합계
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(98);
		list.add(45);
		list.add(85);
		list.add(63);
		list.add(52);
		//sum은 int 스트림에서만 사용가능!
		int listSum = list.stream()
				.filter(n->n>=70) //조건
				.mapToInt(t->t.intValue()) //변환
				.sum(); //합계
		System.out.println("Integer Stream: "+listSum);
		
		Stream<Integer> s = list.stream();
		s.filter(b->b>=70).forEach(n-> System.out.print(n+" "));
		System.out.println(list.stream()
				.mapToInt(n->n.intValue())
				.count());
		
		
		
		
		
		
		
		
		

	}

}
