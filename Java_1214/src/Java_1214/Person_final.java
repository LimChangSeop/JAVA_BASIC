package Java_1214;

public class Person_final {
	
	// final 키워드를 사용한 필드는 읽기 전용
	// 단 한번만 데이터 저장이 가능.
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person_final(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
