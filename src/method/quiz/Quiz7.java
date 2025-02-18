package method.quiz;

public class Quiz7 {
	
	// 세자리 정수의 각 자리수의 합을 구하는 함수를 만들어주세요
    // 예 : 932 => 9 + 3 + 2 = 14
	// 100자리 = 932 / 100 = 9
	// 10자리 = (932 - 9*100) / 10;
	// 1자리 = 932을 10으로 나눈 나머지 ? 2
	
	public static void hap(int num) {
		int sum = 0;
		sum = sum + (num%10);
		num = num/10;
		sum = sum + (num%10);
		num = num/10;
		sum = sum + num;
		
		System.out.println(sum);
	}	
	public static void method(int n) {
		int hundred = n / 100;
		int ten = (n - hundred * 100) / 10;
		int one = n % 10;
		System.out.println(hundred + ten + one);
	}
	public static void main(String[] args) {
		
		method(932);
		
	}

}
