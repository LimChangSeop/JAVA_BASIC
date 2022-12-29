package Java_1207;

public class FieldInitValue {
	// 기본 정수형
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	// 기본 논리형
	char charField;
	boolean booleanField;
	
	// 기본 실수형
	float floatField;
	double doubleField;
	
	// 참조형
	int[] arrField;
	String stringField;
	
	public void test() {
		intField = 10;
		System.out.println(intField);
	}
}
