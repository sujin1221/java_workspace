package day10;

public class CardMain {

	public static void main(String[] args) {
		CardPack cp = new CardPack();
		int index = 0;
		cp.shuffle();
		for(int i=0;i<cp.getPack().length;i++) {
		cp.getPack()[i].print();
		index++; 
		if(index%13==0) { //4줄에 13개씩 출력
			 System.out.println();
	    }
		}
		System.out.println("----------------");
		Card tmp = cp.pick();	
		tmp.print();
		System.out.println();
		System.out.println("--");
		cp.pick().print();  
		
		cp.init();
		cp.shuffle();
		System.out.println("-------------------");
		for(int i=0 ; i<cp.getPack().length ; i++) {
			cp.getPack()[i].print();
			index++; 
			if(index%13==0) { 
				 System.out.println();	
	 }	 		 
	 }
	

















	
	
	
	
}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	


