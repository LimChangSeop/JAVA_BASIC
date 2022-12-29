package Java_1214;

public class Singleton {
	
	// 해당 클래스의 객체를 클래스 내부에서 생성.
	// 생성된 객체에 private 접근제한자를 사용해 외부에서 사용할 수 없도록 막음.
	// static 키워드를 사용해 클래스의 멤버로 등록, 데이터를 공유.
	
	private static Singleton singleton = new Singleton();
	
	// 생성자에 접근제한자를 private를 사용해 외부에서 접근할 수 없도록 막음
	// 생성자를 호출할 수 없기 때문에 객체 생성 X
	private Singleton() {
		
	}
	
	// 정적 멤버로 메서드를 생성
	// 반환 타입을 해당 클래스 타입으로 설정해 내부에서 생성된 객체를 외부로 전달 가능.
	// 정적 멤버이므로 정적 멤버인 singleton 객체를 새로 생성하지 않고 기존에 생성된 singleton 객체를 외부로 전달함.
	static Singleton getInstance() {
		return singleton;
	}
}
