package day19_과제;

import java.util.ArrayList;
import java.util.Scanner;
import studentmanager.Subject;

public class StudentEx {
		//수강관련작성
		//멤버변수
		private String stdName;
		private int stdAge;
		private String stdPhone;
		private ArrayList<Subject> list = new ArrayList<>(); //Subject클래스를 list로 ㄱㄱ
		
		//생성자
		public StudentEx() {}
		public StudentEx(String stdName, int stdAge, String stdPhone) {
			super();
			this.stdName = stdName;
			this.stdAge = stdAge;
			this.stdPhone = stdPhone;
		}
		
		//학생정보출력메서드
		public void stdPrint() {
			System.out.println("학생정보: "+stdName+","+stdAge+","+stdPhone);
		}
		
		//과목정보출력메서드
		public void subPrint() {
			if(list == null) { //list에 값이 없다면
				System.out.println("수강중인 과목이 없습니다.");
			}
			System.out.println("수강과목> ");
			for(Subject s : list) { //list 선언
				System.out.print(s.getSubjectName()+" "); //수강목록 출력
			}
		}
		
		//수강삭제메서드 xx
		public void deleteSubject(Scanner scan) {
			System.out.println("수강철회할 수강명을 입력해주세요.");
			String sub = scan.next();
			for(Subject s : list) { //list 선언
				if(s.getSubjectName().equals(sub)) { //수강목록하고 내가 입력한값이 일치한다면
					list.remove(s); //삭제처리
				}
			}
		}
		
		//수강추가메서드
		public void insertSub(Subject s) {
			list.add(s); //내가 입력한 값을 list에 추가
		}
		
		//getter setter
		public String getStdName() {
			return stdName;
		}
		public void setStdName(String stdName) {
			this.stdName = stdName;
		}
		public int getStdAge() {
			return stdAge;
		}
		public void setStdAge(int stdAge) {
			this.stdAge = stdAge;
		}
		public String getStdPhone() {
			return stdPhone;
		}
		public void setStdPhone(String stdPhone) {
			this.stdPhone = stdPhone;
		}
		public ArrayList<Subject> getList() {
			return list;
		}
		public void setList(ArrayList<Subject> list) {
			this.list = list;
		}

		
		
		
		

	}

