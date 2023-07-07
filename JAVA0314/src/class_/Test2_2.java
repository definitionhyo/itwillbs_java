package class_;

public class Test2_2 {

	public static void main(String[] args) {
		// 은행계좌(Account3) 클래스의 인스턴스(acc) 생성
		Account3 acc = new Account3();
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 10000;
		acc.showAccountInfo();
		
		System.out.println("----------------");
		
		acc.deposit(50000);
		
		System.out.println("----------------");
		
		// 현재잔고보다 적거나 같은 금액을 출금하는 경우(출금 가능)
		int money = acc.withdraw(40000);
		System.out.println("출금된 금액 : " + money + "원");
		
		// 현재잔고보다 많은 금액을 출금하는 경우(출금 불가능)
		money = acc.withdraw(80000);
		System.out.println("출금된 금액 : " + money + "원");
		

	}

}

/*
 * 은행계좌(Account) 클래스 정의
 * [ 멤버변수 선언 ]
 * - 계좌번호(accountNo, 문자열), 예금주명(ownerName, 문자열)
 *   현재잔고(balance, 정수)
 * 
 * [ 메서드 정의 ]
 * - 계좌번호, 예금주명, 현재잔고를 출력하는 showAccountInfo() 메서드
 * 
 * - 입금 기능을 수행하는 deposit() 메서드
 *   => 입금할 금액(amount, 정수)을 전달받아 현재잔고(balance)에 누적한 후
 *      입금된 금액과 입금 후 현재 잔고를 출력
 *      ex) "입금하신 금액 : XXXXX원"
 *          "입금 후 현재 잔고 : XXXXX원"
 *   => 단, 리턴값은 없음
 *   
 * - 출금 기능을 수행하는 withdraw() 메서드
 *   => 출금할 금액(amount, 정수)을 전달받아 현재잔고(balance)에서 차감한 후
 *      출금될 금액과 출금 후 현재잔고를 출력
 *      ex) "출금할 금액 : XXXXX원"
 *          "출금 후 현재 잔고 : XXXXX원"
 *   => 단, 출금 기능을 수행하기 전 현재잔고와 출금할 금액을 비교하여
 *      현재잔고가 출금할 금액보다 적을 경우 출금을 수행하지 않고 다음과 같이 출력
 *      ex) "잔고가 부족하여 출금이 불가능합니다."
 *          "출금할 금액 : XXXXX원, 현재잔고 : XXXXX원"
 *   => 리턴값 있음(출금할 금액에 해당하는 금액 리턴)
 */

class Account3 {
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	// 입금기능
	public void deposit(int amount) {
		// 전달받은 입금금액(amount)을 현재잔고(balance)에 누적 후 출력
		balance += amount;
		System.out.println("입금하신 금액 : " + amount + "원");
		System.out.println("입금 후 현재잔고 : " + balance + "원");
//		showAccountInfo();
	}
	
	// 출금기능
	public int withdraw(int amount) {
		// 입력받은 출금금액(amount)을 현재잔고(balance)에서 차감 후
		// 출금되는 금액(amount)을 리턴
		// 단, 현재잔고가 출금금액보다 적을 경우 출금 불가
		if(balance < amount) { // 현재잔고가 출금금액보다 적은지 판별(출금불가)
			System.out.println("잔고가 부족해서 출금이 불가능합니다.");
			System.out.println(
					"출금할 금액 : " + amount + "원, 현재잔고 : " + balance +"원");
			// return 타입이 int이므로 반드시 리턴값 필수! => 0원 리턴
//			return 0;
			amount = 0;
		} else { // 출금이 가능한 경우(현재잔고 >= 출금금액)
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재잔고 : " + balance + "원");
		}
		
		return amount;
	}
	
	
}








