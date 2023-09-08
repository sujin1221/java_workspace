package day10;

public class Class03 {

	public static void main(String[] args) {
		/* 티비 클래스
		 * 전원 on/off 볼륨 up/down(순환x) 채널 up/down(순환o)
		 * 멤버변수 : name, power, channel, vol
		 * 메서드 : 전원, 채널 up/down, 볼륨 up/down
		 * */
		Tv tv = new Tv("삼성", "회색");
		tv.powerOn();
		tv.channelUp();
		tv.volUp();
		tv.powerOff();
	}

}
//멤버변수선언
class Tv{
	private boolean power; //false
	private int vol; //0
	private int channel; //0
	private String tvName; //null
	private String tvColor;
//생성자
	public Tv() {}
    public Tv(String tvName,String tvColor) {
		this.tvName = tvName;
		this.tvColor = tvColor;
}
//메서드
public void powerOn() {
	power = true;
	System.out.println("전원이 켜졌습니다.");
}
public void powerOff() {
	power = false;
	System.out.println("전원이 꺼졌습니다.");
}
public void volUp() { //maxVol = 10
if(vol == 10) {
	System.out.println("더이상 올릴 수 없습니다!"); }
else {
	vol++;
System.out.println("볼륨크기: "+vol);
}
}
public void volDown() { 
	if(vol == 0) {
		System.out.println("음소거");
	} else {
System.out.println("볼륨크기: "+vol);
vol--;	
}
}
//채널 = 순환o
public void channelUp() {
	if(channel == 100) {
		channel = 0;
	} else {
	channel++;		
}
	System.out.println("채널: "+channel);	
}
public void channelDown() {
	if(channel == 0 ) {
		channel = 100; //채널이 0이 되면 100으로 돌아가도록 설정!
	} else {
	channel--;
}
	System.out.println("채널: "+channel);
}
public boolean isPower() {
	return power;
}
public void setPower(boolean power) {
	this.power = power;
}
public int getVol() {
	return vol;
}
public void setVol(int vol) {
	this.vol = vol;
}
public int getChannel() {
	return channel;
}
public void setChannel(int channel) {
	this.channel = channel;
}
public String getTvName() {
	return tvName;
}
public void setTvName(String tvName) {
	this.tvName = tvName;
}
public String getTvColor() {
	return tvColor;
}
public void setTvColor(String tvColor) {
	this.tvColor = tvColor;
}









}
	





















