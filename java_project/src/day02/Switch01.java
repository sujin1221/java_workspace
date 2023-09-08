package day02;

public class Switch01 {

	public static void main(String[] args) {
		/* switch문 : 값에 따라 케이스를 달리주는 양식
		 * 
		 * switch(변수 또는 식){
		 * case 값1 : 실행문1; break;
		 * case 값2 : 실행문2; break;
		 * case 값3 : 실행문3; break;
		 * default : 나머지 실행문;
		 * }
		 *break; : switch문을 빠져나갈때 사용
		 * */
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("num는 1입니다.");
			break;
		case 2:
			System.out.println("num는 2입니다.");
			break;
		case 3:
			System.out.println("num는 3입니다.");
			break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
		
		//1~6까지의 숫자를랜덤으로 추출하여 주사위 : 0
		int a = (int)(Math.random()*6)+1;
		switch(a) {
		case 1:
			System.out.println("주사위 : 1칸 전진");
			break;
		case 2:
			System.out.println("주사위 : 2칸 전진");
			break;
		case 3:
			System.out.println("주사위 : 3칸 전진");
			break;
		case 4:
			System.out.println("주사위 : 4칸 전진");
			break;
		case 5:
			System.out.println("주사위 : 5칸 전진");
			break;
		case 6:
			System.out.println("주사위 : 6칸 전진");
			break;	
	default:
		System.out.println("잘못된 주사위 값입니다.");
		
		
			
		}
	}

}
