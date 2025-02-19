package constructor;

public class Ex1 {

	public static void main(String[] args) {
		Student student = new Student();

	}

}

// 학생 클래스
class Student{
	int studentId;
	String studentName;
	
	// 생성자 함수
	// 일반함수와 다른 특별한 함수..
	// 리턴x 매개변수o
	// 목적: 인스턴스 생성 + 값 초기화
	// 매개변수가 없는 생성자: 디폴트 생성자
//	public Student () {
//		
//	}
	
	// 클래스 안에 생성자가 하나도 없으면
	// 컴파일러가 기본생성자를 만들어줌
	// 컴파일된 파일안에..
}
