package enum_type;

public class Ex3 {

	public static void main(String[] args) {
		Month now = Month.FEBRUARY;
		System.out.println(now + ", " + now.getMonthkor());
	}

}

enum Month {
	
	// 생성자를 사용하면 상수에 따른 값을 결합 가능
	JANUARY("1월"), FEBRUARY("2월");
	// => 영어 달 이름과 한국어 달 이름 결합
	
	private String monthkor;
	
	Month(String monthkor) { // 달 이름을 문자열로 전달받아 초기화
		this.monthkor = monthkor;
	}

	public String getMonthkor() {
		return monthkor;
	}

	public void setMonthko(String monthkor) {
		this.monthkor = monthkor;
	}
	
	
}
