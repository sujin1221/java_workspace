package day19;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream03 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬)
		 * 중복제거: .distinct()
		 * */
		int[] arr = {5,6,1,2,4,7,8,9,3,2,4,7,8};
		//중간연산의 순서는 상관없음!
		Arrays.stream(arr)
		.filter(b->b%2==0) //조건
		.sorted() //정렬
		.distinct() //중복제거
		.forEach(a->System.out.print(a+" ")); //출력
		System.out.println();
		System.out.println("----------");
		
		//홀수
		Arrays.stream(arr)
		.filter(n->n%2==1)
		.sorted()
		.distinct()
		.forEach(e-> System.out.print(e+" "));
		
		System.out.println();
		System.out.println("------------");
		
		//toArray: 배열로 리턴
		int result[] =  Arrays.stream(arr)
				.filter(n->n%2==0)
				.sorted()
				.distinct()
				.toArray(); //최종연산자이기떄문에 forEach 불가능
		for(int tmp : result) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		
		//reduce(): 계산
		//a = a+b
		//int a = 1; //초기값
		int sum = Arrays.stream(arr)
				.filter(n->n%2==0)
				.distinct()
				.reduce(1, (a,b)->a*b); //초기값,계산
		System.out.println(sum);
		
		
		
		
		

	}

}