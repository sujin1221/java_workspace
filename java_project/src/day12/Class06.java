package day12;

public class Class06 {

	public static void main(String[] args) {
		/* 멤버변수 : 지점 이름 반 전번
		 * 생성자 생성
		 * 메서드 : 출력(print) => 'toString'메서드을 이용해 사용 가능(출력 구문이 없으므로 'sysout'을 사용해 출력할 객체를 찍으면 출력됨)
		 * getter/setter 
		 * 
		 * 객체를 초기화하는 방법:
		 * - 생성자 : 객체를 초기화하는 방법
		 * - 기본값(null, 0) 부여
		 * - 명시적 초기화 : 멤버변수의 선언과 동시에 초기값을 명시하는 것
		 * - 초기화 블럭 : {} 멤버변수를 초기화
		 * 
		 * 초기화 우선 순위:
		 * 기본값(null)->명시적 초기화->초기화블럭->생성자
		 * 
		 * */
		EzenStudent e = new EzenStudent("인천", "김두식", "1반", "010-4040-4040");
		e.print();

	}
}
class EzenStudent{
	//매개변수 선언
	private String jijum;
	private String name;
	private String ban;
	private String phone;
	
	{ //초기화 블럭
		jijum = "incheon";
		ban = "미정";	
	}

	//생성자
	public EzenStudent() {}
	public EzenStudent(String jijum, String name, String ban, String phone) {
	this.jijum = jijum;
	this.name = name;
	this.ban = ban;
	this.phone = phone;
	}
	//메서드 출력용 하나 만들기	
	public void print() {
		System.out.println(jijum+" "+name+" "+ban+" "+phone);
	}
	//getter setter 
	public String getJijum() {
		return jijum;
	}

	public void setJijum(String jijum) {
		this.jijum = jijum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
// print 메서드 사용 방법(마우스 오른쪽 > 소스 > toString)	
//	@Override => 부모의 것을 상속받아 사용한다는 의미
//	public String toString() {
//		return "EzenStudent [jijum=" + jijum + ", name=" + name + ", ban=" + ban + ", phone=" + phone + "]";
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}