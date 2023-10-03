package day18;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		/* 제네릭(Generic) 클래스
		 * 클래스 선언시 구체적인 타입을 기재하지 않고, 사용할 수 있도록 해주는 방식
		 * <클래스>: String, Integer Student, Subject
		 * 
		 * 메인 메뉴 출력과 처리
		 * */
		SaleManager sm = new SaleManager();
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		do {
			System.out.println("메뉴입력>");
			System.out.println("1.메뉴추가 | 2.메뉴출력 | 3.주문 | 4.주문리스트 | 5.종료");
			menu = scan.nextInt();
			switch(menu) {
			case 1: sm.add(scan); break;
			case 2: sm.printProduct(); break;
			case 3: sm.orderPick(scan); break;
			case 4: sm.printOrder(); break;
			case 5: break;
			default: System.out.println("잘못된 메뉴입니다.");
			}
		} while(menu != 5);
	System.out.println("프로그램 종료");
		
		
		

	}

}
