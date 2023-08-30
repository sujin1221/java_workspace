package day05;

public class ArrayCopy {

	public static void main(String[] args) {
		/* arraycopy : 배열 복사
		 * 객체를 다시 생성해서 값을 복사
		 * 배열은 길이를 가지고 있음.
		 * 한번 정해진 길이는 늘이거나 줄일 수 없음.
		 * 이후 추가 삭제가 불가능함.
		 * 배열의 길이를 늘리거나 줄이고 싶을떄 배열복사를 통해 길이를 조절
		 * */
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		for(int tmp : arr) {
			System.out.println(tmp);
		}
			int arr1[] = new int[5];
			
			//수동으로 배열을 복사
			//int arr1[] = new int[arr.length*2];
			
			//arraycopy를 이용
//			System.arraycopy(arr,0,arr1,1,arr.length); //0번지의 값을 1번지에 넣어주삼
//			for(int i=0;i<arr.length;i++) {
//				arr1[i]=arr[i]; }
			 for(int tmp : arr1) {
				System.out.println(tmp);
			}
		
		/* 3개의 값을 담을 수 있는 string 배열 생성 후
		 * 국어 영어 수학 글자를 담은 후 출력 (향상된 for문 사용)
		 * 
		 * 5개의 값을 담을 수 있는 string 배열 생성 후
		 * 사회 과학을 추가하여 향상된 for문으로 출력
		 * */
           String[] a = new String[] {"국어","영어","수학"};
           for(String s : a) {
           System.out.println(s); }
           String[] str2 = new String[5];
           System.arraycopy(a,0,str2,0,a.length);
           System.out.println("--------");
           str2[3]="사회";
           str2[4]="과학";
           for(String s : str2) {
		   System.out.print(s+" ");
		   }
		
	
	
	
	
	
	
	
	
	
	
		
		
			 
			 
			 
		
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 

	}

}
