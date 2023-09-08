package studentmanager;

public class Subject_연습 {
//멤버변수 선언
	private int subjectCode; //과목코드
	private String subjectName; //과목명
	private int credit; //학점
	private int hour; //시수
	private String teacherName; //교수명
	private int trem; //학기
	private String timeTable; //시간표
	//생성자
	public Subject_연습() {}
	//한개만 있는거
	public Subject_연습(String subjectName) {
		this.subjectName = subjectName;
	}
	//전체 다 있는거
	public Subject_연습(int subjectCode, String subjectName, int credit, int hour, String teacherName, int trem,
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
	//
	@Override
	public String toString() {
		return "Subject_연습 [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", credit=" + credit
				+ ", hour=" + hour + ", teacherName=" + teacherName + ", trem=" + trem + ", timeTable=" + timeTable
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
}
