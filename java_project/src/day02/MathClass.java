package day02;

public class MathClass {

	public static void main(String[] args) {
		/*Math.method
		 * 반올림(Math.round) : 소수점의 자리수는 무조건 0
		 * Math.ceil 올림, Math.floor 버림 : 자리수 0
**/
		
		
		double num = 34.666666;
		
		int roundnum = (int)Math.round(num); //retrun long
		
		
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		//Math.max 최대값, Math.min 최소값
		System.out.println(Math.max(5,3));
		System.out.println(Math.min(5,3));
			//math.random : 0과 1 사이의 아무값을 리턴
		//0<= random <1
		//(int)(math.random()*10)+1 : 1 부터 10개의 정수를 얻는 공식
		System.out.println(Math.random()); // 0은 포함, 1은 미포함
		System.out.println((int)(Math.random()*10)+1);
	}

}



