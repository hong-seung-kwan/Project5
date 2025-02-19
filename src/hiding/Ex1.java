//package hiding;
//
//public class Ex1 {
//
//	public static void main(String[] args) {
//		
//		MyDate date = new MyDate();
//		
//		date.setMonth(2);
//		date.setDay(10);
//		date.showInfo();
//	}
//
//}
//
//// 날짜
//class MyDate {
//	// private로 설정하면 변수를 클래스 내부에서만 사용할 수 있다!
//	private int month; // 월
//	private int day; // 일
//	
//	// 월을 반환하는 함수
//	public int getMonth() {
//		return month;
//	}
//	// 월을 변경하는 함수
//	public void setMonth(int mon) {
//		month = mon;
//	}
//	// 일을 반환하는 함수
//	public int getDay() {
//		return day;
//	}
//	// month가 2월인 경우, 1~28일을 벗어나면 저장x
//	public void setDay(int d) {
//		if(month == 2) {
//			if(d < 1 || d > 28) {
//				System.out.println("2월에는 "+d +"일이 없습니다...");
//				return;
//			}
//		}
//		
//		day = d;
//	}
//	// 날짜를 출력하는 함수
//	public void showInfo() {
//		System.out.println(month+"월 "+day+"일");
//	}
//}