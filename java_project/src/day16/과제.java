package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class 과제 {

	public static void main(String[] args) {
		FoodManager fm = new FoodManager(); //add 완료
		
		fm.getList1();
		fm.getList2();
		
		ArrayList<Integer> order = new ArrayList<>();
		ArrayList<Integer> count = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		//0이 '종료'버튼이기때문에, 0이 먼저 처리될 수 있으므로 0보다 작은값을 먼저 설정해줌
		int menu = -1; //시작하는 값(0)보다 작음 상관없음
		do {
			fm.printMenu(); //메뉴 출력
			menu = scan.nextInt(); //메뉴 입력 받기
			//1번부터 5번까지는 일반메뉴, 6번은 프로그램 종료, 0번은 메뉴선택 끝
			if(menu == 6) { //종료 버튼을 누른다면
				System.out.println("==프로그램 종료=="); break;
			}
			if(menu != 0) { //만약 메뉴가 0이 아니라면
				if(menu <6) { //0이 아닌 메뉴 중에서 6보다 작다면(1~5)
					System.out.println("수량> ");
					int cnt = scan.nextInt(); //수량을 cnt에 저장
					order.add(menu); //메뉴 보관
					count.add(cnt); //개수 보관
					fm.sale(menu, cnt); //내가 주문한 메뉴와 개수를 출력 (sale: 금액 계산 메서드, 메뉴와 개수를 넣으면 금액 계산해주는 메서드)
					System.out.println("주문 종료는 0번, 프로그램 종료는 6번을 눌러주세요.");
				} else {
					System.out.println("잘못된 메뉴입니다.");
				}
			}
		}while(menu!=0); //메뉴 주문의 종료시점을 결정함
		//메뉴의 전체 금액을 출력해줘야하는 라인
		//totSum을 이미 구성함
		//order = 2-1 (get(i)) / count =3
		System.out.println("==메뉴확인==");
		for(int i=0;i<order.size();i++) {
			System.out.print(fm.getList1().get(order.get(i)-1)+" "); //order에 들어가있는 그 숫자만큼 가져올것이므로 (피자)
			System.out.print(count.get(i)+"개 "); //개수
			int price = fm.getList2().get(order.get(i)-1); //현재 주문한 가격
			System.out.println(" "+(price*count.get(i)));
		}
		System.out.println("------------");
		System.out.println("총금액: "+fm.getTotSum());
		
		scan.close();
	}
}




class FoodManager{
	private List<String> list1 = new ArrayList<String>(); //메뉴
	private List<Integer> list2 = new ArrayList<Integer>(); //금액
	private int sum; //중간합계
	private int totSum; //총합계
	//기본생성
	public FoodManager(){
		add(); 
	}
	//메뉴판 출력 메서드
	public void printMenu() {
		System.out.println("--메뉴--");
		System.out.println("1. 햄버거 7000원");
		System.out.println("2. 피자 15000원");
		System.out.println("3. 음료수 2000원");
		System.out.println("4. 과자 1000원");
		System.out.println("5. 사탕 500원");
		System.out.println("메뉴선택> ");		
	}
	//list에 값을 추가하기
	public void add() {	
		list1.add("햄버거"); //index 0번지
		list1.add("피자");
		list1.add("음료수");
		list1.add("과자");
		list1.add("사탕");
		
		list2.add(7000); //index 0번지
		list2.add(15000);
		list2.add(2000);
		list2.add(1000);
		list2.add(500);
	}	
	//금액 계산하는 메서드
	public void sale(int menu, int count) {
		//menu-1: list2의 index번호(0부터 시작, 내가 입력한건 1부터 시작함)로 사용
		sum = list2.get(menu-1)*count; //하나의 주문에 대한 금액이 출력됨
		totSum += sum; //전체금액 '미리' 저장
		System.out.println("------------------");
		System.out.println("주문하신 메뉴는 "+list1.get(menu-1)+" "+count+"개 입니다."); 
		System.out.println("금액: "+sum); //중간금액(내가 방금 주문한 금액)		
	}
	//getter setter =>가져다쓰기 위해 생성
	public List<String> getList1() {
		return list1;
	}
	public void setList1(List<String> list1) {
		this.list1 = list1;
	}
	public List<Integer> getList2() {
		return list2;
	}
	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getTotSum() {
		return totSum;
	}
	public void setTotSum(int totSum) {
		this.totSum = totSum;
	}
	
}
