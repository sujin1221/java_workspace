package day20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {

	public static void main(String[] args) throws IOException {
		// BufferedReader: 문자기반 보조스트림.
		/* 라인단위로 읽기가 가능
		 * 더 이상 읽을 라인이 없으면 null 리턴
		 * 보조스트림: 직접 읽고 쓰는 기능이 없기때문에 기반스트림을 매개변수로 포함해야함.
		 * */
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		while(true) {
			String line = br.readLine(); //한 라인 읽어오기
			if(line == null) { //더이상 읽을 라인이 없다면
				break;
			}
			System.out.println(line);
		}
		br.close();

	}

}
