package studentmanager;

import java.util.Arrays;
import java.util.Scanner;

/* 학생클래스 : 한 학생의 정보를 나타내는 클래스
 * - 학번, 이름, 주민번호, 학부, 학과, 과목s(과목 클래스를 배열로 생성[5])
 * - 멤버변수 선언, 생성자, getter setter, toString 같은 기타 메서드
 * => 학생이 수강을 신청하는 메서드, 철회하는 메서드, 기타 등등....
 * */
public class Student01{
	//멤버변수
	public int classNum = 12345; //학번
	public String studentName = "이름"; //학생 이름
	public String personNum = "000000-0000000"; //주민
	public String hakbu = "학부"; //학부
	public String major = "학과"; //학과
	public Subject[] s = new Subject[5]; //과목 5개
	int cnt = 0;
	//생성자
	public Student01() {}
	public Student01(int classNum, String studentName, String personNum, String hakbu, String major) {
		super();
		this.classNum = classNum;
		this.studentName = studentName;
		this.personNum = personNum;
		this.hakbu = hakbu;
		this.major = major;
	}
	public Student01(String studentName) { 
		this.studentName = studentName;
	}
	//과목  추가 메서드
	public void addSubject() {
		for(int i=0;i<s.length;i++) {
			System.out.println("등록할 과목을 입력해주세요.");
			Scanner scan = new Scanner(System.in);			
			String a = scan.next();		
			s[i] = new Subject();		
			s[i].setSubjectName(a);
			cnt++;
			System.out.println("과목을 추가로 입력하시겠습니까? (y/n)");
			String a1 = scan.next();	
			if(a1.equals("n")) {
				break;				
			}			
			}
	}
	public void deleteSub(Scanner scan) {	
		System.out.println("철회할 과목을 입력하세요.");
		String a = scan.next();
		int b = 0;
		for(int i=0;i<cnt;i++) {
			if(a.equals(s[i].getSubjectName())){
			b = i;			
			}
			}		
		for(int j=b;j<cnt;j++) {
			s[j] = s[j+1];	
		}		
		cnt--;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(Scanner scan) {
		this.studentName = scan.next();
	}
	public String getPersonNum() {
		return personNum;
	}
	public void setPersonNum(String personNum) {
		this.personNum = personNum;
	}
	public String getHakbu() {
		return hakbu;
	}
	public void setHakbu(String hakbu) {
		this.hakbu = hakbu;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Subject[] getS() {
		return s;
	}
	public void setS(Subject[] s) {
		this.s = s;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	@Override
	public String toString() {
		return "Student [학번: " + classNum + ", 학생명: " + studentName + ", 주민번호: " + personNum
				+ ", 학부:" + hakbu + ", 학과: " + major + "]";
	}
	public void printS() {
		for(int i=0;i<cnt;i++) {
		System.out.println(s[i]);    
	}
	}

		
		
	
	
	
	
	
	
	
	
	
	
	

}
 