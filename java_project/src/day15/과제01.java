package day15;

import javax.management.RuntimeErrorException;

public class 과제01 {

	public static void main(String[] args) {
		String[] fileName = {"java.txt","String.jpg","method.png","String.pdf","java.pdf"};
		//String[] img = {"jpg","png","gif","jpeg"}; //값을 없애고
		String[] img = null; //null값을 주면 '배열이 없습니다'가 출력됨
		과제01 ex = new 과제01();
		
		try {
			for(String tmpFile : fileName) {
				String search = tmpFile.substring(tmpFile.lastIndexOf(".")+1); //.다음부터 나머지를 해야하니깐 +1
				//System.out.println(search);
				if(ex.iscontains(img, search)) {
					System.out.println(tmpFile);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	//isContains
	//배열에서 찾는 문자열이 있는지 체크 (true false로 리턴)
	//확장자명이랑 일치할 수 있으므로 contains x
	//기준값은 img
	public boolean iscontains(String arr[], String search) {
		if(arr == null || arr.length == 0) {
			throw new RuntimeException("배열이 없습니다.");
		}
		if(search == null) {
			throw new RuntimeException("검색어가 없습니다.");
		}
		for(String tmp : arr) {
			if(tmp.equals(search)) {
				return true;
			}
		}
		return false;
	}
	

}
