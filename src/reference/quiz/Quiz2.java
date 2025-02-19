package reference.quiz;

// 1. 직원 클래스
// 2. 부서 클래스
// 3. 새로운 부서 
public class Quiz2 {

	public static void main(String[] args) {

		Employee employee1 = new Employee("부서장", 40, 4000000, 20);
		Employee employee2 = new Employee("수석연구원", 30, 3000000, 10);
		Employee employee3 = new Employee("책임연구원", 20, 2000000, 10);

		Department department = new Department(employee1, employee2, employee3);

	}

}

class Employee {
	String name;
	int age;
	int salary;
	int year;

	public Employee(String name, int age, int salary, int year) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.year = year;
	}
}

class Department {
	Employee employee1;
	Employee employee2;
	Employee employee3;

	public Department(Employee employee1, Employee employee2, Employee employee3) {
		super();
		this.employee1 = employee1;
		this.employee2 = employee2;
		this.employee3 = employee3;
	}

}
