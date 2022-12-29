package Java_1207;

public class Calculator2 {
	
	// 2가지 방법
	void plus() {
		int result = 0;
		int x = 10;
		int y = 20;
		
		result = x + y;
		
		System.out.println("두 수의 덧셈 : " +  result);
	}
	
	void sub(int x, int y) {
		int result = 0;
		
		result = x - y;
		System.out.println("두 수의 뺄셈 : " + result);
	}
}
