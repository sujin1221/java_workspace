package day05;

public class String01 {

	public static void main(String[] args) {
		/* String class = 문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다"; => 일반 자료형처럼 이용 가능
		 * index 0부터 시작
		 * */
		String str = "Hello world~!";
		System.out.println(str);

		//charat{index) : index번지에 있는 '한글자'를 반환
		System.out.println("--charAt--");
		System.out.println(str.charAt(0)); //H
		
		//length : 문자열의 전체 길이 (공백 포함)
		System.out.println("--length--");
		System.out.println(str.length()); //13
		
		//compareTo(str) : str 문자열과 비교하여 같으면 0,
	    //사전순으로 앞이면 -1, 뒤면 1
		//문자열 정렬시 사용
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("a")); //b를 기준으로
		
		//concat(str) : 이어붙이기('+'연산자와 같은 의미)
		System.out.println("--concat--");
		System.out.println("abc".concat("def"));    //= System.out.println("abc"+"def");
		
		//equals(str) : 두 문자열이 같은지 확인(대소문자 구분)
		//== : 주소가 같은지 확인 / equals : 내용이 같은지 확인
		System.out.println("--equals--");
		System.out.println("abc".equals("abc")); //true
		System.out.println("abc".equals("def")); //false
		
		//indexOf(str) : 문자의 위치를 찾아주는 기능 
		//찾는 문자가 없으면 -1을 리턴
		System.out.println("--indexOf--");
		System.out.println("abc".indexOf("b"));
		String email = "ddddd123@naver.com";
		System.out.println(email.indexOf("@")); //@의 위치 구하기
		System.out.println(email.indexOf("."));
		System.out.println(email.lastIndexOf(".")); //마지막 . 위치 찾기
		
		//subString : 문자열 추출
		System.out.println("--subString--");
		System.out.println(email.substring(0,5)); //시작번지 포함, 끝번지는 포함 x (5전까지)
		System.out.println(email.substring(0,email.indexOf("@"))); //@앞으로
		System.out.println(email.substring(email.indexOf("@")+1)); //@뒤로
		
		//trim : 불필요한 공백 제거
		System.out.println("--trim--");
		System.out.println("     Hello     ".trim());
		
		//replace : 글자 치환
		System.out.println("--repalce--");
		System.out.println("Hello world".replace("world","java")); //world를 java로 바꾸기
		
		//split : 특정 값을 기준으로 나누기
		System.out.println("--split--");
		String str1 = "dog,cat,tiger";
		String[] str2 = str1.split(","); //기준을 안줄 시 하나씩 출력됨
		for(String s : str2) {
			System.out.print(s+" ");
		}
		
		String num1 = "1";
		String num2 = "2";
		System.out.println(num1+num2);
		
		//parseInt : 문자를 숫자로 변환
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
