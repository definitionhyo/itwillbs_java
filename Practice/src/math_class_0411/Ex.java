package math_class_0411;

public class Ex {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println("----------------------");
		
		int num = -10;
		
		System.out.println(Math.abs(num));
		System.out.println(Math.max(num, 20));
		System.out.println(Math.min(num, 20));
		System.out.println(Math.sqrt(4));
		
		System.out.println("========================");
		
		double dNum = 3.141592;
		
		System.out.println(Math.ceil(dNum));
		System.out.println(Math.floor(dNum));
		System.out.println(Math.round(dNum));
		
		System.out.println("========================");

		System.out.println(dNum * 1000);
		System.out.println(dNum * (Math.pow(10, 4-1)));
		
		System.out.println(Math.round(dNum * 1000));
		System.out.println(Math.round(dNum * 1000) / 1000.0);
		
		System.out.println("==========================");
		System.out.println(dNum * 10000);
		System.out.println((int)(dNum * 10000));
		System.out.println((int)(dNum * 10000) / 10000.0);
		
	}

}




















































