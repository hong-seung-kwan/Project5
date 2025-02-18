package method;

public class Ex3 {

	// 1~ 10까지 출력하는 함수를 정의
	public static void printTen() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		printTen();
		printTen();
		printTen();
		// 함수의 목적 : 코드의 재사용
	}

}
