package day06;

import java.util.Scanner;

public class 과제6 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위,바위,보 중 랜덤으로 선택
		 * 0 = 가위, 1= 바위, 2= 보
		 * 나도 가위,바위,보 중 선택해서 입력 (숫자, 문자 상관없음)
		 * 결과 => 
		 * 컴퓨터 > 가위, 나 > 가위 => "결과: 무승부 입니다."
		 * */

Scanner scan = new Scanner(System.in);
System.out.println("--가위바위보 게임 시작--");
String num = scan.next(); //내 선택 (가위바위보)
int random = (int)(Math.random()*3); //컴퓨터 선택
System.out.println("컴퓨터가 결정을 완료하였습니다.");
System.out.println("가위바위보 중 하나를 선택하세요 > ");
switch(random) {

case 0 : if(num.equals("가위")) {
	System.out.println("비겼습니다"); break;}
else if(num.equals("바위")) {
	System.out.println("이겼습니다"); break;}
else { System.out.println("졌습니다"); break;}

	case 1 : if(num.equals("가위")) {
		System.out.println("겼습니다");break;}
	else if(num.equals("바위")) {
		System.out.println("비겼습니다"); break;}
	else { System.out.println("이겼습니다"); break;}		

	case 2 :if(num.equals("가위")) {
		System.out.println("이겼습니다"); break;}
	else if(num.equals("바위")) {
		System.out.println("겼습니다"); break;}
	else { System.out.println("비겼습니다"); break;}
	default : System.out.println("잘못된 입력입니다.");	
}
scan.close();
}


}