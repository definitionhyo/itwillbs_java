package object_0405_0407;

public class Test3 {

	public static void main(String[] args) {
		Account acc1 = new Account("123-123", "빠르빠", 10000);
		Account acc2 = new Account("123-123", "빠르빠", 10000);
		
		if(acc1.equals(acc2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	
}
