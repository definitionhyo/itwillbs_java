package object_0405_0407;

import java.util.Objects;

public class Ex {

	public static void main(String[] args) {
		Person p1 = new Person("가나다", "123-123");
		Person p2 = new Person("가나다", "123-123");
		System.out.println("p1정보 : " + p1);
		System.out.println("p2정보 : " + p2);
		
		if(p1 == p2) {
			System.out.println("두개 주소값 같다");
		} else {
			System.out.println("다르다");
		}
		
		if(p1.equals(p2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		Person p3 = p2;
		
		if(p3 == p2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(p3.equals(p2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println("-----------------------------");
		
		OverridePerson p10 = new OverridePerson("다라마", "132-132");
		OverridePerson p11 = new OverridePerson("다라마", "132-132");
		if(p10 == p11) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(p10.equals(p11)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
	}
	
	
}

class Person {
	String name;
	String jumin;
	public Person(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}
}

class OverridePerson {
	String name;
	String jumin;
	
	public OverridePerson(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OverridePerson other = (OverridePerson) obj;
		return Objects.equals(jumin, other.jumin) && Objects.equals(name, other.name);
	}
	
	
	
}






























