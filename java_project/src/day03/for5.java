package day03;

public class for5 {

	public static void main(String[] args) {
		/* 최소 공배수
		 * 공배수 : 공통된 배수
		 * 10 : 10 20 30 40 ...
		 * 15 : 15 30 45 60 ....
		 * 공배수 : 30 60 .... 
		 * 최소 공배수 : 30
		 * */				
		int num1 = 20;
		int num2 = 15;
		for(int i=num1; ;i+=num1) {        //i=i+num1
			if(i%num1==0 && i%num2==0) {
				System.out.println(i);
				break;
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
