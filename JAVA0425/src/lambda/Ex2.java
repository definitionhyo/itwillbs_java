package lambda;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 익명 객체를 생성하는 람다식
		 * - 자바는 객체 지향 언어로 객체 없이 메서드를 호출할 수 없다.
		 * - 람다식은 객체 없이 인터페이스의 구현만으로 메서드를 호출할 수 있는데
		 *   그 이유는 익명 내부 클래스에 있다.
		 * - 익명 내부 클래스는 클래스 이름 없이 인터페이스 자료형 변수에 
		 *   바로 메서드 구현부를 생성하여 대입할 수 있음.
		 * - 즉, 람다식으로 메서드를 구현해서 호출하면 컴퓨터 내부에서는
		 *   익명클래스가 생성되고 이를 통해 익명 객체가 생성되는 것.
		 */
		
		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			}
		};
		// => 내부적으로 익명 객체가 생성되어 메서드를 호출할 수 있게 됨
		concat3.makeString("Hello", "World");
		
		System.out.println("-------------------------------------");
		
		/*
		 * 람다식에서 사용하는 지역 변수
		 * - 람다식 코드에서는 외부 메서드의 지역 변수를 수정할 수 없음
		 *   그 이유는 지역 변수는 메서드 호출이 끝나면 메모리에서 사라지기 때문에 
		 *   익명 내부 클래스에서 사용하는 경우에는 지역 변수가 상수로 변하기 때문
		 */
		
		int i = 100; // main() 메서드의 지역변수
		
		StringConcat concat2 = (s, v) -> {
//			i = 200; // main() 메서드의 지역변수 i 는 상수(final) 이므로 값 변경 불가!
			// => Local variable i defined in an enclosing scope 
			//    must be final or effectively final
			System.out.println(i);
			System.out.println(s + "," + v);
		};
		
		concat2.makeString("itwill", "busan");
		
		System.out.println("===========================================");
		
		/*
		 * 람다식의 실행블록에서 변수 참조(this)
		 * 
		 * 람다식은 컴파일러에 의해 익명의 내부클래스로 처리되기 때문에
		 * 변수에 대한 참조 규칙이 동일하다.
		 * - 외부클래스의 멤버를 자유롭게 사용할 수 있음
		 * - 자바 8 부터는 일반 로컬 변수도 사용할 수 있는데
		 *   final 키워드가 적용된 것처럼 새로운 값을 할당할 수 없다!
		 *   
		 * 하지만 this 를 사용하는 방법이 약간 다름
		 * - 람다식에서 this는 타켓 인터페이스가 아닌 외부클래스를 나타낸다.
		 * - 따라서, 람다식에서 this와 외부클래스.this 는 동일한 객체를 나타낸다.
		 */
		
		VariableUseTest vut = new VariableUseTest();
		vut.lambdaTest();
				

	} // main() 메서드 끝

}

// ============================================================
@FunctionalInterface
interface MyFuncInterface {
	int interfaceMember = 20;  // 상수
	String method(String msg); // 추상 메서드
}

class VariableUseTest {
	private int memberVar = 10; // 인스턴스 멤버 변수
	
	public void useFIMethod(MyFuncInterface mi) { // 매개변수로 인터페이스형 타입 설정
		System.out.println(mi.method("홍길동"));
	}
	
	public void lambdaTest() {
		int localVar = 30;
		
		/*
		 * 출력 결과 비교
		 * - 람다식 내부에서 this 와 외부클래스.this는 같음을 알 수 있다.
		 * - 람다식에서의 this 는 마치 해당되는 클래스
		 *   (여기서는 VariableUseTest) 처럼 접근 됨
		 * - 익명 내부클래스에서의 this 는 해당되는 인터페이스
		 *   (여기서는 MyFuncInterface) 처럼 접근 됨
		 */
		
		// 람다식을 사용한 경우
		useFIMethod((String msg) -> {
			
			System.out.println(this.memberVar); // 접근가능(O)
			System.out.println(memberVar); 		// 접근가능(O)
			
//			System.out.println(interfaceMember);      // 접근불가(X)
//			System.out.println(this.interfaceMember); // 접근불가(X)
			
			System.out.println("this : " + this);
			System.out.println("외부클래스.this : " + VariableUseTest.this);
			System.out.println("변수 참조 : " + localVar + " : " + memberVar);
//			localVar++; // 로컬변수 수정은 불가!
			return "람다식 : " + msg + ", " + (++memberVar);
			
		});
		
		System.out.println("=====================================");
		
		// 익명 객체를 사용한 경우
		useFIMethod(new MyFuncInterface() {
			
			@Override
			public String method(String msg) {
//				System.out.println(this.memberVar); // 접근불가(X)
				System.out.println(memberVar);		// 접근가능(O)
				
				System.out.println(interfaceMember);      // 접근가능(O)
				System.out.println(this.interfaceMember); // 접근가능(O)
				
				System.out.println("this : " + this);
				System.out.println("외부클래스.this : " + VariableUseTest.this);
				System.out.println("변수 참조 : " + localVar + " : " + memberVar);
//				localVar++; // 로컬변수 수정은 불가!
				return "람다식 : " + msg + ", " + (++memberVar);
			}
		});
	}
	
}







