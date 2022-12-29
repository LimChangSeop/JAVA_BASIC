package Java_1216;

public class Tv {
	public int Channel;
	public int Volumn;
	public boolean State;

	public void powerOn() {
		System.out.println("Tv를 켭니다.");
	}
	public void powerOff() {
		System.out.println("Tv를 끕니다.");
	}
	public void ChannelUp() {
		System.out.println("1채널을 올립니다.");
	}
	public void ChannelDown() {
		System.out.println("1채널을 내립니다.");
	}
	public void VolumnUp() {
		System.out.println("음량을 1 올립니다.");
	}
	public void VolumnDown() {
		System.out.println("음량을 1 내립니다.");
	}
	public void gameStart() {
		System.out.println("게임을 시작합니다.");
	}
	public void gamePlay() {
		System.out.println("게임을 하고 있지요~");
	}
	public void gameEnd() {
		System.out.println("게임을 끕니다.");
	}
	
}

