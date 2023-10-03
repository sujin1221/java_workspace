package 시험;

public class CardPack2 {

	 public static void main(String[] args) {
	        CardPack1 cp = new CardPack1();
	        int index = 0;
	      	
		for(int i=0;i<cp.getPack().length;i++) {
		cp.getPack()[i].print();
		index++; 
		if(index%13==0) { //4줄에 13개씩 출력
			 System.out.println();
	    }
		}
	}
}
class CardPack1{
		private Card2[] pack = new Card2[52];
		private int cnt = 0; //pack 배열의 index를 체크하는 용도
		//생성자
		public CardPack1() {
		                           //♥(1~13) ♣(1~13) ♠(1~13) ◆(1~13)
			char shape='♥';
			for(int i=1;i<=4;i++) { //모양 4개를 반복
				switch(i) {
				case 1: shape = '♥'; break;
				case 2: shape = '♣'; break;
				case 3: shape = '♠'; break;
				case 4: shape = '◆'; break;
				}
				for(int j=1;j<=13;j++) { //숫자
					Card2 c = new Card2(); //카드 한장 생성
					c.setShape(shape);
					c.setNum(j);
					pack[cnt] = c;
					cnt++;
				}
			}
		}
		//카드 섞은 기능
		public void shuffle() {
			for(int i=0;i<pack.length;i++) {
				int index = (int)(Math.random()*52);
				Card2 tmp = pack[i];
				pack[i] = pack[index];
				pack[index] = tmp;
			}
		}	  
		//카드 한장 빼내는 기능
		//리턴타입 Card(카드 1장)
		public Card2 pick() {
			if(cnt == 0) {
				return null;
			}
			cnt--;
			return pack[cnt]; //52
		}	
		//카드 초기화 기능 : cnt만 마지막을 다시 보내기
		public void init() {
			cnt = 52;
		}
		//getter, setter
		public Card2[] getPack() {
			return pack;
		}
		public void setPack(Card2[] pack) {
			this.pack = pack;
		}
		public int getCnt() {
			return cnt;
		}
		public void setCnt(int cnt) {
			this.cnt = cnt;
		}
		
}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	


