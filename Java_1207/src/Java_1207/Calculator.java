package Java_1207;

public class Calculator {
	
	// void는 반환 타입, powerOn은 메소드 이름.
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// 메서드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void returnTest1() {
		System.out.println("returnTest1 메서드 실행");
		System.out.println("두번째 줄 실행");
		System.out.println("return 키워드 실행");
		
		return;
	}
	
	// return을 없애고 Ex부분에서 true를 쓰게 된다면 모두 출력이 됨.
	void returnTest2(boolean flag) {
		if(flag == true) {
			System.out.println("flag 값이 true로 출력");
			System.out.println("return을 만남");
			return;
		} 
		System.out.println("flag값이 false");
		System.out.println("return을 만나지 않음.");
	}
}
