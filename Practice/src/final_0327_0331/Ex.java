package final_0327_0331;

public class Ex {

	public static void main(String[] args) {
		FinalMember fm = new FinalMember(20);
		fm.change();
		System.out.println(fm.getFinalMember());
		System.out.println("-------------------------");
		
		FinalClass fc = new FinalClass();
		System.out.println(fc.num);
		System.out.println("-------------------------");
		
		SubFinalClass sfc = new SubFinalClass();
		System.out.println(sfc.fc.num);
	}

}

class FinalMember {
	final int finalMember = 10;
	final int blankFinalMember;
	
	public FinalMember(int blankFinalMember) {
		this.blankFinalMember = blankFinalMember;
	}
	
	public void change() {
//		finalMember = 99;
		System.out.println("finalMemember = " + finalMember);
		System.out.println("blankFinalMember = " + blankFinalMember);
		final int finalLocalVar = 20;
	}
	
	public int getFinalMember() {
		return finalMember;
	}
	
}

class FinalMethod{
	
	public final void finalMethod() {
		System.out.println("슈클의 finalMethod()");
	}

	public void normalMethod() {
		System.out.println("슈클의 normalMethod()");
	}
}

class SubFinalMethod extends FinalMethod {

//	@Override
//	public void finalMethod() {
//		super.finalMethod();
//	}
	
	@Override
	public void normalMethod() {
		System.out.println("섭클에서 오버라이딩 normalMethod()");
	}
}

final class FinalClass {
	int num = 10;
	
	public void method() {
		System.out.println("슈클의 method()");
	}
}

//class SubFinalClass extends FinalClass {
//	
//}

class SubFinalClass {
	FinalClass fc = new FinalClass();
}
