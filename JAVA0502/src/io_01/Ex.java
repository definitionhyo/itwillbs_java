package io_01;

import java.io.IOException;
import java.io.InputStream;

public class Ex {

	public static void main(String[] args) {
		
//		InputStream is = null; // finally 에서도 사용하기위해 위쪽에 선언
		
//		try {
//			System.out.println("데이터를 입력하세요 : ");
//			is = System.in;
//			int n = is.read();
//			System.out.println("입력데이터 : " + n);
//			System.out.println("입력 데이터를 문자로 변환 : " + (char)n);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
////			System.out.println("무조건 실행됨!");
//			if(is != null) try {is.close();} catch(IOException e) { }
//		}

//		======================================================================
		
//		try(InputStream is = System.in) {
//			System.out.println("데이터를 입력하세요 : ");
//			int n = is.read();
//			System.out.println("입력데이터 : " + n);
//			System.out.println("입력데이터(문자로 변환 : " + (char)n);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("데이터를 입력하세요. (취소 시 Ctrl + Z)");
		try(InputStream is = System.in){
			int n = is.read();
			
			while(n != -1) {
				System.out.println("입력된 데이터 : " + n + ", 문자로 변환 : " + (char)n);
				n = is.read();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}











































