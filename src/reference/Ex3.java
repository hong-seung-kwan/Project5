package reference;

public class Ex3 {
	
	// 기초타입 매개변수의 값을 변경해도 원본값에는 영향이 없다
	public static void method1(int n) {
		n = 5;
	}
	// 참조타입 매개변수의 값을 변경하면 원본값에 영향이 있다
	public static void method2(Subject subject) {
		subject.scorePoint = 50;
	}
	
	public static void main(String[] args) {
//		int num = 10;
//		method1(num);
//		System.out.println(num);
		Subject subject = new Subject("수학", 85);
		method2(subject);
		System.out.println(subject.scorePoint);
	}

}
