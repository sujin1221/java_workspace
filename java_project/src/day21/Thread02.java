package day21;
class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<=500;i++) {
			System.out.println(i+"번째"+Thread.currentThread().getName());
		}
	}
	}

public class Thread02 {
	public static void main(String[] args) {
		/* Runnable을 구현하는 방법:
		 * 직접 객체 생성만으로 실행 불가능
		 * thread 클래스를 만들어서 생성자로 runnable 구현 객체를 추가해줘야함
		 * */
		MyThread2 mth = new MyThread2();
		Thread th = new Thread(mth);
		th.start();
		
		try {
			th.join(); //기다리라는 의미
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");

	


}
}