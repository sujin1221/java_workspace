package 게임;

public class 룰렛 {

	public static void main(String[] args) {
		int min = 0;	// 최소값
		int max = 99;	// 최대값						
		double roulette;
		
		roulette = (int) (Math.random() * (max + 1 - min)) + min;
		String item = ""; //조건
		if ( 0 <= roulette && roulette <= 2 ){
			// 확률 : 3%
			item = "마우스";
		}else if( 3 <= roulette && roulette <= 4 ){
			// 확률 : 2%
			item = "헤드셋";
		}else if( 5 <= roulette && roulette <= 5 ){
			// 확률 : 1%
		  	item = "키보드";
		}else{
			// 나머지 꽝
			item = "꽝";
		}
	}
}

