package Java_1216;

public class Access1Ex {

	public static void main(String[] args) {
		Access1 acc1 = new Access1();
		acc1.ptrMember();
		
		// 접근 제한자가 public으로 설정되어 있어 제한없이 사용 가능
		System.out.println("str1 : " + acc1.str1);
		// 접근 제한자가 default로 설정되어 있어 동일한 패키지 내에서는 직접 호출 가능
		System.out.println("str2 : " + acc1.str2);
		// str3은 접근 제한자가 private으로 설정되어 있어 외부에서 직접 호출하지 못함.
//		System.out.println("str3 : " + acc1.str3);

	}

}
