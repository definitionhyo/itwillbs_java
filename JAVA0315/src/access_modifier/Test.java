package access_modifier;

public class Test {

	public static void main(String[] args) {
		Account acc = new Account();
//		acc.accountNo = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 10000;
		// => Setter 메서드로 대체
		
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
		acc.setBalance(10000);
		
//		System.out.println("계좌번호 : " + acc.accountNo);
//		System.out.println("예금주명 : " + acc.ownerName);
//		System.out.println("현재잔고 : " + acc.balance + "원");
		// => Getter 메서드로 대체
		
		System.out.println("계좌번호 : " + acc.getAccountNo());
		System.out.println("예금주명 : " + acc.getOwnerName());
		System.out.println("현재잔고 : " + acc.getBalance() + "원");

	}

}

/*
 * Account 클래스 정의
 * - 멤버변수
 *   계좌번호(accountNo), 예금주명(ownerName), 현재잔고(balance)
 *   => private 접근제한자 설정
 * - Getter/Setter 메서드를 정의하여 멤버변수에 간접적으로 접근하도록 수정  
 */

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
		
//	// Getter 메서드 정의
//	// => 파라미터는 없고, 리턴값만 있는 메서드
//	public String getAccountNo() {
//		return accountNo;
//	}
//	
//	public void setAccountNo(String newAccountNo) {
//		accountNo = newAccountNo;
//	}
//	
//		
//	public String getOwnerName() {
//		return ownerName;
//	}
//	
//	public void setOwnerName(String newOnwerName) {
//		ownerName = newOnwerName;
//	}
//	
//	public int getBalance() {
//		return balance;
//	}
//	
//	public void setBalance(int newBalance) {
//		balance = newBalance;
//	}
	
	// ======================================
	// 단축키를 사용하여 Getter/Setter 메서드 자동 정의
	// - 클래스 내에서 멤버변수 선언 후 Alt + Shift + S -> R
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}












