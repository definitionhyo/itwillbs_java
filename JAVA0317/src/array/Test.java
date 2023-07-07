package array;

public class Test {

	public static void main(String[] args) {
		int[][] arr = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88},
		};
				
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	
			
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
		
		double avg;
		avg = sum / ((double)arr[0].length + arr[1].length + arr[2].length);
		System.out.println(avg);
		
		System.out.println("============================");
		
//		System.out.println("행 일일이 하면 빡세니까 밑에는 함수로 해봄");
		
//		int total = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//			}
//			total += arr[i].length;
//		}
//		System.out.println(total);
//		
//		avg = sum / (double)total;
//		System.out.println(avg);
		System.out.println("================");
		System.out.println("선생님이한거"); 
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				count++;
			}
		}
		System.out.println(count);
		
		avg = sum / (double)count;
		System.out.println(avg);
		
		
		
		int arr2[][] = new int[5][5];
		
		int value = 1;
		for(int i = 0; i < arr2.length; i++ ) {
			
			for(int j = 0; j < arr2[i].length ; j ++) {
				arr[i][j] = value;
				System.out.println(arr2[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
//		{
//				{1, 6, 11, 16, 21},
//				{2, 7, 12, 17, 22},
//				{3, 8, 13, 18, 23},
//				{4, 9, 14, 19, 24},
//				{5, 10, 15, 20, 25},
//		};
//		System.out.println("================");
//
//		int count2 = 0;
//		int total2 = 0;
//		for(int i = 0; i < arr2.length; i++) {
//			for(int j = 0; j<arr2[i].length; j++) {
//				System.out.print(arr2[i][j] + " ");
//				count2++;
//				total2 += arr2[i][j];
//			}
//			System.out.println();
//		}
//		System.out.println(total2);
//		System.out.println(count2);
//		System.out.println(total2 / (double)count2);
		
		
		
		
		
		
		
		
	}

}
