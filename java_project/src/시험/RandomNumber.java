package 시험;

	import java.util.Scanner;
	import java.util.Random;

	public class RandomNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.print("난수의 개수를 입력하세요. : ");
	        int n = scanner.nextInt();
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            int randNum = random.nextInt(100); // 0에서 99 사이의 난수 생성
	            sum += randNum;
	        }

	        System.out.println("난수 "+n+"개의 합은 " + sum);
	    }
	}

			

	


