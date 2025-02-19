package hiding.quiz;

// setMonth 메소드에 조건 추가
// 1~12월이 들어오면 값을 변경하고, 그외 값은 "잘못된 월입니다" 출력
public class Quiz3 {
	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.setMonth(1);
		date.showInfo();
		date.setMonth(13);
		date.setDay(10);
		date.showInfo();
	}
}

//날짜
class MyDate {
	private int month; // 월
	private int day; // 일
	
	// 월을 반환하는 함수
	public int getMonth() {
		return month;
	}
	// 월을 변경하는 함수
	public void setMonth(int mon) {
		if(mon < 1 || mon > 12) {
			System.out.println(mon+"월은 잘못된 월입니다");
			return;
		}
		month = mon;
	}
	// 일을 반환하는 함수
	public int getDay() {
		return day;
	}
	// month가 2월인 경우, 1~28일을 벗어나면 저장x
	public void setDay(int d) {
		if(month == 2) {
			if(d < 1 || d > 28) {
				System.out.println("2월에는 "+d +"일이 없습니다...");
				return;
			}
		}		
		day = d;
	}
	// 날짜를 출력하는 함수
	public void showInfo() {
		System.out.println(month+"월 "+day+"일");
	}
}