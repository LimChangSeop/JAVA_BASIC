package Java_1216;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("자바폰", "검정", 10);
		
		// CellPhone 클래스에서 상속받은 필드 사용
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		// DmbCellPhone 클래스 자체에 존재하는 필드 사용
		System.out.println("채널 : " + dmb.channel);
		
		// CellPhone 클래스에서 상속받은 메서드 실행
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("Hello?");
		dmb.receiveVoice("Hi, I'm nemnem");
		dmb.sendVoice("Hi, How's it going?");
		dmb.hangUp();
		
		// DmbCellPhone 클래스가 자체적으로 존재하는 메서드 실행
		dmb.turnOnDmb();
		dmb.changeChannelDmb(13);
		dmb.turnOffDmb();
		dmb.powerOff();
		
		// 문제 1) SmartTv를 만들기 위해 Game 실행 메서드와, InterNet 메서드를 생성하고
		// TV의 기본 기능을 구현하기 위해서 Tv 클래스를 생성해 전체 기능을 가지고 있는 
		// SmartTv 클래스를 만들어 출력.
		
		// 조건) Tv클래스 : 필드 - channel, volumn, state, 
		//				 메서드 - power on/off, Channel up/down volumn up/down
		
		// 스마트 TV클래스 : 필드 - url, userId, 메서드 - internetOn/Off, urlChange,
		// gameStart/End/Play

	}

}
