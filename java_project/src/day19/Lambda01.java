package day19;

import java.util.ArrayList;

public class Lambda01 {

	public static void main(String[] args) {
		/* Lambda Expression: 람다식
		 * 함수형 프로그래밍(Functional Programming: FP)
		 * 순수한 함수를 구현하고 호출함으로써 외부 자료의 부수적인 영향(side effect)을 주지 않도록 구현하는 방식
		 * 순수함수(pure function): 매개변수만을 사용하여 만드는 함수
		 * 즉, 함수 내부에서 함수 외부의 변수를 사용하지 않아 함수가 실행되더라도 외부의 영향을 전혀 주지 않는 형태
		 * 
		 * 리턴이 있으면 중괄호가 필요, 리턴이 없고 '처리가 하나'면 중괄호 필요x
		 * (int x, int y) -> {return x+y}
		 * str -> System.out.println(str);
		 * */
		ArrayList<Integer> num = new ArrayList<>();
		num.add(45);
		num.add(20);
		num.add(5);
		num.add(30);
		num.add(15);
		System.out.println("--일반 for문을 이용한 출력--");
		for(Integer i : num) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("--람다식을 이용한 출력--");
		//forEach
		num.forEach((n)-> System.out.print(n+" "));
		System.out.println();
		
		System.out.println("---메서드에 직접 참조---");
		//메서드에 직접 참조
		num.forEach(System.out::println); //프린트로 들어온거 바로 ㄱㄱ
		
		System.out.println("--스트림 이용한 총개수--");
		//num의 총 개수
		System.out.println(num.stream().count());
		

		

	}

}
