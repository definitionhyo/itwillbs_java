package java_util_funtion_package;

import java.util.function.DoubleBinaryOperator;
import java.util.function.UnaryOperator;

public class Ex4 {

	public static void main(String[] args) {
		UnaryOperator<Double> op1 = x -> Math.pow(x, 2);
		UnaryOperator<Double> op2 = new UnaryOperator<Double>() {
			@Override
			public Double apply(Double t) {
				return Math.pow(t, 2);
			}
		};
		
		System.out.println(op1.apply(10.0));
		System.out.println(op2.apply(10.0));
		
		DoubleBinaryOperator op3 = new DoubleBinaryOperator() {
			
			@Override
			public double applyAsDouble(double left, double right) {
				return Math.pow(left, right);
			}
		};
		
		DoubleBinaryOperator op4 = (x, y) -> Math.pow(x, y);
		System.out.println(op3.applyAsDouble(100, 2));
		System.out.println(op4.applyAsDouble(100, 2));
		
		
		
	}

}
