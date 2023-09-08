package day15;

import java.util.Scanner;

public class 과제 {
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
	//파일명 입력받기
	public static String[] insertFile() {
		Scanner scan = new Scanner(System.in);
		String[] file = new String[5];
		for(int i=0;i<file.length;i++) {
			file[i] = scan.next();
		}
		return file;
	}
	//이미지 파일 검색하기
	public static void searchFile(String[] s) {
		System.out.println("---이미지 파일---");
		for(int i=0;i<s.length;i++) {
			if(s[i].contains("jpg")||s[i].contains("png")||s[i].contains("gif")||s[i].contains("jpeg")) { //문자열 안에 있는지 확인하기	
				System.out.println(s[i]); //있다면 출력해주기
			}
		}
	}

}
