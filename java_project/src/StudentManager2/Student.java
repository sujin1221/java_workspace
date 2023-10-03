package StudentManager2;

import java.util.HashMap;
import java.util.Objects;

public class Student {
	/* 멤버변수: 이름, 나이, 전번, map<과목,점수>, 합계, 평균
	 * 생성자: 객체 생성시 초기값을 결정하는 역할을 함
	 * getter setter
	 * 출력용 toString
	 * */
	private String name;
	private int age;
	private String phone;
	private HashMap<String,Integer> subject = new HashMap<>();
	private int sum;
	private double avg;
	
	public Student() {}

	public Student(String name) {
		this.name = name;
		this.age = 15;
	}
	public Student(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public HashMap<String, Integer> getSubject() {
		return subject;
	}

	public void setSubject(HashMap<String, Integer> subject) {
		this.subject = subject;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	//메서드 등록
	//각 학생별 본인의 점수 등록, 출력, 삭제, 수정(삭제->추가)
	//수강정보	
	//합계, 평균 출력
	//점수가 없으면 없습니다로 출력
	public void printOne() { //학생 검색시 나오는 출력화면
		System.out.println(name+"("+age+")");
		if(phone != null) {
			System.out.println(phone);
		}
		printSubject();
		calc(); //합계 평균 계산
		//합계 평균 출력
		if(sum != 0) {
			System.out.println("result: "+sum+"["+avg+"]");
		} else {
			//점수가 없을 경우
			System.out.println("점수가 없습니다.");
		}
		System.out.println("------------------------");
	}	
	
	//subject 출력 메서드
	public void printSubject() {
		for(String tmp: subject.keySet()) {
			System.out.println(tmp+": "+subject.get(tmp));
		}
	}
	
	//subject의 점수 합계, 평균 구하는 메서드
	public void calc() {
		this.sum = 0;
		this.avg = 0;
		for(String tmp : subject.keySet()) {
			sum += subject.get(tmp);
		}
		avg = (double)sum/subject.size();
	}
	
	//점수등록메서드
	public void addSubject(String subject, int score) {
		this.subject.put(subject, score);
		System.out.println("점수 추가 완료!");
	}
	
	//과목점수삭제메서드
	public void delSubject(String subject) {
		if(this.subject.remove(subject) == null) {
			System.out.println("해당 과목이 없습니다.");
			return;
		} else {
			this.subject.remove(subject);
			System.out.println("점수 삭제 완료!");
		}
	}

	@Override
	public String toString() {
		return "name: " + name + " (" + age + ") "+ ((phone != null)? phone : "");
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //주소일치
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}

}
