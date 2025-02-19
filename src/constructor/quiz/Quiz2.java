package constructor.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		Car car = new Car();
		car.company = "현대";
		car.model = "쏘나타";
		car.color = "흰색";
		car.maxSpeed = 200;
		car.showCarInfo();
		
		Car car2 = new Car("기아", "레이", "검정색", 150);
		car2.showCarInfo();
	}

}

class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	
	public Car() {
		super();
	}


	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void showCarInfo() {
		System.out.println("제조사:" + company + " 모델명:" + model + " 색:" + color + " 최고속도:" + maxSpeed);
	}
}