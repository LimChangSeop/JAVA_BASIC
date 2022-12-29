package Java_1207;

public class CalculatorEx2 {

	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		
		cal.plus();
		cal.sub(10, 20);

		System.out.println("===========\n");
		Calculator3 cal2 = new Calculator3();
		
		cal2.sum();
		cal2.sub(20, 30);
		cal2.multi();
		
		int result = cal2.multi();
		System.out.println("두 수의 곱셈은 : " + result);
		result = cal2.multi();
		System.out.println("곱셈 결과에 + 1000 : " + (result + 1000));

		cal2.div(20, 30);
		System.out.println("두 수의 나눗셈은 : " + result);
		result = cal2.div(100, 6);
		System.out.println("나눗셈 결과 * 10 : " + result * 10);
		
		// 문제 1) 클래스 Calculator4을 생성하고 사칙연산을 하기 위한 메소드 4개를 각각 생성 후 사칙 연산을 진행하세요.
		// 메소드 명 : sum, sub, multi, div
		// 메소드 형태 : sum - 2번형태, sub - 3번형태, multi - 4번형태, div - 1번형태
		// 변수 : int x, int y, int result;
	}

}
