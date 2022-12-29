package Java_1207;

public class CalculatorEx {

	// Calculator에서 선언한 것을 들고와서 사용함.
	public static void main(String[] args) {
		
		// 처음에는 무조건 초기화를 시켜줘야 한다.
		Calculator Cal = new Calculator();
		
		Cal.powerOn();
		
		int result1 = Cal.plus(10, 20);
		
		System.out.println("result1 : " + result1);
		
		int x = 10;
		int y = 4;
		double result2 = Cal.divide(x, y);
		System.out.println("result2 : " + result2);
		
		Cal.powerOff();
		
		Cal.returnTest1();
		System.out.println("\n===== true 값 =====");
		Cal.returnTest2(true);
		System.out.println("\n===== flase 값 =====");
		Cal.returnTest2(false);
	}

}
