package array;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열 생성 연습
		 * 
		 * <출력 결과>
		 * 95 86
		 * 83 92 96
		 * 78 83 93 87 88
		 * sum = 881
		 * avg = 88.1
		 */
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
				
				// array 배열 내의 모든 요소를 누적변수 sum에 누적
				sum += array[i][j];
				count++;
			}
			
			System.out.println();
		}
		
		// 평균은 합계 계산이 완료된 후 계산하면 되기 때문에 
		// for문 종료 후 계산
		avg = (double)sum / count;
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		
		System.out.println("============================");
		
		/*
		 * 2차원 배열 arr[5][5] 선언
		 * 값 저장하는 코드
		 * 
		 * 출력 결과
		 * 1  6  11  16  21
		 * 2  7  12  17  22
		 * 3  8  13  18  23
		 * 4  9  14  19  24
		 * 5 10  15  20  25
		 */
		int arr[][] = new int[5][5];
		int value = 1;  // 값을 담고 있는 변수
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value;
				value += 5;
//				System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ", arr[i][j]);
				
			}
			System.out.println();
			value = i + 2;
		}
	}

}






