package abstract_;

public class Test2 {

	public static void main(String[] args) {

//		Vehicle v = new Vehicle(); // 인스턴스 생성 불가!
		// => Cannot instantiate the type Vehicle
		
		// 추상클래스 Vehicle 타입을 참조변수로 활용
		Vehicle v = new ElectricCar(); // 업캐스팅
		v.reportPosition();
		v.addFeul();
		
		v = new DieselCar(); // DieselCar -> Vehicle 변환(업캐스팅)
		v.reportPosition();
		v.addFeul();
		
		

	}

}

/*
 * 전기차(ElectricCar) 와 디젤차(DieselCar)의 공통적인 요소를 추상화하여
 * 차량(Vehicle) 클래스에 정의
 * - 공통요소
 *   curX, curY : 현재 위치의 좌표를 저장하는 변수
 *   reportPosition() // 연료 공급지의 위치 출력
 *   => 출력 형태 : "현재 위치 : curX, curY"
 *   addFuel() // 연료 공급 방법 출력
 *   => 전기차 : 전기차 충전소에서 배터리 충전
 *      디젤차 : 주유소에서 디젤 연료 공급
 *   => 차량마다 연료 공급 방법이 달라지므로 오버라이딩을 해야하며
 *      오버라이딩 강제성을 부여하기 위해 추상메서드로 정의
 */

abstract class Vehicle {
	int curX, curY; // 현재 위치 좌표를 저장하는 변수
	
	public void reportPosition() {
		System.out.println("현재 위치 : " + curX + ", " + curY);
	}
	
//	public void addFeul() {
//		System.out.println("자동차의 연료 공급!");
//	}
	//=> 차량마다 연료 공급 방법이 달라지므로 오버라이딩을 해야하며
	//   오버라이딩 강제성을 부여하기 위해 추상메서드로 정의
	public abstract void addFeul(); // 서브클래스에서 구현 필수!
}

class ElectricCar extends Vehicle {

	@Override
	public void addFeul() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
}

class DieselCar extends Vehicle {

	@Override
	public void addFeul() {
		System.out.println("주유소에서 디젤 연료 공급!");
	}
}







