package this_0320_0330;

public class Ex {

	public static void main(String[] args) {
		Person p = new Person("가나다", 30);
		p.showInfo();
		
		p.setName("다라마");
		p.setAge(50);
		p.showInfo();
	}

}


class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	
	
}