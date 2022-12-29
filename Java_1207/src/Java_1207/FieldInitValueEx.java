package Java_1207;

public class FieldInitValueEx {

	public static void main(String[] args) {
		// fiv = FieldInitValue 클래스 타입의 변수, ()는  생성자. 
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField : " + fiv.byteField);
		System.out.println("shortField : " + fiv.shortField);
		System.out.println("intField : " + fiv.intField);
		System.out.println("longField : " + fiv.longField);
		
		System.out.println("charField : " + fiv.charField); // 안뜨는 게 맞음
		System.out.println("booleanField : " + fiv.booleanField);
		
		System.out.println("floatField : " + fiv.floatField);
		System.out.println("doubleField : " + fiv.doubleField);
		
		System.out.println("arrField : " + fiv.arrField);
		System.out.println("stringField : " + fiv.stringField);
		
		// 필드(객체의 멤버 변수)는 초기값이 존재하지만 일반 변수는 초기값이 없음.
		// 변수의 초기화 : 변수를 사용하기 위해서 선언 후 해당 변수에 데이터를 처음 저장하는 행위
		// 즉 필드는 초기값이 존재하므로 초기화를 하지 않아도 사용이 가능하다.
		
		System.out.println("===== 변수 초기화 =====");
		
		byte byteValue = 0;
		short shortValue = 0;
		int intValue = 0;
		long longValue = 0L; // long이라서 L을 써줌
		char charValue = '\0'; // 빈문자
		
		boolean booleanValue = false; 
		
		float floatValue = 0.0F; // float라서 F를 넣어줌
		double doubleValue = 0.0;
		
		int[] arrValue = null;
		String stringValue = ""; // 빈문자
		
		// 일반적인 변수는 초기화를 하지 않으면 사용할 수 없다.
		
		System.out.println("byteValue : " + byteValue);
		System.out.println("shortField : " + shortValue);
		System.out.println("intField : " + intValue);
		System.out.println("longField : " + longValue);
		
		System.out.println("charField : " + charValue);
		System.out.println("booleanField : " + booleanValue);
		
		System.out.println("floatField : " + floatValue);
		System.out.println("doubleField : " + doubleValue);
		
		System.out.println("arrField : " + arrValue);
		System.out.println("stringField : " + stringValue);
		
	}

}
