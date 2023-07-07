package enum_type;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 상수를 사용하여 한정된 데이터를 관리하는 경우
		 * 간편한 선언을 통해 관리할 수 있다는 장점이 있으나
		 * 해당 값의 범위를 벗어나는 값을 사용할 경우 컴파일 시점에서는
		 * 오류 발견이 불가능!
		 * 추가적인 작업을 통해 범위 내의 값인지 판별하는 작업이 별도로 필요함!
		 * => 이를 해결하기 위해 열거형(enum type) 필요!
		 * 
		 * 열거형(Enumeration Type = Enum 타입)
		 * - 상수를 좀 더 확실한 형태로 다루기 위한 객체의 일종
		 * - 데이터타입이 일치하면 다른 데이터라도 사용 가능한 상수의 단점을 해결
		 * - enum 타입은 내부적으로 java.lang.Enum 클래스를 상속받음
		 * 
		 * < 열거타입 정의 방법 >
		 * [접근제한자] enum 열거타입명 {
		 * 		// 열거타입에 사용할 값(상수)을 차례대로 선언
		 * 		상수1, 상수2, ..., 상수n
		 * }
		 * 
		 * - 기본적으로 클래스, 인터페이스 정의 문법과 유사함
		 *   단, 열거타입 중괄호 내에는 상수로 사용될 이름만 지정
		 *   
		 * < 열거타입 사용 방법 >
		 * 1. 열거타입 변수 선언 방법(클래스, 인터페이스와 동일)
		 *  - 열거타입명 변수명
		 *    ex) Month month
		 *    
		 * 2. 열거타입 비교 방법
		 *  - if문 사용 시 동등비교 연산자 사용(==)
		 *  - switch ~ case 문 사용 가능
		 *    (단, case 문에서 열거타입명 없이 상수만 지정 해야함!)
		 *    switch(열거타입변수) {
		 *    	case 열거타입상수1 : 수행할 작업들...;
		 *    	case 열거타입상수2 : 수행할 작업들...;
		 *    	case 열거타입상수n : 수행할 작업들...;
		 *    }
		 *   
		 */
		
		// 일반 상수를 파라미터로 사용하는 경우
		// => 동일한 데이터타입 경우 잘못된 데이터도 전달이 가능해짐
		MyCalendar mc = new MyCalendar();
		mc.setWeek(WeekClass.WEEK_FRIDAY);
		mc.setWeek(10); // 10이라는 정수값을 갖는 요일은 없으나,
		// int 타입 파라미터이므로 컴파일 시점에서는 컴파일에러(문법적 오류)가
		// 발생하지 않는다!
		// 그러나, 해당 데이터를 사용하기 위한 시점에서는 문제가 발생할 수 있다.
		// 따라서, 별도로 해당 범위 내의 데이터인지 판별하는 추가적인 작업을 수행해야 함
		
		mc.setMonth(20); // int 타입 데이터 전달 가능(잘못된 데이터)
		mc.setMonth(WeekClass.WEEK_MONDAY); // 요일도 전달 가능(잘못된 데이터)
		mc.setMonth(MonthClass.JANUARY); // 정상 데이터

		System.out.println("============================================");
		
		// 열거타입 변수 today 선언 및 초기화 후 호출
		EnumWeek today = EnumWeek.FRIDAY;
		System.out.println(today); // toString() 생략됨
		// => FRIDAY 출력됨
		
		// enum 상수를 파라미터로 사용하는 경우
		// => enum 타입 객체의 상수 외에는 그 어떤 값도 전달 불가능하므로 안전!
		MyEnumCalendar mec = new MyEnumCalendar();
//		mec.setEnumWeek(1); // EnumWeek 타입 객체(상수값) 외의 다른 값 전달 불가!
//		mec.setEnumWeek(WeekClass.WEEK_FRIDAY); // WeekClass 타입 상수도 전달 불가!
		mec.setEnumWeek(EnumWeek.FRIDAY); // 오직 EnumWeek 타입 상수만 사용 가능!
		
		System.out.println("============================================");
		
		// EnumWeek 타입 객체는 (java.lang.)Enum 클래스의 서브클래스 타입 객체입니까?
		if(today instanceof Enum) {
			System.out.println("Enum 클래스의 서브클래스이다!");
		} else {
			System.out.println("Enum 클래스의 서브클래스가 아니다!");
		}
		
		if(today instanceof Object) {
			System.out.println("Object 클래스의 서브클래스이다!");
		} else {
			System.out.println("Object 클래스의 서브클래스가 아니다!");
		}
		
		
		
	}

}

// 요일 정보를 관리하는 enum 타입 EnumWeek 정의
enum EnumWeek {
	// 열거형 정의 시 중괄호 내에는 값을 갖는 상수 이름만 나열함
	// => 별도의 값을 지정하지 않는다!
	MONDAY, TUSEDAY, WEDENSDAY, THURSDAY, FRIDAY, STAURDAY, SUNDAY
}

// 월의 정보를 관리하는 enum 타입 EnumMonth 정의
enum EnumMonth {
	JANUARY, FEBRUARY
}

class MyEnumCalendar {
	public void setEnumWeek(EnumWeek week) {
		System.out.println("요일 : " + week);
	}
	
	public void setEnumMonth(EnumMonth month) {
		System.out.println("월 : " + month );
	}
}


// =======================================================
// 요일 정보를 관리하는 WeekClass 클래스 정의
// => 열거타입을 사용하지 않고, 상수만 사용하는 경우
//    요일은 7가지로 정해져있으므로 상수로 처리 가능
class WeekClass {
	// 요일 정보를 상수로 관리
	// => 외부에서 실제 데이터를 정확하게 알지 못해도 상수명(변수명) 만으로 값을 사용 가능
	//    클래스명만으로 접근이 가능하여 접근이 쉬움. 또한, 값 변경이 불가능하여 안전함
	public static final int WEEK_MONDAY = 1;
	public static final int WEEK_TUSEDAY = 2;
	public static final int WEEK_WEDENSDAY = 3;
	public static final int WEEK_THURSDAY = 4;
	public static final int WEEK_FRIDAY = 5;
	public static final int WEEK_STAURDAY = 6;
	public static final int WEEK_SUNDAY = 7;
	
}

// 월 정보를 관리하는 MonthClass 클래스 정의
class MonthClass {
	public static final int JANUARY = 1;
}

class MyCalendar {
	public void setWeek(int week) {
		if(week >= WeekClass.WEEK_MONDAY && week <= WeekClass.WEEK_SUNDAY) {
			System.out.println(week);
		} else {
			System.out.println("요일 입력 에러!");
		}
		
		
	}
	
	public void setMonth(int month) {
		System.out.println(month + "월");
	}
}
















