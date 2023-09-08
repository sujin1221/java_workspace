package day16;

public class 사용자지정Exception {

	public static void main(String[] args) {
		/* passwordException
		 * 
		 * 비밀번호는 null일 수 없음 (비어있을 수 없음)
		 * 비밀번호의 길이는 5자 이상이어야함
		 * 비밀번호는 문자로만 이루어지면 안됨 (반드시 문자+숫자+특수문자가 들어가야함)
		 * */
		String password = "dabdefg";
		PasswordTest pt = new PasswordTest();
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}

class PasswordTest{
	private String password;

	public String getPassword() {
		return password;
	}
    
	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		//비밀번호의 길이는 5자 이상이어야함
		else if(password.length()<5) {
			throw new PasswordException("비밀번호는 5자 이상이어야합니다.");     
		}
		//비밀번호는 문자로만 이루어지면 안됨(반드시 문자+숫자+특수문자가 들어가야함)
		else if(password.matches("[a-zA-z]+")) { //패스워드가 문자로만 이루어져있다면, 한글자 이상은 무조건 와야하므로 '+'
			throw new PasswordException("비밀번호는 문자,숫자,특수문자가 반드시 포함되어야합니다.");
		}
		this.password = password;
	}
	
}
