package day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime01 {

	public static void main(String[] args) {
		/* LocalDateTime: 현재 날짜 시간 처리
		 * LocalTime: 시간만
		 * LocalDate: 날짜만
		 * 
		 * */
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.toString());
		
		String curr = today.toString();
		//T기준으로 앞에 있는 연월일 추출
		System.out.println(curr.substring(0, curr.indexOf("T")));
		//T기준으로 뒤에 있는 시분초 추출
		//subString: 문자열 추출
		//indexOf: 앞에서부터 추출
		//lastindexOf:뒤에서부터 추출
		System.out.println(curr.substring(curr.indexOf("T")+1,curr.lastIndexOf(".")));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8, 30);
		System.out.println(sDate.format(dtf)); //형식을 꼭 찍어줘야함
				

	}

}
