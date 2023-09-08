package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 파일명 5개가 주어졌을떄, 원하는 단어를 입력하면 입력한 단어가 있는 파일들을 출력하도록 코드를 작성하시오.
		 * contains(str) : 해당 단어(str)가 포함되어 있는지 확인 => true or false로 return
		 * */		
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg","String메서드.txt", "String함수.jpg","java의 함수.png"};
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 단어를 입력하세요.: ");
		String a = scan.next();  //문자 입력(2줄 이상 = .nextline() 사용)
		int cnt = 0;
		
		System.out.println("--검색 값: "+a+"--");

		for(int i=0;i<fileName.length;i++) { //범위 지정 (추가 삭제할 시 for문, 선언할때는 향상 for문 사용)
		 if(fileName[i].contains(a)) { //조건 설정
			System.out.println(fileName[i]); //출력
		 }
		}
		scan.close();
		
	
		
		
		
		for(String tmp : fileName) {
			if(tmp.contains(a)) { 
				System.out.println(tmp);
				cnt++; //개수 추가
			}
		}		
		if(cnt==0) { //검색결과가 없다면
			System.out.println("검색결과가 없습니다.");
		} else {
			System.out.println("총 검색결과: "+cnt+"개 출력");
		}
		
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
