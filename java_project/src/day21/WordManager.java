package day21;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordManager {
	List<Word> list = new ArrayList<>();
	
	public void printMenu() {
		System.out.println("=====단어장 프로그램=====");
		System.out.println("1.단어등록 | 2.단어검색 | 3.단어수정 | 4.단어출력 | 5.단어파일로출력 | 6.단어삭제 | 7.종료");
		System.out.println("메뉴선택> ");
	}
	
	public WordManager() {
		add();
	}

	//기본단어 등록
	public void add() {
		list.add(new Word("hello","안녕"));
		list.add(new Word("hi","ㅎㅇ"));
		list.add(new Word("apple","사과"));
		list.add(new Word("orange","오렌지"));
		list.add(new Word("banana","바나나"));
		list.add(new Word("cup","컵"));		
	}
	
	//단어등록
	public void intsertWord(Scanner scan) {
		System.out.println("등록하실 단어와 의미를 입력해주세요.");
		String word = scan.next();
		String mean = scan.next();
		list.add(new Word(word,mean));
		System.out.println("단어가 성공적으로 등록되었습니다.");
	}
	
	//단어검색
	public void searchWord(Scanner scan) {
		System.out.println("검색하실 단어를 입력해주세요.");
		String word = scan.next();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getWord().equals(word)) {
				System.out.println("=====검색결과=====");
			System.out.println(list.get(i));	
			return;
		} 
	}
		System.out.println("존재하지 않는 단어입니다.");
	}	
	
	//단어수정
	public void replaceWord(Scanner scan) {
		System.out.println("수정하실 단어를 입력해주세요.");
		String word = scan.next();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getWord().equals(word)) {
				System.out.println("수정하실 의미를 입력해주세요.");
				String mean = scan.next();				
				Word w = new Word(word,mean);
				boolean result = list.remove(new Word(word,null));
				if(!result) {
					System.out.println("검색단어가 존재하지 않습니다.");
					return;
				} else {
					list.add(w);					
				}
			}	
	}	
}
	
	//단어전체출력
	public void Wordprint() {
			System.out.println("=====단어장 목록=====");
			Collections.sort(list);
			for(Word w : list) {
				System.out.println(w);
			}
		}
	
	
	//단어삭제
	public void deleteWord(Scanner scan) {
		System.out.println("삭제하실 단어를 입력해주세요.");
		String word = scan.next();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getWord().equals(word)) {
				list.remove(i);
				System.out.println("삭제가 완료되었습니다.");
			}

		}
		
	}
	
	//파일로출력
	public void printFile() {
		System.out.println("등록하신 단어를 파일로 출력합니다.");
		try {
			FileWriter fw = new FileWriter("word.txt");
			for(int i=0;i<list.size();i++) {
				String data = list.get(i).getWord()+":"+list.get(i).getMean(); 
				//toStirng : 
				//System.out.println(list.toString());
				fw.write(data);
			}
			fw.close();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("파일로 출력이 완료되었습니다.");
		System.out.println("새로고침을 통해 확인해주세요.");
	}
	
	//파일로 출력: 
//	FileWriter fs = new FileWriter("word.txt");
//	BufferWriter bw = new BufferWriter(fs);
//	
//	StringBuffer sb = new StringBuffer();
//	.append => 데이터 추가
//	String data = null;
//	sb.append("--단어장--");
//	sb.append("\r\n"); //줄바꿈
//	Collections.sort(list);
//	int cnt = 0;
//	while(cnt<list.size()) {
//		sb.append(list.get(cnt));
//		sb.append(\r\n);
//		cnt++;
//	}
//	data = sb.toString();
//	bw.wirte(data);
	
	
	
	
	
	
	
	
	

}
