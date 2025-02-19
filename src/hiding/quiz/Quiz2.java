package hiding.quiz;

//자동차 클래스
//getter 출력
public class Quiz2 {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCompany("현대");
		car.setModel("소나타");
		car.setColor("흰색");
		car.setMaxSpeed(200);
		
		System.out.println(car.getCompany()+","+car.getModel()+","+car.getColor()+","+car.getMaxSpeed());

		String com = car.getCompany();
		String mod = car.getModel();
		String col = car.getColor();
		int max = car.getMaxSpeed();
		System.out.println(com+","+mod+","+col+","+max);
	}

}

class Car{
	private String company;
	private String Model;
	private String color;
	private int maxSpeed;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}