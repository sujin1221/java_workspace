package day10;

public class 연습10 {

	public static void main(String[] args) {
		/* 티비 클래스
		 * 전원 on/off 볼륨 up/down(순환x) 채널 up/down(순환o)
		 * 멤버변수 : name, power, channel, vol
		 * 메서드 : 전원, 채널 up/down, 볼륨 up/down
		 * */
		Tvn t = new Tvn("삼성");
		t.isPower();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();
		t.chDown();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.isPower();
		

	}

}
class Tvn{
	private boolean power;
	private int vol;
	private int ch;
	private String name;
	
	public Tvn() {}
	public Tvn(String name) {
		this.name = name;
	}
	public void isPower() {
		if(!power) {
			power = true;
			System.out.println("전원이 켜졌습니다");
		} else {
			power = false;
			System.out.println("전원이 꺼졌습니다");
		}
	}
	public void volUp() {
		if(vol == 10) {
			System.out.println("더이상 볼륨을 높일 수 없습니다!");
		} else {
		vol++;
		System.out.println("현재 볼륨은"+vol+"입니다");
	}
	}
	public void volDown() {
		if(vol == 0) {
			System.out.println("더이상 볼륨을 줄일 수 없습니다!");
		} else {
		vol--;
		System.out.println("현재 볼륨은 "+vol+"입니다");
	}
	}
	//채널은 순환되도록 설정한다
	public void chUp() {
		if(ch == 100) {
			ch = 0; }
		else {
		ch++;		
	}
		System.out.println("현재 채널은 "+ch+"입니다");
	}
	public void chDown() {
		if(ch == 0) {
			ch = 100;
		} else {
		ch--;
		}
		System.out.println("현재 채널은 "+ch+"입니다");
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPower(boolean power) {
		this.power = power;
	}

}