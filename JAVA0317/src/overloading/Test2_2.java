package overloading;

public class Test2_2 {

	public static void main(String[] args) {
		/*
		 * Account() 생성자 호출 시 다음과 같이 초기화 후 출력
		 * - 계좌번호 : 111-1111-111
		 *   예금주명 : 홍길동
		 *   현재잔고 : 0원
		 *   
		 * Account(String) 생성자 호출 시 다음과 같이 초기화 후 출력
		 * - 계좌번호 : 입력받은 계좌번호
		 *   예금주명 : 홍길동
		 *   현재잔고 : 0원
		 * 
		 * Account(String, String) 생성자 호출 시 다음과 같이 초기화 후 출력
		 * - 계좌번호 : 입력받은 계좌번호
		 *   예금주명 : 입력받은 예금주명
		 *   현재잔고 : 0원  
		 *   
		 * Account(String, String, int) 생성자 호출 시 다음과 같이 초기화 후 출력
		 * - 계좌번호 : 입력받은 계좌번호
		 *   예금주명 : 입력받은 예금주명
		 *   현재잔고 : 입력받은 현재잔고
		 *   
		 */
		
		Account acc = new Account();
		acc.showAccountInfo();
		
		System.out.println("------------------------");
		
		// 계좌번호를 전달받는 생성자 호출
		Account acc2 = new Account("999-9999-999");
		acc2.showAccountInfo();
		
		System.out.println("------------------------");
		
		// 계좌번호, 예금주명을 전달받는 생성자 호출
		Account acc3 = new Account("999-9999-999", "이순신");
		acc3.showAccountInfo();
		
		System.out.println("------------------------");
		
		// 계좌번호, 예금주명, 현재잔고를 전달받는 생성자 호출
		Account acc4 = new Account("999-9999-999", "이순신", 10000);
		acc4.showAccountInfo();

	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
	}
	
	public Account(String newAccountNo) {
		accountNo = newAccountNo;
		ownerName = "홍길동";
		balance = 0;
	}
	
	public Account(String newAccountNo, String newOnwerName) {
		accountNo = newAccountNo;
		ownerName = newOnwerName;
		balance = 0;
	}
	
	public Account(String newAccountNo, String newOnwerName, int newBalance) {
		accountNo = newAccountNo;
		ownerName = newOnwerName;
		balance = newBalance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
}






