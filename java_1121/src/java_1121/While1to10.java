package java_1121;

public class While1to10 {

	public static void main(String[] args) {
		
		System.out.println("while문으로 1~10까지 출력");
		
		// while문 주의사항
		// 1. 카운트 변수를 while문 외부에 생성(무한 반복 가능성 존재)
		// 2. 카운트 변수 값을 while문 내부에서 연산(무한 반복 가능성 존재)
		// 3. while문을 중지할 수 있는 로직은 반드시 마련해야함.
		// 4. count 연산의 위치에 따라 출력되는 결과가 달라짐.
		// 5. 2개 이상의 while문을 연달아 사용 시 count변수의 이름이 동일하면 하나의 while문이 종료된 후 카운트 변수 값을 반드시 초기화 해야함.
		int count = 1;
		
		while(count < 11) {
			System.out.println(count);
			count++;
			
			if(count == 10) {
				System.out.println("count가 10이 되었습니다.");
			}
			count++;
		}
		
		System.out.println("--------------------------------------------");
		
		while(count < 11) {
			System.out.println("현재 count : " + count);
			count++;
		}
		
		// do-while : 기본적으로 while문과 동일한 반복문이다. 무조건 한번은 실행하는 반복문임.
		
		
		System.out.println("-----------------do ~ while---------------");
		
		count = 10;
		do{
			System.out.println("현재 count : " + count);
			count++;
		} while(count < 10);
		
		System.out.println("-----------------while---------------");
		
		count = 10;
		while(count < 10) {
			System.out.println("현재 count : " + count);
			count++;
		}
	}

}
