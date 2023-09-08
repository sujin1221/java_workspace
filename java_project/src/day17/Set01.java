package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Set01 {

	public static void main(String[] args) {
		/* Set: 순서보장 x (index가 없음) 중복x
		 * HashSet
		 * */
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		set.add("홍길동");
		set.add("이순신");
		
		System.out.println(set);
		for(String tmp : set) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		System.out.println("---Iterator---");		
//		Iterator<String>it = set.iterator();
//		while(it.has) {
//			String tmp = it.next();
//			System.out.print(tmp+" ");
//			

		//set을 list로 변환 후 정렬
		System.out.println("--리스트변환--");
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);
		Collections.sort(list); //정렬
		System.out.println(list); //영어가 우선으로 정렬되어서 출력됨
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// compareTo
				return o2.compareTo(o1); //내림차순
			}		
		});
		System.out.println("--정렬 후--");
		System.out.println(list);
		

		
		
		
	}
	}

