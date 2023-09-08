package day04;

import java.util.Scanner;

public class 과제4 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력 받아서 배열에 저장하고,
		 * 점수 합계와 평균을 출력
		 * 최대값 구하기
		 * */
		
//		Scanner scan = new Scanner(System.in);
//		int[] arr = new int[5];
//		int sum = 0;
//		double avg = 0;
//		for(int i=0; i<arr.length; i++) {
//			System.out.println("점수를 입력하세요");
//			arr[i] = scan.nextInt();
//
//			sum = sum+arr[i];
//			avg = sum / arr.length;
//			
//			System.out.println("합계 "+sum);
//			System.out.println("평균 "+avg);
//						
//		}
//		scan.close();

		
		
	
		Scanner scan = new Scanner(System.in);
		int size = 5;
		int[] arr = new int[size];
		int sum = 0;
		double avg = 0;
		int max = 0;
        int min = 100; //최소값 구하기
		
		System.out.println("정수를 입력 하세요.");
		for(int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
			sum += arr[i]; // 0+78+90+50+50+50...(누적...)
       if(max < arr[i]) { max = arr[i]; }  //최대값 0<=78 
       if(min > arr[i]){ min = arr[i]; }
		
		
		
		} avg = (double)sum / size;
          
		
		System.out.println(("합계 :"+sum));
		System.out.println("평균 :"+avg);
		System.out.println("최대값 :"+max);
		System.out.println("최소값 :"+min);
		
	     scan.close();
	
					
		
		//math.max 이용하는 방법
		//int max1=0;  int min1=100; /항상 초기값이 0은 아님
		//max1 = math.max(max1,arr[i] /둘이 비교해서 더 큰 값을 max1에 넣기
		//min1 = math.min(min1,arr[i] /둘이 비교해서 더 작은 값을 min1에 넣기
		
		
		
		
		
		
		
		
		
       
         
         
       
         
	}

}
