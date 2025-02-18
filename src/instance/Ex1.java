package instance;

// 학생클래스의 인스턴스 생성하기
public class Ex1 {

	public static void main(String[] args) {
		
		// 타입 변수명 = new 생성자();
		Student student = new Student();
		student.studentId = 1001;
		student.studentName = "둘리";
		student.grade = 2;
		student.address = "인천 연수구~";
		
		student.showInfo();

	}

}
