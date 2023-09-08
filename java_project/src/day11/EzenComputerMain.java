package day11;

import java.util.Scanner;

public class EzenComputerMain {

	public static void main(String[] args) {
		// EzenComputer의 객체 생성 후 출력
		EzenComputer ez = new EzenComputer("홍길동","010-4444-2222","인천");
		ez.printInfo();
		ez.printCompany();	
		ez.insertCourse("java", "6개월");
		ez.insertCourse("DB", "1개월");
		ez.printCourse();
		System.out.println("=======================");
		EzenComputer ez2 = new EzenComputer("김영희","990101",24,"010-1111-2222","서울");
		ez2.printInfo();
		ez2.insertCourse("java", "6개월");
		ez2.insertCourse("html", "2개월");
		ez2.printCourse();
			
		
		/* 학생 클래스를 담을 수 있는 배열을 생성 후
		 * 5명의 학생을 등록
		 * */
		EzenComputer[] e = new EzenComputer[7];
		e[0] = new EzenComputer("영이","990101",25,"010-2222-3333","인천");
		e[1] = new EzenComputer("철이","970101",26,"010-3333-3333","서울");
		e[2] = new EzenComputer("똘이","960101",27,"010-5555-4444","인천");
		e[3] = new EzenComputer("박이","950101",28,"010-6666-5555","인천");
		e[4] = new EzenComputer("김이","940101",29,"010-7777-6666","서울");
		e[5] = ez; //위에 있는 값 넣기 
		e[6] = ez2; //위에 있는 값 넣기
		
		e[0].insertCourse("DB", "1개월");
		e[1].insertCourse("html", "1개월");
		e[1].insertCourse("java", "1개월");
		
		/* 학생이름으로 검색 => 모든정보 출력
		 * 지점정보로 검색 => 학생정보만 출력
		 * 과목을 수강하는 학생만 검색 => 학생정보, 수강정보 출력
		 * */
		System.out.println("===============");
		String searchName = "홍길동";
		System.out.println(searchName+"님의 정보----");
//		for(int i=0;i<e.length;i++) { //범위지정
//		if(e[i].getName() == searchName) { //수강생명과 동일하다면
//			e[i].printInfo();
//			e[i].printCompany();		
//			e[i].printCourse();
//		}
//		}
		int cnt = 0; //검색결과가 없을때 출력하기 위해 필요한 cnt변수		
		
		
		for(int i=0;i<e.length;i++) {
			if(e[i].getName().equals(searchName)) { //'0번지'부터 '이름'만 따와서 그 이름과 '일치'하는지 
				e[i].printInfo(); //'이름이 일치'한다면 3가지 정보 출력
				e[i].printCompany();
				e[i].printCourse();
				cnt++;
			}			
		}    //else 사용시 반복해서 아닌값이 출력되므로 사용x
		if(cnt==0) {
			System.out.println("검색결과가 없습니다.");
		}
		
		System.out.println("==============");
		String searchBranch = "인천";	 //지점이 인천일때	
		System.out.println(searchBranch+"의 학생정보 출력");
//		for(int i=0;i<e.length;i++) { //범위지정
//			if(e[i].getBranch() == searchBranch) { //지점값과 같다면
//				e[i].printInfo();
//			}
//		}	
		
     	for(EzenComputer ez3 : e) { //향상된 for문(검색이나 사용할때만 쓰기)은 완성된 배열에서만 사용이 가능함, 배열을 만들어내는것은 불가능함(set문은 불가능)
			if(ez3.getBranch().equals(searchBranch)) {
				ez3.printInfo(); //학생정보만 출력
			}
		}
		System.out.println("===============");
		String searchCourse = "java";  //수강과목이 자바일때
//		for(int i=0;i<e.length;i++) { //전체범위 지정
//			for(int j=0;j<e[i].getCnt();j++) { //수강정보범위 잡기
//				if(e[i].getCourse()[j] == searchCourse) { //수강과목이랑 같다면
//					e[i].printInfo();
//					e[i].printCompany();
//					e[i].printCourse();
//				}
//			}		
//		}
		for(EzenComputer e2 : e) {
			for(int i=0;i<e2.getCnt();i++) {
				if(e2.getCourse()[i].equals(searchCourse)) { //equals는 순서 바뀌어도 상관x
					e2.printInfo();
					e2.printCourse();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	
	}
}


