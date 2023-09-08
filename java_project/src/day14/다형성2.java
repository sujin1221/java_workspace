package day14;

public class 다형성2 {

	public static void main(String[] args) {
// 지금까지 한 방식:
//		Human h = new Human();
//		h.eating();
//		h.move();
		
		//부모 클래스를 이용하여 자식 클래스 생성
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		//Tiger t = new Aniaml(); //'자식 클래스'로부터 '부모클래스를 생성'하는 케이스는 안됨
		
		다형성2 test = new 다형성2();
		test.moveAniaml(hAnimal);
		test.moveAniaml(tAnimal);
		test.moveAniaml(eAnimal);
		
	
		
		
		//Tiger h = (Tiger)hAnimal;
		Tiger t = (Tiger)tAnimal;
		//h.hunting();
		t.hunting();

		
		//instanceof 연산자 true/false로 값이 나옴
		//객체명 instanceof 클래스명
		System.out.println(hAnimal instanceof Tiger); //형변환 false
		System.out.println(tAnimal instanceof Tiger); //형변환 true
		
		if(hAnimal instanceof Tiger) {
			Tiger t1 = (Tiger)hAnimal; //'true'라면 나타내기
		}
		//배열 생성
		Animal[] aniList = new Animal[5];
		int cnt = 0;
		aniList[cnt] = hAnimal;
		cnt++;
		aniList[cnt] = tAnimal;
		cnt++;
		aniList[cnt] = eAnimal;
		cnt++;
		
		System.out.println();
		test.testDownCasting(aniList, cnt);
		}
	
	//부모 형으로 객체를 생성하게 되며 자식이 개별적으로 가지고 있는 메서드를 사용할 수 없음.
	//자식이 개별로 가지고 있는 메서드를 사용하려면 다운캐스팅을 해줘야함
	//부모의 형이 아닌 자식의 형태로 변환을 해줘야함
	public void testDownCasting(Animal[] list, int cnt) {
		for(int i=0;i<cnt;i++) {
			Animal ani = list[i];
			if(ani instanceof Human) {
				Human human = (Human)ani;
				human.readbook();
			} else if(ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();				
			} else if(ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.flying();
			} else {
				System.out.println("==캐스팅 에러==");
			}
		}

	}
	public void moveAniaml(Animal animal) {
		animal.move();
	}

}
class Animal{
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
	public void eating() {
		
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readbook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 멀리 멀리 날아갑니다.");
	}
}