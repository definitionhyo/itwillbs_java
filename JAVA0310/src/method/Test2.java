package method;

public class Test2 {

	public static void main(String[] args) {
		// 3. 파라미터만 있고, 리턴값은 없는 메서드 호출
		// => 문자열 1개를 전달하면 해당 문자열을 출력하는 print() 메서드 호출
		print("아이티윌 부산교육센터!");
		
		System.out.println("-------------------------");
		
		// => 정수 1개를 전달하면 해당 정수에 대해 "홀수", "짝수" 판별하는
		//    checkNumber() 메서드 호출
		checkNumber(10);
		
		System.out.println("==============================");
		// 4. 파라미터도 있고, 리턴값도 있는 메서드 호출
		// => 정수 1개를 전달하면 해당 정수에 대해 "홀수", "짝수"를 판별하고
		//    판별 결과 문자열을 리턴하는 checkNumber2() 메서드 호출
		String result = checkNumber2(10);
		System.out.println("판별 결과 : " + result);
		

	} // main() 메서드 끝

	// 4. 파라미터도 있고, 리턴값도 있는 메서드 정의
	public static String checkNumber2(int num) {
//		if(num % 2 == 1) {
//			return "홀수";
//		} else {
//			return "짝수";
//		}
		
		// --------------------
//		if(num % 2 == 1) {
//			return "홀수";
//		} else if(num % 2 == 0) {
//			return "짝수";
//		}
//		
//		return "";
		
		// ----------------------------
		// if문과 else if 문 내에서 직접 리턴하지 않고
		// 리턴 데이터를 별도의 변수에 저장만 한 뒤 if문 종료 후 return 수행
		String result = "";
		
		if(num % 2 == 1) {
			result = "홀수";
		} else if(num % 2 == 0) {
			result = "짝수";
		}
		
		return result;
	}
	
	// ================================================
	// 3. 파라미터만 있고, 리턴값은 없는 메서드 정의
	// 정수를 1개 전달받아 해당 정수에 대해 "홀수", "짝수" 판별하는
	// checkNumber() 메서드 정의
	public static void checkNumber(int num) { // int num = 10 과 동일
		if(num % 2 == 1) {
			System.out.println(num + " : 홀수!");
		} else {
			System.out.println(num + " : 짝수!");
		}
	}
	
	// 문자열 1개를 전달받아 해당 문자열을 출력하는 print() 메서드 정의
	// => 외부로 부터 전달받은 문자열을 저장하기 위한 변수를 소괄호()안에 선언
	public static void print(String str) {
		System.out.println(str);
	}
	
	
	
} // Test2 클래스 끝
