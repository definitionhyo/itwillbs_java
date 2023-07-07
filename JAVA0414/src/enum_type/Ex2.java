package enum_type;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * enum 상수 연산 및 메서드
		 * - enum 상수 값은 동등비교연산자(==) 로 일치 여부 비교 가능하며,
		 *   switch ~ cas 문에서도 enum 타입 비교가 가능함
		 * - enum 타입 상수에는 각각 ordinal(순서번호) 값이 자동 부여됨
		 *   => 0부터 부여됨
		 *   => enum 객체의 ordinal() 메서드를 통해서 얻을 수 있음
		 */
		
		EnumWeek today = EnumWeek.FRIDAY;
		
		if(today == EnumWeek.FRIDAY) {
			System.out.println("금요일 입니다!");
		} else {
			System.out.println("금요일이 아닙니다!");
		}
		
		// enum 타입 객체는 switch 문에 전달 가능함
		switch(today) {
			// case 문을 사용하여 enum 상수를 지정하면 비교 가능
			// => 주의! enum타입명.상수명 이 아닌 그냥 상수 자체를 비교
//			case EnumWeek.MONDAY : // 컴파일 에러 발생!
			case MONDAY : System.out.println("월요일 입니다!"); break;
			case TUSEDAY : System.out.println("화요일 입니다!"); break;
			case WEDENSDAY : System.out.println("수요일 입니다!"); break;
			case THURSDAY : System.out.println("목요일 입니다!"); break;
			case FRIDAY : System.out.println("금요일 입니다!"); break;
			case STAURDAY : System.out.println("토요일 입니다!"); break;
			case SUNDAY : System.out.println("일요일 입니다!"); break;
		}
		
		System.out.println("=========================================");
		
		// ordinal() : 상수의 순서번호를 정수로 리턴
		System.out.println("오늘의 ordinal 값 : " + today.ordinal());
		
		// name() : 상수명을 문자열로 리턴 (= toString()와 동일)
		String strToday = today.name();
		System.out.println(strToday);

	}

}







