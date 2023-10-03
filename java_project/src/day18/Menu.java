package day18;

import java.util.HashMap;

public class Menu {
//메뉴 가격을 나타내는 클래스 생성	
	String menu;
	int price;
	//멤버변수, 생성자, getter setter, toString
	public Menu() {}
	public Menu(String menu, int price){
		this.menu = menu;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [menu=" + menu + ", price=" + price + "]";
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
	
	


