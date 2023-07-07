package wrapper_class_0410_0410;

public class Test5_2 {

	public static void main(String[] args) {
		String pass = "admin123";
		char[] chArr = pass.toCharArray();
		int point = 0;
		
		for(int i = 0; i < chArr.length; i++) {
			boolean b = false;
			if(Character.isUpperCase(chArr[i])) {
				b = true;
				point += 1;
				return ;
			}else if(Character.isLowerCase(chArr[i])) {
				b = true;
				return;
			}else if(Character.isDigit(chArr[i])) {
				b = true;
				return;
			}else if(chArr[i] == '!') {
				b = true;
				return;
			} 
		} //for문끝
		
		System.out.println("최종점수 : " + point);
	}

}
