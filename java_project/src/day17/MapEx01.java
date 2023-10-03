package day17;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx01 {
	public static void main(String[] args) {
		/* map을 이용한 성적 관리 프로그램을 생성
		 * --menu--
		 * 1. 성적추가
		 * 2. 성적조회(전체출력) :합계 평균 같이 출력
		 * 3. 성적조회(과목조회) : 국어 => 98점 서치 후 일치하는 과목 출력
		 * 4. 성적수정 : 서치 후 수정
		 * 5. 성적삭제
		 * 6. 종료
		 * CRUD
		 * C(Create) 생성
		 * R(Read) 읽기(조회)
		 * U(Update) 수정
		 * D(Delete) 삭제
		 * */
		program p = new program();
		Scanner scan = new Scanner(System.in);
		while(true) {
			p.printMenu();
			int a = scan.nextInt();
			switch(a){
			case 1: 
				p.insertSub(scan);
				break;
			case 2:
				p.printSub();
				break;
			case 3:
				p.searchPrint(scan);
				break;
			case 4:
				p.change(scan);
				break;
			case 5:
				p.delete(scan);				
				break;
			case 6:
				System.out.println("종료");
				break;
				default: System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
			
			
		}

	}
	
}	
	class program{
		private HashMap<String, Integer> list1 = new HashMap<>(); //과목, 점수
		//메뉴 생성
		public void printMenu() {
			System.out.println("===성적관리프로그램===");
			System.out.println("1.성적추가");
			System.out.println("2.성적조회(전체출력)");
			System.out.println("3.성적조회(과목조회)");
			System.out.println("4.성적수정");
			System.out.println("5.성적삭제");
			System.out.println("6.종료");
			System.out.println("메뉴선택> ");
		}
		//(과목 점수) 생성
		public void insertSub(Scanner scan) {
			System.out.println("과목> ");
			String a1 = scan.next();
			System.out.println("점수> ");
			int b1 = scan.nextInt();
			list1.put(a1,b1);
			System.out.println(list1);
		}
		//(과목 점수) 삭제
		public void delete(Scanner scan) {
			System.out.println("삭제하실 과목을 입력해주세요.");
			String subject = scan.next();
			list1.remove(subject);			
		}
		//(과목 점수) 변경
		public void change(Scanner scan) {
			System.out.println("수정하실 과목을 입력해주세요.");
			String subject = scan.next();
			System.out.println("수정하실 점수를 입력해주세요.");
			int num = scan.nextInt();
			list1.replace(subject, num); //replace : 값을 바꿔주는 함수		
		}
		//(과목 점수) 검색 = > 과목별
		public void searchPrint(Scanner scan) {
			System.out.println("검색하실 과목을 입력해주세요.");
			String subject = scan.next();
			for(String tmp : list1.keySet()) {		
				if(tmp.equals(subject)) {
					System.out.println(tmp+":"+list1.get(tmp));
				}
			}
			
		}
		//(과목 점수) 검색 = > 전체
		public void printSub() {
			int sum = 0; //전체합계 
			for(String tmp : list1.keySet()) {		
				sum = sum+list1.get(tmp);
				System.out.println(tmp+":"+list1.get(tmp)); //value 추출
			}		
		}	
	}		
		
		
		
		
		
		



















