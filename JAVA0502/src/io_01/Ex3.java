package io_01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex3 {

	public static void main(String[] args) {
//		InputStream is = System.in;
		
//		InputStreamReader reader = new InputStreamReader(is);
		
//		InputStreamReader reader = new InputStreamReader(System.in);
//		System.out.println("데이터를 입력하세요 : ");
//
//		try(InputStreamReader reader = new InputStreamReader(System.in);){
//			int n = reader.read();
//			System.out.println("입력된 데이터 : " + n + ", 문자로 변환 : " + (char)n);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
//		===================================================================================
		System.out.println("데이터를 입력하세요 : (CTRL + Z)");
		
		try(InputStreamReader reader = new InputStreamReader(System.in);){
			int n = reader.read();
			
			while(n != -1) {
				System.out.println("입력된 데이터 : " + n + ", 문자로 변환 : " + (char)n);
				n = reader.read();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

















