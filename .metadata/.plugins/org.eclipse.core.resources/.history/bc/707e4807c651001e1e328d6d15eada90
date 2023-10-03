package day19_과제;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student_01 s = new Student_01();
		int menu = 0;
		do {
			System.out.println("===수강관리프로그램===");
			System.out.println("1.학생등록 | 2.학생삭제 | 3.학생검색 | 4.수강등록 | 5.수강철회 | 6.종료");
			System.out.println("메뉴입력> ");
			menu = scan.nextInt();
			switch(menu) {
			case 1: s.insertStd(scan); break;
			case 2: s.deleteStd(scan); break;
			case 3: s.searchStd(scan); break;
			case 4: s.replaceSub(scan); break;
			case 5: s.deleteSub(scan); break;
			case 6: break;			
			}			
		} while(menu != 6);
		System.out.println("프로그램을 종료합니다.");
	}

}
