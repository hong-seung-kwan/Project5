package method.quiz;

public class Quiz5 {

	// 나누기 함수 만들기
	// 나누는 수(두번째 숫자)가 0이면
	// "나누는 수는 0이 될수 없습니다. 출력
	// 예: 10 2 => 5 10 0 => "나누는 수는 0이 될수 없습니다.

	public static void division(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될수 없습니다");
			return;
			// return은 함수를 종료하는 기능이 있음
		}
		System.out.println(n1 / n2);
	}

	public static void main(String[] args) {
		division(10, 0);

	}

}
