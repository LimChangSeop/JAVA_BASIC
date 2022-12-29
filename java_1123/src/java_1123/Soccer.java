package java_1123;

public class Soccer {

	public static void main(String[] args) {
		
		int Result = (int)(Math.random() * 3) + 1;
		
		System.out.println("오늘 한국 vs 포르투갈 결과는?");
		
		switch(Result) {
		case 1:
			System.out.println("오늘은 포르투갈을 이깁니다!");
			break;
		case 2:
			System.out.println("어림도 없죠");
			break;
		default:
			System.out.println("어머 비겨버렸네요?");
			break;
		}
	}

}
