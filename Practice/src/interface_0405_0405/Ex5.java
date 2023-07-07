package interface_0405_0405;

public class Ex5 {

	public static void main(String[] args) {
		DesignerClient designer = new DesignerClient();
		designer.login();
		
		DeveloperClient developer = new DeveloperClient();
		designer.login();
	}

}

interface LoginProcess {
	public abstract String login(String id, String pass);
}

class Designer implements LoginProcess {

	@Override
	public String login(String id, String pass) {
		System.out.println("디자이너가 받은 아이디 : " + id);
		System.out.println("디자이너가 받은 비밀번호 : " + pass);
		return "성공";
	}

}

class DesignerClient {
	Designer designer = new Designer();
	
	public void login() {
		String id = "admin";
		String pass = "1234";
		
		String result = designer.login(id, pass);
		System.out.println("로그인 결과 : " + result);
		
		if(result.equals("성공")) {
			
		} else {
			
		} 
		
	}
}

class Developer implements LoginProcess {

	@Override
	public String login(String id, String pass) {
		System.out.println("개발자가 받은 아이디 : " + id);
		System.out.println("개발자가 받은 비번 : " + pass);
		
		System.out.println("아이디 패스워드 로그인 처리완료");
		return "성공";
	}
	
}

class DeveloperClient {
	Developer developer = new Developer();
	public void login() {
		String result = developer.login("admin", "1234");
		System.out.println("로그인 결과 : " + result);
	}
}



















