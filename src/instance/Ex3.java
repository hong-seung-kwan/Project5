package instance;

// 자동차 클래스의 인스턴스 만들기
public class Ex3 {

	public static void main(String[] args) {
		// 인스턴스 생성
		Car car = new Car();
		// 자동차의 상태 변경
		car.setStatus(true);
		car.showInfo();

	}

}

// 자동차 클래스
class Car {
	
	// 자동차의 현재 상태
	boolean status;
	
	// 자동차의 상태를 변경하는 함수
	public void setStatus(boolean stt) {
		status = stt;
	}
	
	// 자동차의 상태를 출력하는 함수
	public void showInfo() {
		System.out.println(status);
	}
}
