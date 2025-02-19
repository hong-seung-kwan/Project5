package reference;

// 기초타입과 참조타입의 메모리 구조 비교하기
public class Ex2 {

	public static void main(String[] args) {
		
		// 기초타입은 값이 같은지 비교한다
		int num1 = 1;
		int num2 = 1;
		boolean result1 = (num1 == num2); // true
		System.out.println(result1);
		
		// 참조타입은 주소가 같은지 비교한다
		Subject math1 = new Subject("수학", 85);
		Subject math2 = new Subject("수학", 85);
		boolean result2 = (math1 == math2);
		System.out.println(result2);
	}

}
