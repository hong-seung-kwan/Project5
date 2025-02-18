package method.quiz;

public class Quiz4 {
	// 빼기 함수
	// 첫번째 수가 두번째 수보다 작으면 -999 출력
	// 예: 20 10 => 10 10 20 => -999

	public static int substract(int n1, int n2) {
		if(n1 < n2) {
			return -999;
			// 조건에 맞지 않기때문에 차를 구할 필요가 없음
		}		
		int result = n1 - n2;
		return result;
	}
// 	    return의 의미
//      결과값을 반환한다
//      함수를 종료한다
	
	
	
//	public static void method1(int n1, int n2) {
//		if (n1 > n2) {
//			System.out.println(n1 - n2);
//		} else {
//			System.out.println(-999);
//		}
//
//	}
//
	public static int method2(int n1, int n2) {
		// 리턴값은 모든 경우에 반환이 되어야 한다
		// 하지만 아래 조건문은 조건을 만족하는 경우에만 반환이되어서
		// 모든 경우에 반환이 되지 않는다
		if (n1 > n2) {
			return n1 - n2;
		} else {
			return -999;
		}
	}

	public static void main(String[] args) {
//		method1(10, 20);
//		method1(50, 20);
//
//		int r = method2(30, 20);
//		System.out.println(r);
		
		int r = substract(10, 20);
		System.out.println(r);

	}

}
