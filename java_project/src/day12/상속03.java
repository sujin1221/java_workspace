package day12;

public class 상속03 {

	public static void main(String[] args) {
		Cat1 c = new Cat1(); //자식클래스를 불러와야함!
		c.setName("길동");
		c.setCategory("고양이");
		c.info();
		c.howl();
	}
}
//자식 클래스
class Cat1 extends Animals{ //상속받을때 : 'extends' 사용!
	public Cat1() {
		setName("고양이");
		setCategory("고양이과");		
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("애옹");
	}		
}
//부모클래스
class Animals{
	private String name;
    private String category;
    
    public Animals() {}
    public Animals(String name, String category) {
    	this.name = name;
    	this.category = category; 	 	
    }
    public void info() {
    	System.out.println("이름: "+name);
    	System.out.println("종: "+category);
    }
    public void howl() {
    	System.out.println(name+"의 울음소리");
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}  
    
}