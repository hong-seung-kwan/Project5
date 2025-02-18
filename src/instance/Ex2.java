package instance;

// 학생 클래스로 인스턴스 여러개 만들기
public class Ex2 {

	public static void main(String[] args) {
		
		// 타입 변수명 = new 생성자();
		Student student1 = new Student();
		student1.studentId = 1001;
		student1.studentName = "둘리";
		student1.grade = 2;
		student1.address = "인천 남동구~";
		student1.showInfo();
		System.out.println(student1); // 객체의 주소
		
		Student student2 = new Student();
		student2.studentId = 1002;
		student2.studentName = "또치";
		student2.grade = 3;
		student2.address = "인천 연수구~";
		student2.showInfo();
		System.out.println(student2);
		
		// 인스턴스는 각자 다른 메모리 공간을 갖는다
		
		
	}

}
