package io_01;

public class Test3 {

	public static void main(String[] args) {
		Account acc = new Account("132-4112-123", "홍길동", 30000);
		acc.deposit(5000);
		acc.withdraw(20000);
	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입급금액 : " + amount + "원, 현재잔고 : " + balance + "원");
	}
	
	public int withdraw(int amount) {
		
		if(balance < amount) {
			System.out.println("현재잔고 : " + balance + "원, 출금할 금액 : " + amount + "원");
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
		} else {
			System.out.println("현재잔고 : " + balance + "원, 출금할 금액 : " + amount + "원");
			balance -= amount;
			System.out.println(amount + "원이 출금 되었습니다 (현재 잔고 : " + balance + "원)");
			
		}
		return amount;
	}
	
}









