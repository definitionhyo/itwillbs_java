package io_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex5 {

	public static void main(String[] args) {
//		InputStream is = System.in;
//		InputStreamReader reader = new InputStreamReader(is);
//		BufferedReader buffer = new BufferedReader(reader);
		
//		세 문장을 하나로
		
//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("데이터를 입력하세요 : ");
//		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))){
//			String str = buffer.readLine();
//			System.out.println("입력데이터 : " + str);
//			
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		==========================================================================================
		System.out.println("데이터를 입력하세요 : (취소 : Ctrl + Z)");
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))){
			String str = buffer.readLine();
			
			while(str != null) {
				System.out.println("입력데이터 : " + str);
				str = buffer.readLine();
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}



















































