package day09;

import java.util.Scanner;

public class 과제09 {

	public static void main(String[] args) {
		//클래스 객체 생성 (2명)
		//값을 입력 후 정보 출력
		
		student stu = new student();
		
		stu.setName("김땡떙");
		stu.setAge(30);
		stu.setNum("010-1111-2222");
		stu.setAdd("인천");
		stu.print();
		
		stu.setName("이땡떙");
		stu.setAge(20);
		stu.setNum("010-3333-4444");
		stu.setAdd("서울");
		stu.print();
		
		student s4 = new student("홍길순", 23, "010-7777-8888", "서울시");
		s4.print();
		student s5 = new student("홍아이",5);
		s5.print();
		
		//입력받아 출력할때:
		student s3 = new student();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름: ");
		s3.setName(scan.next());
		System.out.println("주소: ");
		s3.setAdd(scan.next());
		System.out.println("나이: ");
		s3.setAge(scan.nextInt());
		System.out.println("전화번호: ");
		s3.setNum(scan.next());
		scan.close();				
	}

}
//클래스 생성
//학생 클래스 생성
//이름, 나이, 전화번호, 주소
//한줄로 출력 
//이름(나이) 전화번호  
class student{
	private String name; //이름
	private int age; //나이
	private String num; //전번(숫자지만 연산이 아니기 떄문 => string)
	private String add; //주소
	
	//생성자 위치
	//생성자 오버로딩 가능
	//생성자 오버로딩 조건 : 매개변수 개수가 다르거나 매개변수 유형이 다르거나 둘 중 하나
	//생성자 호출은 반드시 첫줄에서만 가능 뒤로 가면 에러 발생!
	public student() {} //필수로 작성하기, 기본 생성자는 아무것도 세팅하지 않음, 컴파일러가 자동으로 제공하는 생성자
	public student(String name, int age, String num, String add) {
		this.name = name;
		this.age = age;
		this.num = num;
		this.add = add;
	}
	public student(String name, int age) {
		this.name = name;
		this.age= age;
	}
	
	public void print() {
		System.out.println(name+"("+age+") "+ num+" "+add);
	}

// 한번에 입력해서 출력하기
//	public void input(String name, int age, String num, String add) {
//	this.name = name;
//	this.age = age;
//	this.num = num;
//	this.add = add;
//	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getNum() {
		return num;
	}
	public String getAdd() {
		return add;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setAdd(String add) {
		this.add = add; 
	}
	

	
}