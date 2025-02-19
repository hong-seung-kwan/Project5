package hiding;

public class Ex2 {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("둘리");
		String n = person.getName();
		System.out.println(n); // 둘리

	}

}

class Person {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}