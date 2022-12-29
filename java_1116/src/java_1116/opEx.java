package java_1116;

public class opEx {
//	main 메서드 : 프로그램의 시작점, 끝점.
	public static void main(String[] args) {
		int a = 100;
		int b = 30;
		
		int c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		c = a / b;
		System.out.println(c);
		
		c = a % b;
		System.out.println(c);
		
		
		System.out.println("----------------------------------------");
		System.out.println("문자열 연산자 시작!");
		System.out.println();
		String str1 = "안녕";
		String str2 = "자바 저녁 강의야. ";
		System.out.println(str2);
		System.out.println(str1);
		
		String str3 = str2 + str1;
		System.out.println(str3);
		
		System.out.println("이제 곧 9시 50분 입니다. " + "종료 시간이네요.");
		
		// ""안에 들어가있는 것은 문자열로 취급을 하기 때문에 100200 으로 출력이 된다.
		str1 = "100";
		str2 = "200";
		
		// 문자열은 연산 불가능. 연결만 가능.
		str3 = str1 + str2;
		System.out.println(str3);
		
		// 문자열과 기본타입을 연산하면 문자열로 취급이 되므로 100200 으로 출력 됨.
		System.out.println("100" + 200);
		
	}

}

