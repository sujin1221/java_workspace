package day09;

public class ClassEx01 {

	public static void main(String[] args) {
		point p = new point();
		p.print();
// 멤버변수가 private으로 변경되면 직접 접근이 불가능함		
//		p.x = 1;
//		p.y = 3;
		p.setX(1);
		p.setY(3);
		p.print();
		 
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		p.setX(10);
		p.print();
		System.out.println("------------------");
		point p1 = new point();
		p.setX(100);
		p.setY(200);
		p.print();
		
		System.out.println("------------------");		
		point1 p11 = new point1();	
		p11.setX(2);
		p11.setY(3);
		p11.setZ(4);
		p11.print1();
		
	}

}
//(0,0)
class point{
	//멤버변수(자동을 초기화됨) 자리
	//멤버변수는 일반적으로 private을 사용함
	private int x;
	private int y;
	//print
	//같은 클래스의 멤버변수는 모든 메서드에서 공유됨
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	//getter : 멤버변수의 값을 가져오는 역할의 메서드
	//setter : 멤버변수의 값을 변경하는 역할의 메서드
	public int getX() {
		return x; //getX를 호출하면 x의 값을 주겠다~
	}
	public int getY() {
		return y;
	}
	public void setX(int x) { //매개변수 x와 멤버변수 x는 다름!
		this.x = x; //this는 '내 클래스의 멤버변수'를 지칭하는 키워드
	}
	public void setY(int y) {
		this.y = y;
	}
}

//point 클래스 생성
//(0,0,0)
//x,y,z 멤버변수
//print 메서드 생성
//getter/setter 생성
class point1{
	private int x;
	private int y;
	private int z;
	
	public void print1() {
		System.out.println("("+x+","+y+","+z+")");
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		this.z = z;
	}
}

















