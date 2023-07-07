package break_continue;

public class Test1 {

	public static void main(String[] args) {
		/* 1~100까지 정수의 합 계산(total변수에 저장)
		 * 단, 합계가 1000보다 클 경우 반복문 종료하고 빠져나간 뒤
		 * 1000보다 커지는 시점의 정수(x)를 출력
		 */
//		int i = 1;
//		int total = 0;
//		
//		while(i < 101) {
//				
//			total += i;
//			i++;
//			
//			if(total > 1000) {
//				System.out.println("합이 1000 넘어가는 i의 값 : " + i);
//				break;
//			}
//			
//			System.out.println("1 ~ " + i + "까지의 합 : " + total);
//		}
//		
		
		/*
		 * 1 + (-2) + 3 + (-4) + 5 + (-6) + .... 생략.... 형식으로더할때
		 * 총 합이 100 이상이되는 x값 출력(break문 사용)
		 * (true) = 무한반복
		 */
		/* 홀수 = 양수
		/  짝수 = 홀수
		 * 총합 >= 100 => break
		*/
		
		int x = 1;
		int total = 0;
		
		while(true) {
			if(x % 2 == 0) {
				System.out.println(-x);
				total -= x;
			} else {
				System.out.println(x);
				total += x;
			} 
			
			
			if(total >= 100) {
				break;
			}
			x++;
		}
		System.out.println("x = " + x);
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
	}
		
		
	}
