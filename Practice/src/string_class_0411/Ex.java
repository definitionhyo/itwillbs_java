package string_class_0411;

import java.util.Arrays;

public class Ex {

	public static void main(String[] args) {
		String s1 = "Java Programming";
		String s2 = "     아이티윌     부산 교육센터    ";
		String s3 = "자바/JSP/안드로이드";
		
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println("----------------------------");
		
		System.out.println(s1.length());
		
		System.out.println(s1.equals("JAVA PROGRAMMING"));
		System.out.println(s1.equalsIgnoreCase("JAVA PROGRAMMING"));
		
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 11));
		System.out.println(s1.substring(5, 12));
		
		System.out.println(s1.concat("!"));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('x'));
		System.out.println(s1.indexOf("Program"));
		System.out.println(s1.lastIndexOf('a'));
		
		System.out.println(s1.replace('a', '@'));
		System.out.println(s1.replace("a", "@"));
		System.out.println(s1.replace("Java", "JAVA"));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s2.trim());
		System.out.println(s2.contains("부산"));
		System.out.println(s2.contains("강남"));
		System.out.println("-----------------------------------------");
		
		String[ ] subjectArr = s3.split("/");
		for(String c : subjectArr) {
			System.out.println(c);
		}
		
		String s4 = "안녕하세요.자바 프로그래밍입니다.";
		String[] strArr = s4.split("\\.");
		for(String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println("===================================");
		
		String name = "홍길동";
		int age = 20;
		double height = 180.7;
		System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f\n", name, age, height);
		String formatStr = String.format("이름 : %s, 나이 : %d, 키 : %.1f\n", name, age, height);
		System.out.println(formatStr);
		System.out.println("===================================");

		String s5 = "admin123!";
		char[] chArr = s5.toCharArray();
		for(char c : chArr) {
			System.out.println(c);
		}
		
		System.out.println(Arrays.toString(chArr));
		
		
	}

}



















































