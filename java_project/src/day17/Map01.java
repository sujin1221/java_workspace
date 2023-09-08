package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 저장, key/value값으로 저장
		 * - key는 중복 불가, value는 중복 가능
		 * - value는 key에 속해있는 부속품
		 * - HashMap을 가장 많이 사용
		 * 
		 * HashMap<String, Integer> map = new HashMap<String, Integer>();
		 * Map은 값이 2개여서 Iterator를 map 자체로는 사용불가
		 * 향상된 for문/Iterator => set으로 key값을 추출 한 후 사용함
		 * 
		 * list, set => .add()
		 * map => .put() / getKey(), getValue() => 요소 하나가 아닌 전체가 추출됨
		 * */
		HashMap<String, Integer> map = new HashMap<>();
		map.put("햄버거", 7000);
		map.put("피자", 15000);
		map.put("음료", 2000);
		System.out.println(map);
		System.out.println(map.keySet()); //set
		System.out.println(map.values()); //collection
		
		//key가 햄버거인 가격을 출력
		System.out.println(map.get("햄버거"));
		//향상된 for문으로 출력
		int sum = 0; 
		for(String tmp : map.keySet()) {		
			sum = sum+map.get(tmp);
			System.out.println(tmp+":"+map.get(tmp)); //value 추출
		}
		System.out.println("합계: "+sum);
		//Iterator로 출력
		System.out.println("----------");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp+":"+map.get(tmp));
		}
		
		System.out.println(map.entrySet());
		//ketValue는 entrySet으로만 추출이 가능함
		//entrySet 구성시: getKey, getValue로 출력
		System.out.println("--entrySet--");
		for(Map.Entry<String, Integer>tmp:map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
		
		
		
		

	}

}
