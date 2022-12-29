package java_1123;

public class BreakContinueEx {

	public static void main(String[] args) {
		System.out.println("============= break / continue =============");
		
		System.out.println("===== break =====");
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				break; // 만나면 즉시 종료
			}
			else {
				System.out.println("값 : " + i);	
			}
			
		}
		
		System.out.println("===== continue =====");

		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				continue; // 만나면 현재 것만 종료하고 끝까지 실행.
			}
			else {
				System.out.println("값 : " + i);
			}
			
		}
		
		System.out.println("===== while문으로 break / continue =====");
		
		System.out.println("===== break =====");
		
		int count = 0;
		while(count < 10) {
			if(count == 5) {
				break;
			}
			else {
				System.out.println("값 : " + count);
			}
			count++;
		}
		
		System.out.println("===== continue =====");
		
		count = 0;
		
		while(count < 6) {
			count++; // while문 에서는 if문 전에 count가 들어가줘야 한다.
			if(count == 3) {
				continue; // 밑에 실행 안하고 바로 조건식으로 올라감.
			}
			else {
				System.out.println("값 : " + count);
			}
			// count++; <- 이것을 밑에 쓰게 되면
			// countinue를 만나서 값이 변하지 않았으므로 무한 루프가 돌게되어서 다음 값이 나오지 않는 것.
		}
	}

}
