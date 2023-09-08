package day15;

import java.io.File;
import java.util.Scanner;

public class 과제_연습 {
	/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
	 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
	 * 이미지파일 형식은 (jpg, png, gif, jpeg)
	 * String[] fileName = {"java.txt","String.jpg","method.png",
	 * "String.pdf","java.pdf"}
	 * 
	 * --이미지 파일--
	 * String.jpg
	 * method.png
	 * */
	public static void main(String[] args) {	
		searchFile(insertFile());
	}
	//5개의 파일명을 입력받는 메서드 만들기
	public static String[] insertFile() {
		Scanner scan = new Scanner(System.in);
		String[] file = new String[5]; //배열만들어주고
		System.out.println("생성하실 파일명을 입력해주세요.");
		for(int i=0;i<file.length;i++) { //배열 만든 다음
			file[i] = scan.next(); //입력해서 값 넣어주기
		}
		return file; //그 값을 리턴	
	}
	//이미지파일을 검색하여 출력하는 메서드 만들기
	public static void searchFile(String[] s) {
		System.out.println("===image file===");
		for(int i=0;i<s.length;i++) { //범위잡아주고
			//이미지파일 형식은 (jpg, png, gif, jpeg) 같은지 확인
			if(s[i].contains("jpg")||s[i].contains("png")||s[i].contains("gif")||s[i].contains("jpeg")) {
				System.out.println(s[i]); //그 값을 출력
			}
			
		}
		
	}

}
