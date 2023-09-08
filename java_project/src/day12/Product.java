package day12;

public class Product {
/* 메뉴 이름, 가격
 * 메뉴, 가격 추가 메서드
 * 메뉴 : 가격 출력 메서드
 * 
 *  ProductMain class (별도로 만들기) 생성
 *  Product 배열 생성[10]
 *  상품 등록 후 상품 리스트 출력
 *  상품을 등록하시겠습니까? (y/n)
 *  y=등록 n=취소
 *  상품이름과 가격을 등록받아 배열에 등록
 *  n=등록된 제품 리스트 출력
 * */
	//매개변수
	private String menu;
	private String price;
	//생성자
	public Product() {}
	public Product( String menu, String price) {
		this.menu = menu;
		this.price = price;
	}
	//메서드
	public void printMenu() {
		System.out.println("메뉴: "+menu+"가격 "+price);
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
