package day04;

public class while02 {

	public static void main(String[] args) {
		/* 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * .....
		 * 42 44 46 48 50
		 * 1~50까지 짝수만 출력
		 * 5개씩 한줄로 출력
		 * */
         int k = 1;
         while(k<=50) {
        	 k++;       	 
        	 if(k%2==0) {
        		 System.out.printf("%3d",k);
        	 } if(k%10==0) 
        	 { System.out.println();
         }
         ///////for문으로 작성할 시 
        	 for(int i=1;i<=50;i++) {
        	 if(i%2==0) {
        	 System.out.print(i+" ");
        	 if(i%10==0) {
        		 System.out.println(); //줄바꿈
        		 
        	 }
         }         
         System.out.println("-------");
         } }
         
         System.out.println();
         System.out.println("출력구문");
         /* system.out.println : 줄바꿈을 포함하는 출력
          * system.out.print : 줄바꿈이 없는 출력 // 값이 없으면 에러
          * system.out.printf : 지시자를 이용한 출력
          * 
          * 서식 지정자를 통해 출력할 데이터의 섯기을 지정할 수 있음
          * %n : 줄바꿈(\n), %d : 정수형, %f :실수형, %c : 문자, %s : 문자열
          * 소수점 설정, 공백(띄어쓰기)
          */
         
         System.out.printf("%.2f%n",1.23456);
         
         int num1 = 5;
         int num2 = 3;
         //5 + 3 = 8
         System.out.printf("%d+%d=%d%n",num1,num2,(num1+num2));
         
         
         double num3 = 1.23;
         double num4 = 5;
         //1.23 / 5 = 값
         System.out.printf("%.1f/%.1f=%.1f",num3,num4,(num3/num4));
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         

	}
}
