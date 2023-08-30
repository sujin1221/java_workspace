package day05;

public class day05 {

	public static void main(String[] args) {
		/* Array 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50 사이의 랜덤값을 저장한 후 출력
		 * */
         int[] arr = new int[5];
         for(int i = 0; i<arr.length;i++) {
        	 int a = (int)(Math.random()*50)+1; //for문 바깥에서 생성 시 같은값만 출력
        	 arr[i] = a; 
        	 System.out.print(arr[i]+" ");
         } 
                 
         System.out.println();
         System.out.println("---------");
         
         /* 정렬(오름차순) 교환
          * 4 37 23 9 43
          * 4 37 23 9 43 /4를 기준으로 뒤에 있는 값을 비교
          * 4 9 37 23 43 /9를 기준으로 뒤에 있는 값을 비교
          * 4 9 23 37 43
          * 4 9 23 37 43 
          * 
          * 이중 for문 필요함.
          * */
         for(int i=0;i<arr.length-1;i++) {
        	 for(int j=i+1;j<arr.length;j++) {
        		 if(arr[i] > arr[j]) { //오름차순 (< : 내림차순)
        			 //교환
        			 int tmp=arr[i]; //임시 변수에 앞에 값을 먼저 넣기
        			 arr[i]=arr[j];
        			 arr[j]=tmp;       			 
        		 }
        	 }
         }
         //출력
         for(int i=0;i<arr.length;i++) {
        	 System.out.print(arr[i]+" ");
         }         
         
         /* 향상된 for문
          * 
          * */
         System.out.println();
         System.out.println("----------");
        
         System.out.println("향상된 for>");
         for(int tmp :arr) {    //하나씩 tmp에 넘겨줌 (이미 완성되어있는것만 사용가능)
        	 System.out.print(tmp+" ");
         }
	}

}


