package day21;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		/* Word package에서 생성한 Word 클래스를 사용하여
		 * 단어장 프로그램 작성
		 * 1.단어등록 | 2.단어검색 | 3.단어수정 | 4.단어출력 | 5.단어파일로출력 | 6.단어삭제 | 7.종료
		 * Word class ArrayList로 구성
		 * */
		Scanner scan = new Scanner(System.in);
		WordManager w = new WordManager();
		int menu = 0;
		do {
			w.printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1: w.intsertWord(scan); break;
			case 2: w.searchWord(scan); break;
			case 3: w.replaceWord(scan); break;
			case 4: w.Wordprint(); break;
			case 5: w.printFile(); break;
			case 6: w.deleteWord(scan); break;
			case 7: break;
			}
		} while(menu != 7);
		System.out.println("프로그램을 종료합니다.");
	}

}
//class wordList{
//	List<Word> list = new ArrayList<>();	
//	//단어등록
//	public void intsertWord(Scanner scan) {
//		System.out.println("등록하실 단어와 의미를 입력해주세요.");
//		String word = scan.next();
//		String mean = scan.next();
//		list.add(new Word(word,mean));
//		System.out.println("단어가 성공적으로 등록되었습니다.");
//	}
//	//단어검색
//	public void searchWord(Scanner scan) {
//		System.out.println("검색하실 단어를 입력해주세요.");
//		String word = scan.next();
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getWord().equals(word)) {
//				System.out.println("=====검색결과=====");
//			System.out.println(list.get(i));	
//			return;
//		} 
//	}
//		System.out.println("존재하지 않는 단어입니다.");
//	}	
//	//단어수정
//	public void replaceWord(Scanner scan) {
//		System.out.println("수정하실 단어를 입력해주세요.");
//		String word = scan.next();
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getWord().equals(word)) {
//				list.remove(i);
//				System.out.println("수정하실 단어의 의미를 입력해주세요.");
//				String mean = scan.next();
//				list.add(new Word(word,mean));
//				System.out.println("수정이 완료되었습니다.");
//			}	
//	}	
//}
//	//단어전체출력
//	public void Wordprint() {
//		for(int i=0;i<list.size();i++) {
//			System.out.println("=====단어장 목록=====");
//			System.out.println(list.get(i));
//		}
//	}
//	//단어삭제
//	public void deleteWord(Scanner scan) {
//		System.out.println("삭제하실 단어를 입력해주세요.");
//		String word = scan.next();
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getWord().equals(word)) {
//				list.remove(i);
//				System.out.println("삭제가 완료되었습니다.");
//			}
//
//		}
//		
//	}
//	//파일로출력
//	public void printFile() {
//		System.out.println("등록하신 단어를 파일로 출력합니다.");
//		try {
//			FileWriter fw = new FileWriter("word.txt");
//			for(int i=0;i<list.size();i++) {
//				String data = list.get(i).getWord()+":"+list.get(i).getMean(); 
//				//toStirng : 
//				//System.out.println(list.toString());
//				fw.write(data);
//			}
//			fw.close();
//		}catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		System.out.println("파일로 출력이 완료되었습니다.");
//		System.out.println("새로고침을 통해 확인해주세요.");
//	}
//}


