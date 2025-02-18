package method.quiz;

public class Quiz2 {

	// 합을 구하는 함수 만들고 호출
	// 두 수를 입력받아 n1부터 n2까지의 합을 출력
	// 예 : 1, 3 => 1 + 2 + 3 = 6
	
		
//	// 리턴값 x
//	public static void method1(int n1, int n2) {
//		int sum = 0;
//		for(int i = n1; i <= n2; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//	}
	// 리턴값 o
	public static int method2(int n3, int n4) {
		int sum = 0;
		for(int i = n3; i <= n4; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
//		method1(3, 5);
		
		int sum = method2(1, 5);
		System.out.println(sum);

	}

}
