package day21;

import java.io.File;

public class FileObject {

	public static void main(String[] args) {
		/* 파일이 가지고 있는 정보 출력
		 * */
		File f = new File("D:\\kimsujin\\java_workspace-main\\java_workspace-main\\java_project\\out.txt");
		System.out.println(f.getName()); //경로를 '제외'한 파일명만 출력
		System.out.println(f.getPath()); //파일의 '경로'+'파일명' 출력
		System.out.println(f.getParent()); //파일의 '경로'만 출력
		System.out.println(File.separator); //파일 구분자(많이 사용)
		
		//파일명과 경로가 String 형태로 들어온다면....구분
		String fstr = f.toString();
		System.out.println(fstr);
		//드라이브만 추출
		System.out.println(fstr.substring(0, fstr.indexOf(":")+1)); 
		//파일명만 추출	
		System.out.println(fstr.substring(fstr.lastIndexOf(File.separator)+1));
		//파일경로만 추출		
		System.out.println(fstr.substring(0,fstr.lastIndexOf(File.separator)));

	}

}
