package instance;

// 학생을 정의하는 클래스
public class Student {

	// 학생의 속성(멤버변수)
	int studentId; // 학번(1001)
	String studentName; // 이름(둘리)
	int grade; // 학년(1)
	String address; // 주소(인천 남동구...)
	
	// 학생의 정보를 출력하는 메소드
	public void showInfo() {
		System.out.println("학번:"+studentId+", 이름:"+studentName+", 학년:"+grade+", 주소: "+ address);
	}
	
}
