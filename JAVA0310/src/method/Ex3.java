package method;

public class Ex3 {

	public static void main(String[] args) {
		// 5. 파라미터가 2개 이상인 메서드 호출
		String snack = "새우깡";
		int myMoney = 1000;
		System.out.println(
				"동생아! 새우깡이랑 1000원 줄테니 쿠쿠다스 바꿔줘!");
		String mySnack = sister_5(1000,"새우깡");
		System.out.println("동생이 바꿔다 준 과자 : " + mySnack);
	
		

	} // main() 메서드 끝

	// 5. 파라미터가 2개 이상인 메서드 정의
	// => 전달되는 데이터가 int, String 형태이므로
	//    파라미터 선언 순서도 int, Stgring 순서로 선언해야 한다!
	public static String sister_5(int money, String snack) {
		System.out.println("오빠가 준 돈 : " + money + "원");
		System.out.println("오빠가 준 과자 : " + snack);
		System.out.println(snack + "을 쿠쿠다스로 교환했다!");
		snack = "쿠쿠다스";
		// snack 변수 값 리턴
		return snack;
		
	}
	
	
} // Ex3 클래스 끝






