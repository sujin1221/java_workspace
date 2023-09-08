package studentmanager;

import java.util.Scanner;

public class program_main_연습 {

	public static void main(String[] args) {
		studentManager_연습 sm = new studentManager_연습();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do{
			System.out.println("---수강관리프로그램---");
			System.out.println("1.학생들록 2.학생검색 3.학생리스트");
			System.out.println("4.수강신청 5.수강철회 6.종료");
			System.out.println("메뉴선택> ");
			menu = scan.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("학생등록메뉴>");
				sm.insertStudent(scan);				
				break;
			case 2:
				System.out.println("학생검색메뉴>");
				sm.searchStudent(scan);
				break;
            case 3:
            	System.out.println("학생조회메뉴>");
				sm.printStudent();
				break;
            case 4:
            	System.out.println("수강신청메뉴>");
            	sm.registerSubject(scan);
	            break;
            case 5:
            	System.out.println("수강철회메뉴>");
            	sm.deleteSubject(scan);
	            break;
            case 6:
            	System.out.println("종료>");	
	            break;
	default: System.out.println("잘못된 메뉴입니다!");
			}
		} while(menu != 6);
		System.out.println("---시스템 종료---");

	}

}
