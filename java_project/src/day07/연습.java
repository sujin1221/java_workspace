package day07;

public class 연습 {

	public static void main(String[] args) {
		/* 1.랜덤 (1~100) 정수의 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * 3. 배열의 정수 5개와 평균을 출력하는 메서드 (출력 리턴없음)
		 * 4. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	//1.랜덤값(1~100)을 배열5개에 넣기
	public static int[] random() {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		} return arr;
	}
	//2.랜덤값 불러와서 평균 구하기 **
	public static double average(int arr[]) {
	int sum = 0;
	for(int i=0;i<arr.length;i++) {
		sum += arr[i];		
	} return (double)sum/arr.length;
	}
	//3.랜덤값과 평균값 출력 *****
	public static void print(int arr[], double avg) {
		for(int tmp : arr) {
			System.out.println(tmp);
		} 
		System.out.println(avg);
	}
	//4.랜덤 메서드 호출해서 평균 구하기 **
	public static void random1() {
	int arr[] = random();
	int sum = 0;
	for(int i=0;i<arr.length; i++) {
	sum += arr[i];
	} double avg = (double)sum/arr.length;
	}
	
	//5.정수가 주어지면 이 정수가 소수인지 아닌지 판단(소수가 맞으면 true 아니면 false)
	public static boolean isPrime(int num) { //boolean => true or false
	int cnt = 0; //약수를 카운트할 cnt 선언
	for(int i=1;i<=num;i++) { //범위 지정
		if(num%i==0) { //나머지가 0이라면(약수)
			cnt++; //카운트 해주세요~
		}
	}
	if(cnt==2) { //약수가 2개라면(소수:1과 나 자신만을 약수로 가지는 수)
	  return true;
	} return false;		
	}
	//6.단이 주어지면 그 단의 구구단을 출력(출력은 리턴x)
	public static void g(int num) {
		for(int i=1;i<=9;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
	//7.숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
	public static void c(int num, char ch) {
		for(int i=1;i<=num;i++) {
			System.out.println(ch); //i 범위만큼 ch를 출력해주세요~
		}
	}
	
	
	
	
	
	

}
