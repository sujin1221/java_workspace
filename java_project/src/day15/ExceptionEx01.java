package day15;

public class ExceptionEx01 {
	//1.메서드 생성
		/* 기능: 배열의 길이가 주어지면 길이만큼 배열을 생성하여 배열을 돌려주는 메서드(size, start, count)
		 * => 배열안에 random값을 채워서 리턴 (1~10) start=1, count=10
		 * size가 0보다 작다면 예외발생
		 * start가 0보다 작다면 예외발생
		 * 
		 * 2.기능: 배열을 받아서 배열에 랜덤값을 채우는 메서드 (arr, start, count)
		 * arr 배열이 null일 경우 예외발생
		 * arr 배열의 길이가 0보다 작을 경우 예외발생
		 * */
	public static void main(String[] args) {		
		try {
			int arrInt[] = null; //아무것도 없는 상태로 공간 하나 만들어주고
			//arrInt = arr(10,5,10); //그 안에 값 담아주기
		for(int i=0;i<arrInt.length;i++) {
			System.out.print(arrInt[i]+"");
		}
			for(int i=0; i<arrInt.length; i++) { //출력할 값의 범위를 잡고
				System.out.print(arrInt[i]+""); //그 값을 출력
			}
			System.out.println();
//			arr = null;
//			ex01.createrArr(arr,1,10);
		} catch (Exception e) { //예외가 무엇이 발생할지 모르기때문에 최상위 exception을 작성해줌
		     System.out.println(e.getMessage()); //getMessage로 입력한 메세지창 출력
		}	
	}
	//1.메서드 생성
//	public static int[] arr(int size, int start, int count){
//		//위치 선정 생각해서 하기
//	if(size<0 || start<0) { //예외발생조건작성
//		throw new RuntimeException("RuntimeException 발생"); //예외발생시 출력할 메세지 작성
//	}
//	int[] arr = new int[size]; //size크기의 배열을 생성 후 	
//	fill(arr,start,count); //아래서 만든 메서드를 이용해서 랜덤값을 넣어주고
//	 return arr; //넣어준값을 다시 리턴해주기
//		
//	}
	//2.메서드 생성
//	public static void fill(int[] arr, int start, int count) {
//   if(arr == null || arr.length<0) { //예외발생조건작성
//	   throw new NullPointerException("null 예외발생"); //예외발생시 출력할 메세지 작성
//   }
//		for(int i=0;i<arr.length;i++) { //랜덤값 넣어 줄 범위지정		
//		arr[i] = (int)(Math.random()*count)+start; //그 범위 안에 랜덤값 넣어주기
//	} 
//	
//	
//	}
	//'throws' 생략 가능
	public void creatArr(int arr[],int start, int count) throws Exception {
		if(arr==null) {
			throw new Exception("배열의 값이 null입니다.");
		}
		if(arr.length<0) {
			throw new Exception("배열의 길이가 0보다 작습니다.");
		}
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*count)+start;
		}
	}
}
	 

	
