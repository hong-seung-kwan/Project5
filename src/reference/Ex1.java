package reference;

// 학생의 성적을 관리하는 프로그램
public class Ex1 {

	public static void main(String[] args) {
		
		// 성적을 먼저 생성해야함
		Subject math = new Subject("수학", 85);
		Subject kor = new Subject("국어", 100);
		
		Student student = new Student(111, "둘리", math, kor);
		
	}

}

// 과목
class Subject {
	String subjectName; // 과목명
	int scorePoint; // 점수
	
	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
}
//학생
class Student {
	
	int studentId; // 학번
	String studentName; // 이름
	Subject math; // 수학점수
	Subject kor; // 국어점수
	
	public Student(int studentId, String studentName, Subject math, Subject kor) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.math = math;
		this.kor = kor;
	}
	
		
}