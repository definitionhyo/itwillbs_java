package static_0320_0330;

public class Ex4 {

	public static void main(String[] args) {
//		SingletonClass sc = new SingletonClass();
		SingletonClass sc = SingletonClass.getInstance();
		sc.str = "싱글톤으로한거";
		
		SingletonClass sc2 = SingletonClass.getInstance();
		System.out.println(sc.str == sc2.str);
	}

}

class SingletonClass {
	String str;
	
	private SingletonClass() {}
	
	private static SingletonClass instance = new SingletonClass();

	public static SingletonClass getInstance() {
		return instance;
	}
}

class SingletonClass2 {
	private static SingletonClass2 instatnce = new SingletonClass2();
	
	private SingletonClass2() {}

	public static SingletonClass2 getInstatnce() {
		return instatnce;
	}
	
	
	
}