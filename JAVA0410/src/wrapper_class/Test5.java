package wrapper_class;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		/*
		 * 문자열을 char[] 배열에 분리하여 저장 후
		 * 해당 문자열에 대한 간단한 암호화 작업
		 * - 문자열을 분리하여 저장한 배열을 메서드 encrypt() 에 전달
		 * - 전달받은 배열의 문자에 대해 아스키코드 값 3만큼 증가한 문자를
		 *   별도의 배열에 저장 후 문자열로 변환하여 리턴
		 *   ex) 'A'(65) => 'D'(68)
		 *   ex) "Hello" -> 'H', 'e', 'l', 'l', 'o' 형태로 배열에 저장됨
		 *        암호화 작업 작업물 : 'K', 'h', 'o', 'o', 'r' 
		 *        리턴되면 데이터 : "Khoor"
		 */
		
		String str = "admin123";
		
		// String 타입 문자열을 char 타입 배열로 변환 : toCharArray() 사용
		char[] chArr = str.toCharArray();
		
//		for(int i = 0; i < chArr.length; i++) {
//			System.out.println(i + " 번째 인덱스  : " + chArr[i]);
//		}
		Test5 t = new Test5();
		String encryptResult = t.encrypt(chArr);
		
		System.out.println("암호화 전 : " + Arrays.toString(chArr));
//		System.out.println("암호화 전 : " + str);
		System.out.println("암호화 후 : " + encryptResult);
		
	} // main() 메서드 끝
	
	/*
	 * 암호화 작업을 수행하는 encrypt() 메서드 정의
	 * => 전달받은 배열 내의 모든 문자 값을 +3 을 수행하여 새 배열에 저장 후
	 *    문자열을 결합하여 리턴
	 * => Hint) 전달받은 배열의 크기를 새 배열의 크기로 지정
	 */
	
	public String encrypt(char[] chArr) {
		// 암호화 된 배열을 저장할 새 배열 생성
		// => 어떤 크기의 배열이 파라미터로 넘어올지 특정할 수 없음!
		char[] encryptedArr = new char[chArr.length];
		
		for(int i = 0; i < chArr.length; i++) {
			// 각 배열의 문자 + 3 수행 결과를 새 배열에 저장
			encryptedArr[i] = (char)(chArr[i] + 3);
		}
		
		// char[] 배열을 String 타입으로 리턴
		// 1. String 생성자를 활용
//		String str = new String(encryptedArr);
//		return str;
		
		// 2. String.valueOf() 메서드 활용
//		String str = String.valueOf(encryptedArr);
//		return str;
		
		// 3. StringBuilder 활용
//		StringBuilder buffer = new StringBuilder();
//		for(char ch : encryptedArr) {
//			buffer.append(ch);
//		}
//		String encryptedStr = buffer.toString();
//		return encryptedStr;
			
		return Arrays.toString(encryptedArr);
	}

} // Test5 클래스 끝





