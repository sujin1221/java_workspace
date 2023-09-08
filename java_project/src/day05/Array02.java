package day05;

public class Array02 {

	public static void main(String[] args) {
		/* 1~10까지 담고 있는 배열 array를 생성 후 출력
		 * */
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("--------");
		
		/* 10 9 8 7 6 5 4 3 2 1 로 정렬하기 (내림차순)
		 * */	
		int[] arr1 = new int[10];
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=i+1; j<arr1.length;j++) {
			if(arr1[i]<arr[j]) {   //내림차순
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				
			} 
			
		}

	} 
		// 향산된 for문 사용 시 => for(int tmp : arr1){ system.out.print(tmp+" ");
	 for(int i=0;i<arr1.length;i++) {
		 System.out.print(arr[i]+" "); }
	
	 
	 System.out.println();
	 System.out.println("----------");
	 
	 
	 
	
	
	
	
	
	
	}
	}



