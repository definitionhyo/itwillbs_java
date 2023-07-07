package java_util_funtion_package;

import java.util.function.Consumer;

public class Ex1 {

	public static void main(String[] args) {
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		consumer.accept("Hello");
		
		System.out.println("---------------------------------");
		
//		람다식 형태
		Consumer<String> consumer2 = x -> System.out.println(x);
		consumer.accept("Hello2");
		
		System.out.println("---------------------------------");

		Student s1 = new Student("홍길동", 80);
		
		printStudent(s1, s -> System.out.println(s.name));
		printStudent(s1, s -> System.out.println(s.score *= 1.5));
		printStudent(s1, s -> System.out.println(s.name + " : " + s.score));
		
		printStudent(s1, s -> {
			System.out.println(s.name);
			s.score *= 1.5;
			System.out.println(s.name + " : " + s.score);
		});
		
	} //main
	
	public static void printStudent(Student s, Consumer<Student> printer) {
		printer.accept(s);
	}
	
	
} //Ex

class Student {
	String name;
	double score;
	
	public Student(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}










































