package while_;

public class Test {

	public static void main(String[] args) {
		// while문을 사용하여 구구단 2단 출력
		int dan = 2;
		System.out.println(" < " + dan + "단 >");
		
		int i = 1; // 초기식
		
		while(i <= 9) { // 조건식
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i) );
			i++; // 증감식
		}
		
		System.out.println("===========================");
		
		// while문을 사용하여 정수 1 ~ 10까지의 합(total)을 계산 후 출력
		int total = 0;// 누적변수 선언 및 초기화
		int num = 1; // 초기식
		while(num <= 10) {
			total += num;
			num++; // 증감식
		}
		
		// 누적변수 출력
		System.out.println("1 ~ 10까지 정수의 합 = " + total);
		

	}

}








