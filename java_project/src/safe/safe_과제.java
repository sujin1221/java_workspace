package safe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class safe_과제 {

	public static void main(String[] args) {
		/* 단어장
		 * Word 클래스 생성
		 * 단어: 의미
		 * hello: 안녕
		 * apple: 사과
		 * banana: 바나나
		 * 
		 * 단어를 추가, 출력 (정렬해서 출력) 
		 * */
		Word w = new Word();

	}

}

class Word{
	HashMap<String, String> map = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	
	public Word() {
		wordAdd();
	}
	
	//단어 추가
	public void wordAdd() {
		System.out.println("===단어장===");
		System.out.println("추가하실 단어와 의미를 입력해주세요.");
		String word = scan.next();
		String word1 = scan.next();
		map.put(word, word1);
		System.out.println("단어가 추가되었습니다.");
	}
	
	//단어 출력
	public void printWord() {
		for(Map.Entry<String, String> tmp : map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
	}
		
	//단어 검색
	public void searchWord() {
	System.out.println("검색하실 단어를 입력해주세요");
	String word = scan.next();
	for(String tmp : map.keySet()) {
		if(tmp.equals(word)) {
			System.out.println("검색결과> ");
			System.out.println(tmp+":"+map.get(tmp));
		}
	}
	}
		
	//단어 삭제
	 public void deleteWord() {
		 System.out.println("삭제하실 단어를 입력해주세요.");
		 String word = scan.next();
		 for(String tmp : map.keySet()) {
				if(tmp.equals(word)) {
					map.remove(tmp);
					System.out.println("단어장 목록> ");
					System.out.println(map);
	 }
		
		 }	

	 }		
		
}
