package this_0320_0330;

public class Test2 {

	public static void main(String[] args) {
		Account2 a = new Account2();
		Account2 a1 = new Account2("132-32-1");
		Account2 a2 = new Account2("131-35-3-2", "아ㅓ라");
		Account2 a3 = new Account2("123213043-3", "엄ㅈㅇ", 1501530);
		a.showInfo();
		a1.showInfo();
		a2.showInfo();
		a3.showInfo();
	}

}

/*
 * Account2 클래스(계좌번호, 예금주명, 현재잔고) 정의
 * => 기본생성자
 *    계좌번호를 전달받아 초기화하는 생성자,
 *    계좌번호, 예금주명을 전달받아 초기화하는 생성자,
 *    계좌번호, 예금주명, 현재잔고를 전달받아 초기화하는 생성자
 *    (=> 초기화작업 수행하는 생성자)
 * => this() 생성자를 사용하여 클래스 정의
 */

class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
	
	
	
	
	public Account2() {
		this("123-31-2", "가가가", 15000);
		System.out.println("기본생성자");
	}

	public Account2(String accountNo) {
		this(accountNo, "가가가", 15000);
		System.out.println("accounNo생성자");
	}

	public Account2(String accountNo, String ownerName) {
		this(accountNo, ownerName, 15000);
		System.out.println("no,name생성자");
	}

	public Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		System.out.println("No, name balance생성자");
	}
	
	public void showInfo() {
		System.out.println("계좌번호" + accountNo);
		System.out.println("예금주명" + ownerName);
		System.out.println("현재 잔고" + balance);
	}
	
	
}