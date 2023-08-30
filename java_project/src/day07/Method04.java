package day07;

public class Method04 {
	//1.
	public static int[] random(){ //매개변수가 없다면 안쓰면 됨
	 int[] arr = new int[5]; //5개 배열 담기
	 for(int i=0;i<arr.length;i++) { //범위 지정
		 arr[i] = (int)(Math.random()*100)+1; //배열에 랜덤값 넣기
		 	 } 
	 return arr;
	}
	 //2.
	 public static double average(int arr[]) { //랜덤수를 생성한 배열이 이미 있기 때문에
		 //계산만 하면 됨!
		 int sum = 0; //합계 선언
		 for(int i=0;i<arr.length;i++) { //범위 지정
			 sum +=arr[i]; //합계
		 } 
		 return (double) sum / arr.length;
	 }	 
	 //3.
	 public static void print(int arr[], double avg) {
		 System.out.println("다섯개의 랜덤 정수 값 > ");
		 for(int tmp : arr) {
			 System.out.print(tmp+" ");
		 }
		 System.out.println(); //줄바꿈
		 System.out.println("평균: "+avg);
	 }
    //4.
	 public static void average() {
		 //랜덤을 호출해와라
		 int arr[] = random(); //랜덤 배열 생성
		 int sum = 0;
		 for(int i=0; i<arr.length; i++) {
			 sum += arr[i];
		 }
		 double avg = (double) sum/arr.length;
	 }	 
	 
	public static void main(String[] args) {
		
		/* 메서드 : 기능을 하기 위한 코드 조각
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 코드;
		 * return;
		 * ...(실행불가능)
		 * }
		 * 
		 * return : 메서드에서 전달해야하는 값을 전달하는 역할
		 * 메서드에서 return을 만나면 리턴 타입의 값을 전달하고 메서드를 종료
		 * */
		
		
		/* 1.랜덤 (1~100) 정수의 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 리턴타입 : 정수 배열 => int[]
		 * 매개변수 : 없음
		 * 메서드명 : random
		 * 
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * 리턴타입 : 평균을 리턴 => double
		 * 매개변수 : 배열 => int arr[]
		 * 메서드명 : average
		 * 
		 * 3. 배열의 정수 5개와 평균을 출력하는 메서드 (출력 리턴없음)
		 * 리턴타입 : void 없음
		 * 매개변수 : 정수배열, 평균 => int arr[], double avg
		 * 메서드명 : print
		 * 
		 * 메인에서는 연산식이 있으면 안됨.
		 * 메서드 간의 데이터 전달 및 호출만 있어야함. 
		 * 
		 * 4. 배열을 전달받아서 평균을 연산하는 메서드
		 * 매개변수 : x
		 * 리턴타입 : x
		 * 메서드명 : average
		 * 
		 * 메서드 오버로딩 : 같은 메서드명을 쓰더라도, 매개변수의 종류나 개수가 다르면 사용가능함.
		 * */

		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
