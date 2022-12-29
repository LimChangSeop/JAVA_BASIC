package Java_1214;

public class SingletonEx {

	public static void main(String[] args) {
		// 생성자를 사용할 수 없어 new 키워드로 객체를 생성X
//		Singleton obj1 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("두 객체가 같음.");
		} else {
			System.out.println("두 객체가 다름.");
		}
		
		Test t1 = new Test();
		Test t2 = new Test();
		
		if (t1 == t2) {
			System.out.println("두 객체가 같음.");
		} else {
			System.out.println("두 객체가 다름.");
		}
	}

}
