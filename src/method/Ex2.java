package method;

// 두수를 더하는 함수 만들고 호출하기
public class Ex2 {

	// 매개변수인 n1,n2는 함수내부에서 생성되고 소멸된다
	// 호출이 끝나면 사용할 수 없다
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int sum = add(num1, num2);
		System.out.println("두수의 합: " + sum);
		
	}

}
