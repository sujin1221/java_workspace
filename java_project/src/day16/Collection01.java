package day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크: 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리할때 사용 (주로 배열 대신 List를 사용)
		 * 
		 * List
		 * - 배열과 동작하는 방식이 동일함
		 * - 값을 하나씩 저장
		 * - 중복을 허용함
		 * - index(번지)를 가짐
		 * - 배열 대신 가장 많이 사용함!
		 * Set
		 * - 값을 하나씩 저장 
		 * - 중복을 허용하지않음 (중복값이 있으면 버림)
		 * - index(번지)가 없음 (for문 사용 불가능)
		 * - index가 없으므로 순서를 보장하지 않음 (자기맘대로 출력함, 랜덤값 생성할때 많이 사용함, 정렬 못함)
		 * Map
		 * - 값을 2개씩 저장 (한 주소 안에 값이 2개씩 들어감) => key/value 쌍으로 저장 
		 * - key는 중복 불가능하나 value는 중복이 가능함
		 * - 만약 key가 중복되면 덮어쓰기가 됨
		 * - 아이디/패스워드처럼 같이 묶어서 하나의 자료로 저장해야할때 많이 사용함
		 * - 순서 보장하지 않음 (set과 동일)
		 * 
		 * ex) int arr[] = new int[5]; => 숫자만 넣겠습니다~라는 형태...(기본자료형태으로 사용가능)
		 * collection에서는 클래스로 데이터를 관리함
		 * int => Integer, String만 제외한 나머지 자료형은 첫글자만 대문자로 바꾸면 클래스가 됨!
		 * ex) long=> Long, byte => Byte, double => Double ...
		 * 클래스를 지정하지 않으면 Object가 자동으로 들어감
		 * */
		
		List list3 = new ArrayList(); //object가 자동으로 들어간 케이스
		List<Integer> list = new ArrayList<Integer>(); //일반적으로 선언하는 방법
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //이렇게도 가능하다
		
		//add(): 리스트에 요소를 추가
		list.add(10);
		list.add(20);
		list.add(30);	
		System.out.println(list); //'toString'이 포함되어 있으므로 바로 값이 출력됨
		
		//size(): list의 개수를 리턴
		System.out.println(list.size()); //3이 출력됨
		
		//문자열만 가능한 ArrayList 생성 후 3개 추가 후 출력
		List<String> list1 = new ArrayList<>(); //<string>: 앞에서는 무조건 작성 뒤에는 생략해도 됨
		list1.add("가");
		list1.add("나");
		list1.add("다");
		System.out.println(list1);
		System.out.println(list1.size());
		
		//list2에 1부터 10까지 입력하고, 출력
		for(int i=1;i<=10;i++) {
			list2.add(i);
		}
		for(int i=1;i<=10;i++) {
			list2.add(i); //중복가능!
		}
		System.out.println(list2);	
		
		//get(index): index 번지의 값을 가져옴
		System.out.println(list2.get(0));
		
		//set(index, 값): index 번지의 값을 변경함
		list2.set(0, 3); //0번지의 값을 3으로 변경
		System.out.println(list2);
		
		//list2의 모든 요소를 출력
		for(int i=0;i<list2.size();i++) {	
			//System.out.print(list2.get(i)+" ");
			if(list2.get(i)%2==0) {
				System.out.print(list2.get(i)+" ");
		}
		
			
		}
		System.out.println();
		//remove(index): index 번지의 값을 삭제, remove(object): object의 객체를 삭제함
		list2.remove(0); //0번지의 값이 삭제됨
		System.out.println(list2);
		Integer a = 10;
		list.remove(a); //처음 만난 객체 '10'을 삭제(전부 삭제x)
		System.out.println(list2);
		
		//contains(object): list에 있는지 없는지 검사, true/false로 리턴
		System.out.println("-------------");
		System.out.println(list2.contains(a));
		
		//clear(): 리스트 비움
		list2.clear();
		System.out.println(list2);
		
		//isEmpty(): list가 비워있는지 체크 true/false로 리턴
		System.out.println(list2.isEmpty());
		System.out.println(list2);
		
		//list2에 1부터 5까지 값을 추가하고 각 요소를 출력하기
		System.out.println("==============");
		for(int i=1;i<=5;i++) {
		list2.add(i);
	}
		System.out.println(list2);
	
		//향상된 for문을 사용하여 하나씩 출력할떄:
		for(int tmp : list2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		//index를 사용할 수 없는 컬렉션을 출력하기 위해 사용하는 객체
		//Iterator: index가 없는 컬렉션을 출력하기 위해 사용
		/* list는 index가 있기 떄문에 get(i)를 사용가능
		 * set, map은 순서를 보장하지않기 때문에 for 사용불가
		 * 향상된 for문, Iterator처럼 순서와 상관없이 값을 가져올 수 있는 구문에서 출력이 가능함
		 * */
		
		System.out.println("> Iterator 출력");
		Iterator<Integer> it = list2.iterator();
		while(it.hasNext()) { //요소가 있는지 체크
			Integer tmp = it.next(); //다음요소 가져오기
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		//indexOf(값): 값의 index 번지를 리턴 / 없으면 -1을 리턴해줌
		Integer b = 5;
		System.out.println(list2.indexOf(b)); //원래 원칙은 오브젝트를 넣어야하나
		//System.out.println(list2.indexOf(5)); //이것도 가능함
		
		//sort(객체)
		//- 객체: comparator 인터페이스를 구현한 객체를 넣어야함.(내부(익명) 클래스를 사용함)
		list2.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//o1-o2:오름차순     o2-o1:내림차순
				return o2-o1; //내림차순
			}
		});
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
}
}