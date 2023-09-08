package studentmanager;

import java.util.Scanner;

public interface program {
	/* 수강관리프로그램
	 * 1. 인터페이스
	 * - 학생 리스트 출력 메서드
	 * - 학생을 추가하는 메서드
	 * - 학생을 검색하는 메서드
	 * - 학생의 수강신청 메서드
	 * - 학생의 수강철회 메서드
	 * 
	 * 2. 클래스
	 * - 과목클래스 (한 과목의 정보를 나타내는 클래스)
	 * - 학생클래스 (학생 기본정보 + 수강클래스[5]를 포함)
	 * - 매니저클래스 (인터페이스를 구현, 메서드 구현)
	 * - 메인 (메뉴 생성, 콘솔에 입력받아 메서드를 실행시키는 기능)
	 * - 인터페이스
	 * 
	 * 수강신청 누가? 홍길동 => 영어(수강신청메서드호출(매개변수))
	 * */
	
	void printStudent(); //학생 전체 리스트 출력
	void insertStudent(Scanner scan); //스캐너로 메서드 내부에서 입력받기 (학생추가)
	void searchStudent(Scanner scan); //스캐너로 메서드 내부에서 입력받기 (학생검색)
	void registerSubject(Scanner scan); //스캐너로 메서드 내부에서 입력받기 (과목추가)
	void deleteSubject(Scanner scan); //스캐너로 메서드 내부에서 입력받기 (과목삭제)
}
