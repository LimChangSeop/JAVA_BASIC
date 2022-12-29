package Java_1214;

public class Person_finalEx {

	public static void main(String[] args) {
		
		Person_final p1 = new Person_final("123456-1234567", "넴넴");
		System.out.println("국적 : " + p1.nation);
		System.out.println("주민번호 : " + p1.ssn);
		System.out.println("이름 : " + p1.name);
		
//		p1.nation = "Argentina";
//		p1.ssn = "189765-8795643";
		p1.name = "넴넴이";
		
		System.out.println("이름 : " + p1.name);

	}

}
