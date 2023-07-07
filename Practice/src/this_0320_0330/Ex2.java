package this_0320_0330;

public class Ex2 {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		System.out.println(d1.year + "년 " + d1.month + "월 " + d1.day + "일");
		System.out.println("------------------------------------");
		
		MyDate d2 = new MyDate(1932);
		System.out.println(d2.year + "년 " + d2.month + "월 " + d2.day + "일");
		System.out.println("------------------------------------");
		
		MyDate d3 = new MyDate(1937, 7);
		System.out.println(d3.year + "년 " + d3.month + "월 " + d3.day + "일");
		System.out.println("------------------------------------");
		
		MyDate d4 = new MyDate(1932, 12, 3);
		System.out.println(d4.year + "년 " + d4.month + "월 " + d4.day + "일");
		System.out.println("------------------------------------");
		
		
	}

}

//초기화 2023 03 31 로 초기화 한다고 가정
class MyDate {
	int year;
	int month;
	int day;
	
	public MyDate() {
		this(2023, 3, 31);
		System.out.println("Mydate() 메서드 호출");
	}
	
	public MyDate(int year) {
		this(year, 3, 31);
		System.out.println("Mydate(year) 메서드 호출");
	}
	
	public MyDate(int year, int month) {
		this(year, month, 31);
		System.out.println("Mydate(year, month) 메서드 호출");
	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println("MyDate(year month day) 생성자 호출");
	}
	
	
	
	
	
	
}