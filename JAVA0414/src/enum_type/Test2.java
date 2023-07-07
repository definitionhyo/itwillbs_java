package enum_type;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * enum(EnumWeek2) 를 활용
		 * => 요일의 앞 3글자로 상수 지정
		 *    (ex. MON ... SUN)
		 * 평일(월~ 목) 이면 "하...."
		 * 금요일이면 "불금!"
		 * 주말이면 "주말!" 을 출력하는 코드를 작성해보자!
		 */
		
		EnumWeek2 today = EnumWeek2.FRI;
		
		// if문 (ordinal() 메서드 활용)
		if(today.ordinal() < 4) {
			System.out.println("하...");
		} else if(today.ordinal() == 4) {
			System.out.println("불금!");
		} else {
			System.out.println("주말!");
		}
		
		// switch ~ case문
		switch(today) {
			case MON : 
			case TUS :
			case WED : 
			case THU : System.out.println("하..."); break;
			case FRI : System.out.println("불금!"); break;
			case SAT :
			case SUN : System.out.println("주말!"); break;	
		}
	}

}

enum EnumWeek2 {
	MON, TUS, WED, THU, FRI, SAT, SUN
}