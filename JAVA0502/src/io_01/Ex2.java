package io_01;

import java.io.IOException;
import java.io.InputStream;


public class Ex2 {

	public static void main(String[] args) {
		
//		System.out.println("데이터를 입력하세요 : ");
//		
//		try (InputStream is = System.in;){
//			byte[] bArr = new byte[10];
//			
//			int n = is.read(bArr);
//			System.out.println("입력 데이터 크기 : " + n + "바이트");
//			
//			for(byte b : bArr) {
//				System.out.println("입력데이터 : " + b + ", 문자열로 변환 : " + (char)b);
//			}
//			
//			String str = new String(bArr);
//			System.out.println("입력데이터(문자열 : )" + str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	
		System.out.println("데이터를 입력하세요. (취소 시 : Ctrl + Z)");
		
		try(InputStream is = System.in){
			byte[] bArr = new byte[10];
			
			int n = is.read(bArr);
			
			while(n > 0) {
				String str = new String(bArr);
				System.out.println("입력데이터(문자열) : " + str);
				n = is.read(bArr);
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
































