package object_0405_0407;

public class Ex2 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		
		if(s1 == s2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(s1.equals(s2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		if(s3 == s4) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(s3.equals(s4)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
	}

}
