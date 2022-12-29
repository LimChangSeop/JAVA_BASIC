package java_1123;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "넴넴";
		String str2 = "넴넴ㄴ";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같음."); //
		}
		else {
			System.out.println("str1과 str2는 참조가 다름.");
		}
		
		if(str1.equals(str2)) { // equals는 문자열을 알아보기 위해 사용.
			System.out.println("str1과 str2는 문자열이 같음."); //
		}
		else {
			System.out.println("str1과 str2는 문자열이 다름.");
		}
		
		System.out.println("======================================================");

		String str3 = new String("넴넴");
		String str4 = new String("넴넴");
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 참조가 같음.");
		}
		else {
			System.out.println("str3과 str4는 참조가 다름."); //
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4은 문자열이 같음."); //
		}
		else {
			System.out.println("str3과 str4는 문자열이 다름.");
		}
	}

}
