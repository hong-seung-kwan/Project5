package instance.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		//주문의 인스턴스 생성
		Order order = new Order();
		
		order.orderNo = 111;
		order.orderDate = "2025년2월19일";
		order.customerName = "둘리";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		order.showOrderInfo();

	}
}

class Order {
	int orderNo;
	String orderDate;
	String customerName;
	String address;
	
	// 리턴타입 함수의이름(매개변수)
	// 사람의 정보만 출력하고 끝나는 메소드
	public void showOrderInfo() {
		System.out.println("주문번호:" + orderNo + "\n주문날짜:" + orderDate + "\n주문자이름:" + customerName + "\n배송지:" + address);
	}
}


