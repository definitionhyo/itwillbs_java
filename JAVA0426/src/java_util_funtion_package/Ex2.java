package java_util_funtion_package;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("============ Supplier<T> ============");
		
		Supplier<String> supplier = new Supplier<String>() {

			@Override
			public String get() {
				return "Hello";
			}
		};

		System.out.println(supplier.get());
		
		System.out.println("--------------------------------------------");
//		람다식 표현
		Supplier<String> supplier2 = () -> { return "Hello2"; };
		System.out.println(supplier2.get());
		
		System.out.println("================================================");
		
		IntSupplier supplier3 = () -> {
			Random random = new Random();
			return random.nextInt(6);
		};
		System.out.println(supplier3.getAsInt());
		
	}

}























