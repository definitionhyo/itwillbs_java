package static_0320_0330;

public class Ex2 {

	public static void main(String[ ] args) {
		StaticMethod.staticMethod();
		
//		StaticMethod.setStaticVar = 99;
		StaticMethod.setStaticVar(99);
		
		StaticMethod sm = new StaticMethod();
		sm.normalMethod();
		sm.staticMethod();
		StaticMethod.staticMethod();
		
	}
}

class StaticMethod {
	private int normalVar = 10;
	
	private static int staticVar = 20;
	
	public void normalMethod() {
		System.out.println("일반메서드 normalMethod()");
		
		System.out.println("일반 메서드에서 인스턴스 변수 접근 : " + normalVar);
		System.out.println("일반 메서드에서 static 변수 접근 : " + staticVar);
		
		staticMethod();
	}
	
	public static void staticMethod() {
		System.out.println("정적메서드 staticMethod()");
		
//		System.out.println(normalVar);
		System.out.println(staticVar);
		
//		normalMethod();
	}

	public void setNormalVar(int normalVar) {
		this.normalVar = normalVar;
	}

	public static void setStaticVar(int staticVar) {
//		this.staticVar = staticVar;
		StaticMethod.staticVar = staticVar;
	}
	
	
	
	
}
