package io_01;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println("데이터를 입력하세요 : ");
		
		try(InputStreamReader reader = new InputStreamReader(System.in)){
			char[] chArr = new char[10];
			int n = reader.read(chArr);
			System.out.println("입력데이터(문자열) : " + new String(chArr));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}






















































