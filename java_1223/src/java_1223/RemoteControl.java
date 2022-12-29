package java_1223;

// 인터페이스 선언
public interface RemoteControl {
//	인터페이스의 멤버
//	정적멤버 (상수, 정적메소드)
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
//	추상 메소드
	void turnOn(); // public abstract 를 생략해도 자동으로 추가
	public void turnOff();
	public abstract void setVolume(int volume);
//	디폴트 메소드
	

}
