package static_0320_0330;

public class Ex {

	public static void main(String[] args) {
//		NormalMember n1 = new NormalMember();
//		NormalMember n2 = new NormalMember();
//		System.out.printf("n1.a : %d, n2.a : %d\n", n1.a, n2.a);
//		System.out.printf("n1.b : %d, n2.b : %d\n", n1.b, n2.b);
//		
//		n1.a = 99;
//		n1.b = 999;
//		
//		System.out.printf("n1.a : %d, n2.a : %d\n", n1.a, n2.a);
//		System.out.printf("n1.b : %d, n2.b : %d\n", n1.b, n2.b);
//		
		System.out.println("StaticMember.a : " + StaticMember.a);
//		System.out.println("StaticMember.a : " + StaticMember.b);
//		
		StaticMember s1 = new StaticMember();
		StaticMember s2 = new StaticMember();
		
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		System.out.printf("s1.b : %d, s2.b : %d \n", s1.b, s2.b);
		
		s1.a  =99;
		s1.b = 999;
		
		
		s2.a = 1000;
		System.out.printf("s1.a : %d, s2.a : %d \n", s1.a, s2.a);
		System.out.printf("s1.b : %d, s2.b : %d \n", s1.b, s2.b);
		
		
		
		
	}
	

}

class NormalMember {
	int a = 10;
	int b = 20;
}

class StaticMember {
	static int a = 10;
	int b = 20;
}
