package object_0405_0407;

public class Ex3 {

	public static void main(String[] args) {
		
		String str = new String("자바");
		System.out.println(str);
		System.out.println(str.toString());
		
		Person2 p2 = new Person2("홍길동", 13, "123123-123123");
		System.out.println(p2);
		System.out.println(p2.toString());
		
//		String personInfo = p2.toString();
		
		Person3 p3 = new Person3("빠르빠", 13, "123-123");
		System.out.println(p3);
		System.out.println(p3.toString());
	}

}

class Person2 {
	String name;
	int age;
	String jumin;
	
	public Person2(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
}

class Person3 {
	String name;
	int age;
	String jumin;
	
	public Person3(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return "Person3 [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
	
	
}














