package java_util_package_0411;

import java.util.Date;

public class Ex2 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
//		Date d2 = new Date(0);
		Date d2 = new Date(16812000000L);
		
		System.out.println(d2);
		
		long differentDate = d2.getTime() - d1.getTime();
		
		if (differentDate > 0) {
			System.out.println(differentDate / 1000 / 60 / 60 / 24 + "일 남았음");
		}else if(differentDate < 0) {
			System.out.println(differentDate / 1000 / 60 / 60 / 24 + "일 지남");
		} else {
			System.out.println("오늘");
		}
		
		
	}

}
