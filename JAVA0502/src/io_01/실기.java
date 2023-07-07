package io_01;

public class 실기 {

	public static void main(String[] args) {
		int pee = 50000;
		int age = 22;
		if (age > 100 || age <= 0) {
			System.out.println("나이 입력 오류 입니다. 재입력 해주세요.");
		} else if (age > 65 || age < 5) {
			pee = (int) (pee * 0.5);
			System.out.println("나이가 " + age + "세이므로 입장료는 " + pee + "원입니다.");
		} else if (age >= 5 && age <= 19) {
			pee = (int) (pee * 0.7);
			System.out.println("나이가 " + age + "세이므로 입장료는 " + pee + "원입니다.");
		} else {
			System.out.println("나이가 " + age + "세이므로 입장료는 " + pee + "원입니다.");
		}

	}

}
