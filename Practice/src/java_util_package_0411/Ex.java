package java_util_package_0411;

import java.util.Random;

public class Ex {

	public static void main(String[] args) {
		
		Random r = new Random();
		for(int i = 1; i < 11; i++) {
//			System.out.println(r.nextInt());
			
//			System.out.println(r.nextDouble());
			
//			System.out.println(r.nextBoolean());
			
			System.out.println(r.nextInt(10));
			
			System.out.println(r.nextInt(10) + 1);
		}
		
	}

}
