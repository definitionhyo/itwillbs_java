package constructor;

public class Test2 {

	public static void main(String[] args) {
		Account2 acc = new Account2("111-1111-111", "홍길동", 10000);
		acc.showAccountInfo();
		
		Account2 acc2 = new Account2("555-5555-555", "이순신", 50000);
		acc2.showAccountInfo();

	}

}

/*
 * Account2 클래스 정의
 * 멤버변수
 * - 계좌번호(accountNo, 문자열)
 *   예금주명(ownerName, 문자열)
 *   현재잔고(balance, 정수)
 *   
 * - 계좌번호, 예금주명, 현재잔고를 한 번에 출력하는
 *   showAccountInfo() 메서드 정의
 *   => 파라미터 없고, 리턴값도 없음
 *   
 * - 인스턴스 생성 시 데이터를 전달받아 인스턴스를 생성
 *   기본값 설정 후
 *   showAccountInfo() 메서드 호출 
 */

class Account2 {
	// 파라미터 생성자 단축키 : Alt + Shift + S -> O
	// => 적어도 하나의 멤버변수는 존재해야 사용 가능
	
	String accountNo;
	String ownerName;
	int balance;
	


//	// 계좌번호, 예금주명, 현재잔고를 전달받아 초기화하는 생성자 Account2() 정의
//	public Account2(String newAccountNo, String newOwnerName, int newBalance) {
//		System.out.println("Account2(String, String, int) 생성자 호출됨!");
//		
//		accountNo = newAccountNo;
//		ownerName = newOwnerName;
//		balance = newBalance;
//		
////		showAccountInfo();
//	}
	
	// 파라미터 생성자 자동 생성 단축키 : Alt + Shift + S -> O
	public Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 계좌 정보를 출력하는 showAccountInfo() 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
}





