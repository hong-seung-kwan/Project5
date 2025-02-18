package method.quiz;

public class Quiz3 {
	
	// 두 수를 비교하는 함수
	// 둘 중 더 큰 숫자 구하기
	// 예:10,5 => 10
	
	// 리턴값 x
	public static void method1(int n1, int n2) {
		if(n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}
	// 리턴값 o
	public static int method3(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}
	
	
	public static int method2(int n3, int n4) {
		int result;
		if(n3 > n4) {
			result = n3;
		} else {
			result = n4;
		}
		return result;
	}

	public static void main(String[] args) {
//		method1(10, 5);
//		method1(100, 200);
//		
		int r = method2(70, 30);
		System.out.println(r);

		int result = method3(10, 5);
		System.out.println(result);
	}

}
