package this_0320_0330;

public class Test {

	public static void main(String[] args) {
		Account a1 = new Account("123-312-23-", "가가가", 5000);
		a1.showAcccountInfo();
		
	}

}

/*
 * Account 클래스 생성
 * - 멤버변수 accountNo, ownerName, balance 선언(private 접근제한자 적용)
 * - 생성자 : 파라미터 3개를 전달받아 초기화하는 생성자 정의
 * - Getter/Setter 메서드 정의
 * - showAccountInfo() 메서드 정의 -> 계좌번호, 예금주명, 현재잔고 출력
 */

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
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

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAcccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		
	}
	
}