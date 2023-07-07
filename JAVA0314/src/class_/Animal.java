package class_;
/*
 * 동물(Animal)에 해당하는 Animal 클래스 정의
 * 1. 분석
 *  - 속성 : 이름(name, 문자열), 나이(age, 정수)
 *  - 동작 : 짖다(cry())
 *  
 * 2. 설계 - 클래스 정의
 * < 클래스 정의 기본 문법 >
 * [접근제한자] class 클래스명 {
 * 		// 멤버변수(=필드, 인스턴스 변수)
 *		// 생성자
 *		// 메서드
 * }
 *  
 */

public class Animal {
	// 멤버변수 선언
	String name;
	int age;
	
	// 메서드 정의
	// 짖다(cry()) : 매개변수 없고, 리턴값도 없는 메서드
	public void cry() {
		System.out.println("동물 울음 소리!");
	}
	
}





