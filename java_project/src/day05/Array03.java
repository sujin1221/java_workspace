package day05;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/* 5 자리의 숫자를 입력 받아서 입력 받은 숫자를 거꾸로 출력
		 * 각 자리의 합계 출력 
		 * ex) 11456 => 65411 => 6+5+4+1+1의 값 출력
		 * ex) 19547 => 74591 => 1+9+5+4+7의 값 출력
		 * */
		Scanner scan = new Scanner(System.in);
		int num = 0;	
		int sum = 0;
		System.out.println("5자리 숫자를 입력하세요.");
		int a = scan.nextInt();
		
		int[] arr = new int[5];
		arr[0]= a/10000;
		arr[1]= (a%10000)/1000;
		arr[2]= (a%1000)/100;
		arr[3]= (a%100)/10;
		arr[4]= (a%10)/1;
		
		for(int i=0;i<arr.length;i++) {
			//System.out.print(arr[4-i]+" ");	=> 입력 받은 값을 거꾸로 출력		
		sum += arr[i];			
		}
		System.out.println(sum);
	
		
		
		
		
		
	int num1 = scan.nextInt();
	int arr1[] = new int[5];
	//나누기(/) 나머지(%)
	//12345 => %10 => 5 => 배열에 저장
	//값을 나눈 몫만 다시 나눌값으로 지정
	//12345/10 => 정수만 저장
	//1234 => %10 => 4 => 배열에 저장
	//123 => %10 => 3 => 배열에 저장 ...
	int sum1 = 0;
	int i = 0;
	while(num1>0) { //입력받은 num가 0보다 작아지면 false로 끝남.
		int b = num%10; //마지막 자리를 나머지로 받기
		arr1[i] = b;
		sum1 += b;
		num1 = num1/10; //몫 저장 =? 정수/정수=정수
		System.out.println(arr1[i]);
		i++;		
	} System.out.print(sum1+" ");
	
		
		
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	}
		
		
		
		
		
		
		
		
		
		

	


