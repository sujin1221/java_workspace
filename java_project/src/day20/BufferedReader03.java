package day20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReader03 {

	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new FileReader("out.txt")); //파일 불러오고
		HashMap<String, Integer> map = new HashMap<String, Integer>();	//map 선언	
		int sum = 0; //합계
		int cnt = 0; //인원수
		while(true) { //반복
			String line = br.readLine(); //한 라인 읽어오기
			if(line == null) { //더이상 읽을 라인이 없다면
				break; //빠져나오기
			}
			String[] str = line.split(" "); //" "을 기준으로 양쪽(string, integer)으로 나눠주고
			map.put(str[0], Integer.parseInt(str[1])); //나눈 값을 map에 넣기
            //방법1:
            //sum += Integer.parseInt(line); //계산을 위해 형 변환 후 합계 ㄱㄱ 
			//cnt++; //카운트 올리기
		}
		br.close(); //닫아주기
       //방법2:
		for(String tmp: map.keySet()) { //key값 선언후
			sum += map.get(tmp); // get을 통해 값을 불러온후 더하기 
			cnt++; //카운트 ㄱㄱ 
		}
        System.out.println("합계: "+sum);
		System.out.println("인원수: "+cnt);

	}

}
	
	
	
	
	
	
	
	
	
	
	




