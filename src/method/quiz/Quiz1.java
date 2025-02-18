package method.quiz;

public class Quiz1 {

	// 두 숫자를 입력받아 차를 구하는 함수를 정의하세요
	// 함수를 호출하여 8-3의 결과를 출력하세요
	
	// 리턴값 x
//	public static void method1(int n1, int n2) {
//		int result = n1 - n2;
//		System.out.println(result);
//	}
//	public static void method2(int n1, int n2) {
//		int result = n1 * n2;
//		System.out.println(result);
//	}
//	public static void method3(int n1, int n2) {
//		int result = n1 / n2;
//		System.out.println(result);
//	}
	// 리턴값 o
	public static int method(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	
	public static void main(String[] args) {
		
//		method1(8, 3);
//		method2(5, 10);
//		method3(10,5);
		
		int r = method(8, 3);
		System.out.println(r);
	}
	

}
