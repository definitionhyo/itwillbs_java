package static_;

public class Test4 {

	public static void main(String[] args) {
		// Account 인스턴스 생성
//		Account acc = new Account();
		
		// 생성된 인스턴스를 리턴받기
		Account acc = Account.getAcc();
		
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 0;
		
		acc.showAccountInfo();

	}

}

/*
 * Account 클래스 정의
 * - 멤버변수 : acccountNo(계좌번호, 문자열)
 *              ownerName(예금주명, 문자열)
 *              balance(현재잔고, 문자열)
 * - 메서드 : showAccountInfo() 
 *            => 계좌번호, 예금주명, 현재잔고를 한 번에 출력
 * - 싱글톤 디자인 패턴을 적용하여 단 하나의 인스턴스만 생성
 */

class Account {
	// ========== Account 클래스에 대한 싱글톤 패턴 구현 ==========
	// 1. 인스턴스 생성
	private static Account acc = new Account();
	
	// 2. 생성자 정의
	private Account() {}
	
	// 3. Getter 정의
	public static Account getAcc() {
		return acc;
	}
	// ============================================================
	
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
}






