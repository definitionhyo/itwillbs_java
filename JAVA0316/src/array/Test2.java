package array;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 배열의 최대값 구하는 코드
		 * numbers = {3, 2, 14, 21, 100, 4, 2, 1}
		 * int max; int min; int sum; int av;
		 * 
		 */
		
		
		
		int[] numbers = {3, 2, 14, 21, 100, 4, 2, 1};
		int max = numbers[0];
		int min = numbers[0];
		int sum = 0;
		double av;
		
		//최대값
		for(int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("배열의 최대값 : " + max);
		
		//최소값
		for(int i = 0; i < numbers.length; i++) {
			if(min < numbers[i]) {
				continue;
			} else {
				min = numbers[i];
			}
		}
		System.out.println("배열의 최소값 : " + min);
		
		//다더한값
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("합계 : " + sum);
		
		//평균
		av = (double) sum / numbers.length;
		System.out.println("평균 : " + av);
		
		System.out.println("=================================");
		
		
		/*
		 * 거스름돈을 몇개의 동전으로 지불할 수 있는지를 계산하는 문제
		 * 변수 money 의 금액을 동전으로 바꾸었을 때
		 * 각각 몇개의 동전이 필요한지 계산해서 출력
		 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야함.
		 * [hint] 나눗셈 연산자와 나머지 연산자를 사용해야한다.
		 * 
		 * 
		 * [출력예시]
		 * money =  2680
		 * 500원 = 5
		 * 100원 = 1
		 * 50원  = 1
		 * 10원  = 3
		 */
		
		int[] coin = {500, 100, 50, 10};
		int money = 2680;
//		int div;
//		int after;
		
		for(int i = 0; i < coin.length; i++) {
			if(money != 0) {
				System.out.println(coin[i] + "원 필요 개수 : " + (money / coin[i]));
//				after = money % coin[i];
				money %= coin[i];
//			div = money / coin[i];
//			System.out.println(div);
//			System.out.println(after);
			}
		}
		
		}
		
		
		
		
		

	}


