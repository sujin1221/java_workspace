package day18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat01 {

	public static void main(String[] args) throws ParseException {
		/* 날짜의 형식을 맞추기 위한 설정
		 * format 설정
		 * 날짜는 년,월,일,요일,시,분,초
		 * 날짜를 문자로 변환
		 * */
		Date date = new Date();
		System.out.println(date);
		//날짜를 문자로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) hh:mm:ss");
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		//문자열을 날짜로 변환
		String birth = "2009-09-30 08:30";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Date date2 = sdf2.parse(birth);
		System.out.println(date2);

	}

}
