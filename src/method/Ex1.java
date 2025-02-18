package method;

// 함수(메소드)
public class Ex1 {

	// 함수 정의
	// void : 반환값 없다는 의미
	// () : 매개변수가 없다는 의미
	public static void method1() {
		System.out.println("매개변수와 리턴값이 없는 메소드입니다");
	}

	// String : 반환되는 값의 타입이 String
	// (): 매개변수 없음

	public static String method2() {
		return "매개변수는 없고 리턴값은 있는 메소드입니다";
	}

	// void: 리턴값 없음
	// (int num): 매개변수 하나 있음
	public static void method3(int num) {
		System.out.println("num: " + num);
	}

	// int : 계산한 결과(숫자)를 반환
	// (): 정수타입의 매개변수 2개
	public static int method4(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {

		int r = method4(3, 5);
		System.out.println(r);
	}

}
