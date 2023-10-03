package StudentManager2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import studentmanager.studentManager_연습;

public class StudentManager implements Program{
	//멤버변수 Student List
	private List<Student> student = new ArrayList<>();
	
//	//필수적으로 출력을 원한다면
//	public StudentManager() {
//		add();
//	}

	//기본 학생 추가 메서드
	public void add() {
		student.add(new Student("홍길동",16,"010-1111-1111"));
		student.add(new Student("김순이","010-1111-2222"));
		student.add(new Student("이순신","010-3333-3333"));
		student.add(new Student("강감찬",16,"010-1111-5555"));
		student.add(new Student("바둑이"));
	}
	
	@Override
	public void addStd(Scanner scan) {
		System.out.println("추가하실 학생명을 입력해주세요.");
		String std = scan.next();
		student.add(new Student(std));	
		System.out.println("학생등록완료!");
	}

	@Override
	public void printStd() {
		//학생 기본정보 출력
		System.out.println("------학생명단------");
		for(int i=0;i<student.size();i++) {
			System.out.println(student.get(i));			
		}
		System.out.println("------------------");
		
	}

	@Override
	public void searchStd(Scanner scan) {
		//학생명을 입력받아 학생정보를 출력
		System.out.println("검색하실 학생명을 입력해주세요.");
		String std = scan.next();
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getName().equals(std)) {
				student.get(i).printOne();
				return;
			}
		}
		System.out.println("검색한 학생을 찾을 수 없습니다.");
	}

	@Override
	public void modStd(Scanner scan) {
		//수정할 정보(이름,나이,전번)
		System.out.println("학생명> ");
		String name = scan.next();
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("수정할 정보> ");
				String op = scan.next();
				switch(op) {
				case "이름": System.out.println("수정할 값> ");
				String modName = scan.next();
				student.get(i).setName(modName);
					break;					
				case "나이": System.out.println("수정할 값> ");
					int modAge = scan.nextInt();
					student.get(i).setAge(modAge);				
					break;
				case "전화번호": System.out.println("수정할 값> ");
					String modPhon = scan.next();
					student.get(i).setPhone(modPhon);
					break;	
					default: System.out.println("존재하지 않습니다.");
				}
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");
	}

	@Override
	public void delStd(Scanner scan) {
		//remove는 index 삭제 가능, remove 삭제가 가능
		System.out.println("삭제할 학생이름을 입력해주세요.");
		String name = scan.next();
//		for(int i=0;i<student.size();i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.remove(i);
//				System.out.println("삭제가 완료되었습니다.");
//			}			
//			}
//		System.out.println("학생이 존재하지 않습니다.");
		//remove(object) 삭제=> object 자체로 이름이 일치하면 같은 객체라는 것을 인지
		student.remove(new Student(name));
		if(!student.remove(new Student(name))) { //true false로 리턴하므로 앞에 ! 붙여줌
			System.out.println("학생이 존재하지 않습니다.");
			return;
		}
		student.remove(new Student(name));
	}

	@Override
	public void addSub(Scanner scan) {
	//학생명/과목/점수를 입력받아 수강신청 메서드 호출
		System.out.println("학생명> ");
		String name = scan.next();
		System.out.println("과목명> ");
		String sub = scan.next();
		System.out.println("점수> ");
		int score = scan.nextInt();
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).addSubject(sub, score);
				return;
			}
		}
		System.out.println("학생이 없습니다.");		
	}

	@Override
	public void modSub(Scanner scan) {
		//학생명 과목 점수 입력받아 과목수정 메서드 호출
		System.out.println("학생명> ");
		String name = scan.next();
		int score = scan.nextInt();
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).delSubject(name);
				student.get(i).addSubject(name, score);				
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");
	}

	@Override
	public void delSub(Scanner scan) {
		System.out.println("학생명: ");
		String name = scan.next();
		System.out.println("과목명: ");
		String sub = scan.next();
		int i = index(name);
		if(i == -1) {
			System.out.println("학생이 존재하지 않습니다.");
		} else {
		student.get(i).delSubject(sub);
		}
	}
//		for(int i=0;i<student.size();i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.get(i).delSubject(sub);
//				return;
//			}
//		}				
	
	//학생명을 주고 그 학생명의 위치를 리턴하는 메서드
	public int index(String name) {
		for(int i=0;i<student.size();i++) {
			if(student.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1; //0번지 포함이기떄문에 아니면 -1로 리턴
	}

}
