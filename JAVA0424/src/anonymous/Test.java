package anonymous;

public class Test {

	public static void main(String[] args) {
		/*
		 * Worker 클래스의 익명 자식 객체를 이용하여
		 * 필드(멤버변수), 로컬 변수의 초기값과 매서드의 매개값을 대입
		 * 필드 : "디자인을 합니다." 출력
		 * 로컬변수 : "개발을 합니다." 출력(method1)
		 * 매개값 : "테스트를 합니다." 출력(method2)
		 */
		AnonyClass ac = new AnonyClass();
		ac.member.start();
		ac.method1();
		ac.method2(new Worker() {

			@Override
			public void start() {
				System.out.println("테스트를 합니다.");
			}
		});
	}
}

// 부모클래스로 사용될 Worker 클래스 정의
// start() 메서드 정의
class Worker {
	public void start() {
		System.out.println("쉬고 있습니다.");
	}
}

// 익명객체를 이용하는 AnonyClass 정의
class AnonyClass {
	// 디자인을 합니다 출력
	Worker member = new Worker() {

		@Override
		public void start() {
			System.out.println("디자인을 합니다");
		}
	};
	
	public void method1() {
		Worker localVar = new Worker() {

			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
			
		};
		
		localVar.start();
	}		
	
	public void method2(Worker worker) {
		worker.start();
	}
}









