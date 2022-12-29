package java_1223;

// 추상 클래스 선언
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉼니다.");
	}
	
//	추상 메서드
//	추상 메서드는 실행 소스코드가 있는 코드 블럭이 없음
	public abstract void sound();
}
