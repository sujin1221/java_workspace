package day05;

public class String02 {

	public static void main(String[] args) {
		/* 이것이자바다.txt => 파일명과 확장자를 분리하여 출력
		 * */
		String fileName = "이것이자바다.txt";
	    String file = fileName.substring(0,fileName.indexOf("."));
	    System.out.println(file);
	    String sux = fileName.substring(fileName.indexOf(".")+1);
	    System.out.println(sux);
	    
	    //contains(str) : 해당 글자를 포함하고 있는지를 
	    System.out.println(fileName.contains("자바"));
		

	}

}
