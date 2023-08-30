package day03;

import java.util.Scanner;

public class for2 {

	public static void main(String[] args) {
		/* num = 6의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 * */
    int num = 6;
    for(int i = 1; i<=num; i++) {
	    if(num%i==0) {
		System.out.print(i+" ");
	}		
}
        System.out.println();
        System.out.println("---------");	

        //num 입력받아서 그 수의 약수를 출력
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num1 = scan.nextInt();
        for(int i = 1; i<=num1; i++) {
        if(num1%i==0) {
        	System.out.print(i+" ");
        }
        scan.close();
        	}
        System.out.println();
        System.out.println("---------");	

        
        
        
	}
}

