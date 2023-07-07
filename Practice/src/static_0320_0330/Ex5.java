package static_0320_0330;

public class Ex5 {

	public static void main(String[] args) {
		Account ac = Account.getInstance();
		ac.accountNo = "123-3123-123-2";
		ac.ownerName = "가낟";
		ac.balance = 5105;
		
		ac.showAccountInfo();
		
	
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

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	
	private static Account instance = new Account();
	
	private Account() {}

	public String getAccountNo() {
		return accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public static Account getInstance() {
		return instance;
	}

	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재 잔고 : " + balance);
	}
	
	
	
}
