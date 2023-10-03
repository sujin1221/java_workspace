package day19_과제;
import java.util.ArrayList;
import java.util.Scanner;


import studentmanager.Subject;
import day19_과제.StudentEx;

public class Student_01 {
	//학생관련작성
	private ArrayList<StudentEx> list = new ArrayList<>(); //앞에 만든거 list로 ㄱㄱ
	
	//학생정보출력메서드
	public void stdPrint() {
		System.out.println("--학생정보--");
		for(StudentEx s : list) { //list 선언
			s.stdPrint(); //학생정보출력메서드 ㄱㄱ
			s.subPrint(); //수강정보출력메서드 ㄱㄱ
		}
	}
	//학생추가메서드
	public void insertStd(Scanner scan) {
		System.out.println("추가할 학생정보를 입력해주세요.");
		System.out.println("학생명: ");
		String stdName = scan.next();
		System.out.println("나이: ");
		int stdAge = scan.nextInt();
		System.out.println("연락처: ");
		String stdPhone = scan.next();
		list.add(new StudentEx(stdName, stdAge, stdPhone)); //입력한 값 넣어주기
	}
	//학생삭제메서드 xx
	public void deleteStd(Scanner scan) {
		System.out.println("삭제할 학생정보를 입력해주세요.");
		String stdName = scan.next();
		for(StudentEx s : list) {
			if(s.getStdName().equals(stdName)) { //내가 검색한값이 목록에 있다면
				s.deleteSubject(scan);
				System.out.println("학생정보가 삭제되었습니다.");
			}
		}
	}
	//학생검색메서드
	public void searchStd(Scanner scan) {
		System.out.println("검색하실 학생명을 입력해주세요.");
		System.out.println("학생명: ");
		String stdName = scan.next();
		for(StudentEx s : list) {
			if(s.getStdName().equals(stdName)) { //내가 입력한값이 목록에 존재한다면
				System.out.println("==수강생 정보==");
				s.stdPrint(); //해당하는 학생의 정보와
				s.subPrint(); //수강정보를 출력 ㄱㄱ
	}
		}
	}
	//수강추가메서드
	public void replaceSub(Scanner scan) {
		System.out.println("등록할 학생명을 입력해주세요.");
		String stdName = scan.next(); //학생명 입력
		for(StudentEx s : list) { //list 선언
			if(s.getStdName().equals(stdName)) { //내가 입력한 학생명이 목록에 있다면
				System.out.println("등록할 수강과목을 입력해주세요.");
				String sub = scan.next();
				Subject sbj = new Subject(); //과목 클래스 불러와서 
				sbj.setSubjectName(sub); //과목에 추가 ㄱㄱ
				s.insertSub(sbj); //학생수강추가메서드 ㄱㄱ
				return;				
			}
		}
	
	}
	//수강철회메서드 xx
	public void deleteSub(Scanner scan) {
		System.out.println("수강철회 할 학생명을 입력해주세요.");
		String stdName = scan.next();
		for(StudentEx s : list) {
			if(s.getStdName().equals(stdName)) {
				s.deleteSubject(scan);
				System.out.println("철회가 완료되었습니다.");
			}
		}
	}
	

}




