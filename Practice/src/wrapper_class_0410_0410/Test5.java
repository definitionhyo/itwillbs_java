package wrapper_class_0410_0410;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		String str = "Hello";
		
		char[] chArr = str.toCharArray();
		
		Test5 t = new Test5();
		String result = t.encrypt(chArr);
		System.out.println(result);
	}

	public String encrypt(char[] chArr) {
		char[] encryptedArr = new char[chArr.length];
		for(int i = 0; i < chArr.length; i++) {
			encryptedArr[i] = (char) (chArr[i] + 3);
		}
		return Arrays.toString(encryptedArr) ;
	}
	
	
}
