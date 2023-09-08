package day15;

public class Exception01 {

	public static void main(String[] args) {
		/* Exception : 예외처리
		 * => 실행시 발생할 수 있는 예외를 처리하여 정상처리로 유지시키는 기능
		 * NullPointException : null 객체의 인스턴스 메소드를 호출하는 등의 경우
		 * ArrayIndexOutOfBoundsException : 배열에 잘못된 인덱스를 사용하여 접근할 경우
		 * ArithmeticException : 산술 연산에서 정수를 0으로 나누는 등 연산을 수행할 수 없는 경우
		 * ClassCastException : 수행할 수 없는 타입 변환이 진행될 경우
		 * 
		 * try ~ catch ~ finally
		 * try : 예외가 발생할 가능성이 있는 문구를 작성
		 * catch : try 구문에서 발생한 예외를 처리
		 * finally : try 구문과 상관없이 반드시 실행되어야 하는 구문이 있을 경우 사용함(없으면 x)
		 * */
		int arr[] = new int[5];
		try {
			//예외발생코드
			arr[0] = 45;
			arr[1] = 56;
			arr[6] = 1; //ArrayIndexOutOfBoundsException 발생(예외발생코드)
			arr[3] = 78; //위 예외발생코드로 인해 출력 되지 않음(예외발생코드 이후는 출력x) 
			
		} catch (Exception e) {
			System.out.println("배열의 범위를 벗어났습니다.");
			e.printStackTrace(); //에러값 찍어주기
			e.getMessage();
		}
		//예외가 발생하면 이후의 코드는 실행이 안됨
		System.out.println("입력이 완료되었습니다.");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	}

}