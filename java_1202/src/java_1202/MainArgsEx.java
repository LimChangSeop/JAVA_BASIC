package java_1202;

public class MainArgsEx {

	public static void main(String[] args) { 
		// (String[] args) <- 매개변수, 해당 메서드 실행 시 필요한 데이터를 외부에서 전달받아 메서드 내부에서 사용.
		System.out.println("main method...");
		
		for(int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] : " +  args[i]);
		}
		
	}

}