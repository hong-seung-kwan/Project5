package test1;

public class Test2 {
	public static void main(String[] args) {
		
		Person person = new Person();
		person.name = "둘리";
		person.height = 170;
		
		
	}
}

// 사람 클래스
class Person {
	public String name; // 외부 패키지에서 사용 가능
	int height; // 같은 패키지에서만 사용가능                      public > default > private
	private double weight; // 이 클래스 내에서만 사용가능            
	
	public void showInfo() {
		System.out.println(name+","+height+","+weight);
	}
}