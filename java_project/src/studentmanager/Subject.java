package studentmanager;

import java.util.Scanner;

/* 과목클래스 : 한 과목의 기본정보를 나타내는 클래스
 * - 과목코드 과목명 학점 시수 교수명 학기 시간표
 * - 멤버변수 선언, 생성자, getter setter, 그 외 필요한 메서드
 * => toString, print 메서드
 * */
public class Subject {
	//멤버변수
	private int subjectCode; //과목코드
	private String subjectName = ""; //과목명
	private int credit; //학점
	private int hour; //시수
	private String teacherName; //교수명
	private int trem; //학기
	private String timeTable; //시간표
	
	//생성자
	public Subject() {}
	public Subject(int subjectCode, String subjectName, int credit, int hour, String teacherName, int trem,
			String timeTable) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.credit = credit;
		this.hour = hour;
		this.teacherName = teacherName;
		this.trem = trem;
		this.timeTable = timeTable;
	}
	public Subject(String subjectName) {
		this.subjectName = subjectName;
	}
	//getter setter
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTrem() {
		return trem;
	}
	public void setTrem(int trem) {
		this.trem = trem;
	}
	public String getTimeTable() {
		return timeTable;
	}
	public void setTimeTable(String timeTable) {
		this.timeTable = timeTable;
	}
	//print용
	@Override
	public String toString() {
		return "과목정보 [과목코드: " + subjectCode + ", 과목명: " + subjectName + ", 학점: " + credit + ", 시수: "
				+ hour + ", 교수명: " + teacherName + ", 학기: " + trem + ", 시간표: " + timeTable + "]";
	}

	
	
	
	

}
