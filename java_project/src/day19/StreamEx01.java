package day19;

import java.util.ArrayList;

import safe.word1;

public class StreamEx01 {

	public static void main(String[] args) {
		/* 여행상품이 있습니다.
		 * 여행 비용은 15세 이상 100만원, 15세 미만은 50만원
		 * 고객 3명이 패키지 여행을 떠나려고 합니다
		 * 1.여행비용 계산
		 * 2.고객명단 출력
		 * 
		 * 고객은 클래스로 작성, arraylist로 고객추가
		 * 고객정보
		 * 이름: 이순신, 나이: 40, 비용: 100만원
		 * 이름: 김순이, 나이: 35, 비용: 100만원
		 * 이름: 이아들, 나이: 10, 비용: 50만원
		 * 총 여행경비: 250만원
		 * */
		ArrayList<Customer> tour = new ArrayList<>();	
		tour.add(new Customer("이순신", 40));
		tour.add(new Customer("김순이", 35));
		tour.add(new Customer("이아들", 10));
		tour.stream().sorted().forEach(System.out::println);
		System.out.println("-----------------");
		int sum = tour.stream()
				.mapToInt(n->n.getPrice()) //get을 이용해서 값을 불러오고 형변환
				.sum(); //합계
		System.out.println("총 여행경비: "+sum+"만원");
		
		//나이가 20이상인 성인의 이름만 정렬하여 출력
		System.out.println("-----------------");
	tour.stream()
	.filter(n->n.getAge()>=20)//조건
	.sorted()//정렬
	.forEach(n->{
		String name = n.getName();
		int age= n.getAge();
		int price= n.getPrice();
		System.out.println(name+","+age+","+price); //출력
	});
	
	}
}
class Customer implements Comparable{
	private String name;
	private int age;
	private int price;
	
	public Customer() {}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		//여행 비용은 15세 이상 100만원, 15세 미만은 50만원
		if(this.age>=15) {
			this.price = 100;
		} else if(this.age<15) {
			this.price = 50;
		}
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age + ", 비용: " + price + "만원";
	}
	
	//정렬
	public int compareTo(Object o) {
		//Comparable: 내 클래스의 값과 매개변수로 들어오는 객체의 값을 비교
		//comparator: 이미 완성된 컬렉션에서 앞의 값과 뒤의 값을 비교
		Customer c = (Customer)o;
		return this.name.compareTo(c.name); 

	}	
}
