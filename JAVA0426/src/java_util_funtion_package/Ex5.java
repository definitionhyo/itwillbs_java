package java_util_funtion_package;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex5 {

	public static void main(String[] args) {
		Predicate<String> predicate = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.contains("Java");
			}
		};
		System.out.println(predicate.test("javaScript"));
		
		System.out.println("-------------------------");
		
		Predicate<String> predicate2 = x -> x.contains("Java") ;
		
		
		System.out.println(predicate2.test("JavaScript"));
		
		System.out.println("====================================");
		
		PredicateTest pt = new PredicateTest();
		
		pt.printSome(num -> num % 3 == 0);
		pt.printSome(num -> num > 5);
		
	}

	
	
}

class PredicateTest {
	int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public void printSome(IntPredicate pred) {
		for(int num : nums) {
			if(pred.test(num)) {
				System.out.println(num + "\t");
			}
		}
		System.out.println();
	}
}












