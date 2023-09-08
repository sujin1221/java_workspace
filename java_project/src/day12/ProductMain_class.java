package day12;

import java.util.Scanner;

//*  ProductMain class (별도로 만들기) 생성
//*  Product 배열 생성[10]
//*  상품 등록 후 상품 리스트 출력
//*  상품을 등록하시겠습니까? (y/n)
//*  y=등록 n=취소
//*  상품이름과 가격을 등록받아 배열에 등록
//*  n=등록된 제품 리스트 출력
public class ProductMain_class {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		Product[] p = new Product[10];
		String a;
		String a1;
		String a2;
		for(int i=0;;i++) {
			if(i==10) {
				System.out.println("상품을 더이상 등록할 수 없습니다!");
       } 
    	   System.out.println("상품을 등록하시겠습니까?"+" (y/n)");
    	   a = scan.next();
    	   if(a.equals("y")) {
    		 Product pd = new Product();
    	   System.out.println("상품을 등록합니다.");
    	   System.out.println("상품이름과 가격을 입력해주세요");
    	   a1 = scan.next();
    	   a2 = scan.next();
    	   pd.setMenu(a1);
    	   pd.setPrice(a2);
    	   p[i] = pd;
    	   System.out.println();
       } else if(a.equals("n")){
    	   System.out.println("상품등록을 취소합니다");
    	   break;
       }   	   
	} //배열을 마지막 인덱스까지 채우기 전에 n를 누르면 null 발생 그러므로 for문으로 설정해줌!		
	for(int j=0;j<p.length;j++) {
		if(p[j] == null) {
			break;				
		}	
		p[j].printMenu();    //상품 리스트 출력    
	}
	scan.close();
	}
	
}
