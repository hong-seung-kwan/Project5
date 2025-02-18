package method.quiz;

public class Quiz6 {

	// 계산기 메소드 만들기
	// 두 수와 연산자(+-*/)를 입력받아 결과를 출력
	// 예: 1 5 + => 1 + 5 = 6
	
	// 함수이름?
	// 매개변수?
	// 리턴값?
	
	public static void calc(int n1, int n2, char oper) {
		switch(oper) {
		case '+':
			System.out.println(n1 + n2);
			break;
		case '-':
			System.out.println(n1 - n2);
			break;
		case '*':
			System.out.println(n1 * n2);
			break;
		case '/':
			System.out.println(n1 / n2);
			break;	
		}
	}	
//	public static void method(int n1, int n2, char c) {
//		if(c == '+') {
//			System.out.println(n1 + n2);
//		} else if(c == '-') {
//			System.out.println(n1 - n2);
//		} else if(c == '*') {
//			System.out.println(n1 * n2);
//		} else {
//			System.out.println(n1 / n2);
//		}
//	}
	
	public static void main(String[] args) {
		
//		method(20, 4, '/');
		calc(2, 3, '*');

	}

}
