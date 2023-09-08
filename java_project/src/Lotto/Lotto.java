package Lotto;

import java.util.Scanner;
/* --menu--
 * 1. 로또 번호 생성(수동) : 사용자가 입력
 * => creatLotto(scan);
 * 2. 로또 번호 생성(자동) : random(6자리)
 * => createLottoAuto()
 * 3. 당첨번호 생성(자동) : random(7자리) => 배열에 저장
 * => insertLottoAuto()
 * 4. 당첨번호 (내역)확인 : (현재 회차 당첨번호가 가장 위에 출력) 1개만 확인 => 등수체크
 * => checkLotto()
 * 5. 당첨번호 리스트 확인 : 전부 (마지막 당첨번호가 가장 위에 출력)
 * => printLotto()
 * 6. 종료
 * 
 * 
 * 1. Lotto class: 6개의 배열 생성하는 로또 클래스 (+수동 생성에 대한 메서드)........................
 * 2. LottoE class : 기존 로또 클래스를 상속 받아 처리 (당첨번호를 저장하는 배열 저장) => 기존 배열(6자리) int bonus만 처리
 * 3. LottoManager : 메뉴의 메서드 처리
 * 4. LottoMain : 메뉴 입력받아 처리
 * */
public class Lotto { 
	LottoManager m = new LottoManager();
	//로또 한셋
	int[] lottoNums = new int[6];
	//보너스번호
	int Bonus = 0;
	
	public int[] selectLotto(Scanner scan){
		int num=0;
		for(int i=0; i<lottoNums.length;i++) {
			System.out.println(i+1+"번째" + "숫자를 입력해주세요");	
			 do {
				 System.out.println("중복된 번호는 입력할수없습니다.");
				 num = scan.nextInt();
	            } while (m.contains(lottoNums, num)); // 중복 확인
			lottoNums[i] = num;
		}
		return lottoNums;
	}

}
	
		
		
		
		
		



	
	
	
	



