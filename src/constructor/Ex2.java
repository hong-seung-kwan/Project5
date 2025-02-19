package constructor;

public class Ex2 {

	public static void main(String[] args) {
		// 디폴트 생성자를 사용하여 인스턴스 생성
		Person person1 = new Person();
		person1.name = "둘리";
		person1.height = 150;
		person1.weight = 50;
		
		
		// 이름을 초기화하는 생성자를 사용
		// 생성자를 선택하는 방법: 매개변수
		Person person2 = new Person("또치");
		person2.height = 170;
		person2.weight = 70;
		
		// 세번쨰 생성자를 사용
		// 인스턴스 생성과 동시에 모든 멤버변수를 초기화
		Person person = new Person("도우너", 180, 80);
		
		// 필요한 생성자를 만들어서 사용할것
	}
}

// 사람을 정의하는 클래스
class Person {
	String name; //이름
	int height; //키
	int weight; //몸무게
	
	// 기본 생성자: 매개변수x
	// 인스턴스를 생성
	public Person() {
		
	}
	// 이름을 매개변수로 받아서 초기화하는 생성자
	// 인스턴스 생성 + 이름 초기화
	public Person(String nm) {
		name = nm; // 멤버변수 = 매개변수
	}
	
	// 이름, 키, 몸무게를 초기화하는 생성자
	// 인스턴스 생성 + 초기화
	public Person(String nm, int he, int we) {
		name = nm; // 전역 = 지역
		height = he;
		weight = we;
	}
}