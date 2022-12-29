package Java_1216;

public class SmartTv extends Tv {

	public String url = "www.naver.com";
	public String userId;
	
	public void interNetOn() {
		System.out.println("인터넷을 켭니다.");
	}
	public void interNetOff() {
		System.out.println("인터넷을 끕니다.");
	}
	public void urlChnage() {
		System.out.println("url을 바꿉니다.");
	}
}
