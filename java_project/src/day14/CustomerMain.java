package day14;

public class CustomerMain {

	public static void main(String[] args) {
		
		System.out.println("=====Silver등급=====");
		Customer customer = new Customer(); //선언 먼저 해주고 입력
		customer.setCustomerID(9999);
		customer.setCustomerName("홍길동");
		customer.bonusPoint = 0;
		System.out.println(customer.customerInfo()); //모두 입력 후 출력
		System.out.println("=====Gold등급=====");
		Customer customerGold = new Gold(3333, "박길동");
		customerGold.bonusPoint = 0;
		System.out.println(customerGold.customerInfo());
		System.out.println("=====VIP등급=====");
		Customer customerVIP = new VIP(7777, 0001, "왕길동");
		customerVIP.bonusPoint = 0;
		System.out.println(customerVIP.customerInfo());
		System.out.println();
		System.out.println();	
		
		int price = 1000000; 
		
		int silverPrice = customer.calcPrice(price); 
		System.out.println(customer.getCustomerName()+"님이 "+silverPrice+"원을 지불하셨습니다.");
		System.out.println(customer.customerInfo());
		System.out.println();
		
		int goldPrice = customerGold.calcPrice(price);	
		System.out.println(customerGold.getCustomerName()+"님이 "+goldPrice+"원을 지불하셨습니다.");
		System.out.println(customerGold.customerInfo());
		System.out.println();
		
		int vipPrice = customerVIP.calcPrice(price);		
		System.out.println(customerVIP.getCustomerName()+"님이 "+vipPrice+"원을 지불하셨습니다.");
		System.out.println(customerVIP.customerInfo());
		
		//배열로 출력할시:
		Customer[] customerList = new Customer[10];
		Customer silver = new Customer(1111, "홍길동");
		Customer gold = new Gold(1111, "김길동");
		Customer vip = new VIP(2222, 1111, "박길동");	
		int cnt = 0;
		customerList[cnt] = silver;
		cnt++;
		customerList[cnt] = gold;
		cnt++;
		customerList[cnt] = vip;
		cnt++;
		for(int i=0;i<cnt;i++) {
			customerList[i].customerInfo();
		}
		for(int i=0;i<cnt;i++) {
			System.out.println(customerList[i].getCustomerName()+"님이 지불하실 금액은 "+customerList[i].calcPrice(price)+"보너스포인트는"+customerList[i].getBonusPoint());
		}
		//다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌 자식의 고유 멤버변수나 메서드를 호출하고자 할때 필요
		// => 반드시 명시적으로 형변환을 해줘야함
		//instanceof : 원래 그 형태가 맞는지 체크하는 명령어 true/false
		System.out.println(vip instanceof VIP); 				
		for(int i=0;i<cnt;i++) { //범위지정
			Customer c = customerList[i]; //customerList[i]의 하나의 값을 c에 넣어줌, 주소만 복사(객체생성한것이 아니므로 원값은 그대로 있음)
			if(c instanceof VIP) { //VIP가 c의 객체인지 확인 후 그 결과가 'true'라면, 
			VIP vip2 = (VIP)c; //c를 VIP(자식)으로 강제 형변환 => 자식타입 자식변수 = (자식타입)부모타입;
			if(vip2.getAgentID()==1111) { //전담상담사의 아이디가 '1111'인 고객을 
			vip2.setAgentID(1234); //'1234'로 변경함.
			}
			}
		}
		
		
		
		
		
		
		
		

	}
}
	

	