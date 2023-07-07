package for_;

public class Test2 {

	public static void main(String[] args) {
		// 1 ~ 10까지 1씩 증가하면서, 정수 중 짝수의 합만 계산
		
		// 누적변수 선언 및 초기화
		int total = 0;
		// for문
		for(int i = 1; i <= 10; i++) { // 1 ~ 10까지 1씩 증가하면서 반복
			// 짝수일 경우에만 누적변수에 현재 값 i를 누적
			if(i % 2 == 0) { // 짝수 판별
				// 짝수일 때 누적 수행
				total += i;
				System.out.println("i = " + i + ", total = " + total);
			} else { // 짝수가 아닐 때(= 홀수일 때)
				System.out.println(i + " : 홀수이므로 누적X");
			}
		}
		
		// 누적변수 활용(출력)
		System.out.println("1 ~ 10까지 정수 중 짝수의 합 = " + total);

		System.out.println("==================================");
		
		// 1 ~ 10까지 1씩 증가하면서, 정수 중 홀수의 합만 계산
		
		total = 0; // 누적변수 선언 및 초기화
		
		for(int i = 1; i <= 10; i++) { // 1 ~ 10까지 1씩 증가하면서 반복
			// 홀수일 경우에만 누적변수에 현재 값 i를 누적
			if(i % 2 == 1) { // 홀수 판별 (i % 2 > 0)
				// 홀수일 때 누적 수행
				total += i;
				System.out.println("i = " + i + ", total = " + total);
			} else { // 홀수가 아닐 때(= 짝수일 때)
				System.out.println(i + " : 짝수이므로 누적X");
			}
		}
		
		// 누적변수 활용(출력)
		System.out.println("1 ~ 10까지 정수 중 홀수의 합 = " + total);
		
		System.out.println("================================");
		
		// 1 ~ 10까지 1씩 증가하면서 홀수, 짝수의 합을 각각 누적 후 출력
		int oddTotal = 0;	// 홀수의 합
		int evenTotal = 0;	// 짝수의 합
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) { // 홀수일 때
				// 홀수의 합을 저장하는 변수 oddTotal에 i값을 누적
				oddTotal += i;
			} else { // 홀수가 아닐 때(짝수일 때)
				// 짝수의 합을 저장하는 변수 evenTotal에 i값을 누적
				evenTotal += i;
			}
		}
		
		System.out.println("1 ~ 10까지 정수 중 짝수의 합 = " + evenTotal);
		System.out.println("1 ~ 10까지 정수 중 홀수의 합 = " + oddTotal);
		
		
	}

}





