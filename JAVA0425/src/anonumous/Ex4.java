package anonumous;

public class Ex4 {

	public static void main(String[] args) {
		AnonymousClass ac = new AnonymousClass();
		ac.method(0, 0);
	}

}

interface Calculatable {
	public int sum();
}

class AnonymousClass{
	private int num;
	
	public void method(final int arg1, int arg2) {
		final int num1 = 0;
		int num2 = 0;
		num = 10;
//		arg1 = 20;
//		arg2 = 20;
//		num1 = 30;
//		num2 = 30;
		Calculatable cal = new Calculatable() {
			@Override
			public int sum() {
				int result = num + arg1 + arg2 + num1 + num2;
				return result;
			}
		};
		
		System.out.println(cal.sum());
		
	}
	
}






































