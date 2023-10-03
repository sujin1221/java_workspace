package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream04 {

	public static void main(String[] args) {
		// Student 클래스를 가지는 list 생성
		// 5명 정도의 값을 추가
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",90));
		list.add(new Student("김순이",76));
		list.add(new Student("강감찬",48));
		list.add(new Student("이순신",89));
		list.add(new Student("바둑이",45));
		
		//stream 구성 후 출력 
		//toString이 존재할 경우:
		list.stream().forEach(System.out::println);
		System.out.println("-----------------");
		
		//toString이 존재하지 않을 경우:
		//{}처리: 구문이 많을 경우 필수
//		list.stream().forEach(n->{ //get을 통해 해당값 받아서
//			String name = n.getName();
//			int score = n.getScore(); 
//			System.out.println(name+":"+score); //출력
//		});
		
		//성적 합계 출력
		int listSum = list.stream()
				.mapToInt(t->t.getScore()) //변환
				.sum(); //합계
		System.out.println("합계: "+listSum);
		
		//점수가 70 이상인 인원수 출력
		int list1 = (int) list.stream() //형변환
		.filter(b->b.getScore()>=70)
		.count(); //long
		System.out.println("인원수: "+list1+"명");
		
	}

}