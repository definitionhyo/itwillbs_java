package array;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 배열의 최대값 구하는 코드
		 * numbers = {3, 2, 14, 21, 100, 4, 2, 1}
		 * int max; int min; int sum; int avg;
		 * 
		 * 출력결과
		 * 
		 * 최대값 : 100
		 * 최소값 :
		 * 합계 :
		 * 평균 :
		 * 
		 */
		
		int[] numbers = {3, 2, 14, 21, 100, 4, 2, 1};
		
		int max = numbers[0];
		int min = numbers[0];
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 1; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
			if(max < numbers[i]) {
				max = numbers[i];
			}
			
			if(min > numbers[i]) {
				min = numbers[i];
			}
			
			sum += numbers[i];
		}
		
		sum += numbers[0];
		
		avg = (double)sum / numbers.length;
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계   : " + sum);
		System.out.println("평균   : " + avg);
		
		System.out.println("===================================");
		
		/*
		 * 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제.
		 * 변수 money의 금액을 동전으로 바꾸었을 때
		 * 각각 몇 개의 동전이 필요한지 계산해서 출력
		 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다.
		 * [Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
		 * 
		 * [출력예시]
		 * money = 2680
		 * 500원 = 5
		 * 100원 = 1
		 *  50원 = 1
		 *  10원 = 3
		 */
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			/*
			 * 거스름돈(money)을 각 동전으로 나누었을 때 몫 = 필요 동전 수
			 * 거스름돈(money)을 각 동전으로 나눈 나머지 = 남은 거스름돈
			 */
			System.out.println(coinUnit[i] + "원 : " + (money / coinUnit[i]) + "개");
			money %= coinUnit[i];
			System.out.println("남은 거스름돈 : " + money + "원");			
		}
		
		

	}

}





