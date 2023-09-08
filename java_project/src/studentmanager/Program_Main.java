package studentmanager;

import java.util.Scanner;
/*메뉴를 출력하여 사용자로 부터 어떤 기능을 수행할 것인지 처리
 * 1.학생등록
 * 2.학생검색
 * 3.학생리스트
 * 4.수강신청
 * 5.수강철회
 * 6.종료
 * 
 */	
public class Program_Main implements program{
	Student[] st = new Student[5];
	int cnt1 = 0;
	public static void main(String[] args) {		
			int menu = 0;
			Scanner scan = new Scanner(System.in);		
			Program_Main p = new Program_Main();
			do {
				System.out.println("----menu----");
				System.out.println("1.학생등록");
				System.out.println("2.학생검색");
				System.out.println("3.학생리스트");
				System.out.println("4.수강신청");
				System.out.println("5.수강철회");
				System.out.println("6.종료");
				System.out.println("메뉴 입력>>>");				
				menu = scan.nextInt();
				switch(menu) {
				case 1:
					System.out.println("학생등록");
					p.insertStudent(scan);
					break;
				case 2:
					System.out.println("학생검색");
					p.searchStudent(scan);
					break;
				case 3:
					System.out.println("학생리스트");
					p.printStudent();
					break;
				case 4:
					System.out.println("수강신청");
					p.registerSubject(scan);
					break;
				case 5:
					System.out.println("수강철회");
					p.deleteSubject(scan);
					break;
				case 6:System.out.println("종료");
					default:
						System.out.println("잘못된 메뉴입니다.");			
				}
			}while(menu != 6); 
			System.out.println("프로그램 종료");
		}
	@Override
	public void printStudent() {
		System.out.println("----전체 학생정보---");
		for(int i=0;i<cnt1;i++) {
		System.out.println(i+1+"."+st[i].getStudentName());		
		System.out.println("---------");
		}
	}
	@Override
	public void insertStudent(Scanner scan) {
		//1명의 정보값을 입력받아 객체를 생성한 후 st 배열에 추가
		//배열이 꽉 찼다면 배열이 증가하도록 설정
		System.out.println("추가할 학생 이름을 입력하세요.");
		st[cnt1] = new Student();
		st[cnt1].setStudentName(scan);
		cnt1++;
	}
	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("검색할 학생 이름을 입력하세요.");
		String a = scan.next();
		for(int i=0;i<cnt1;i++) {
			if(a.equals(st[i].getStudentName())) {
				System.out.println(st[i].toString());
				st[i].printS();
			}
		}  
	}
	@Override
	public void registerSubject(Scanner scan) {
		System.out.println("수강신청하실 학생이름을 입력하세요.");
		String a = scan.next();
		for(int i=0;i<cnt1;i++) {
			if(a.equals(st[i].getStudentName())) {
		st[i].addSubject(); 
			} 			
		}		
		
	}
	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("수강을 취소할 학생명을 입력해주세요.");
		String a = scan.next();
		for(int i=0;i<cnt1;i++) {
			if(a.equals(st[i].getStudentName())) {
				st[i].deleteSub(scan);
			}
		}
		
	}

	}