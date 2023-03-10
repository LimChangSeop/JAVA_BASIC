package java_1121;

import java.time.DayOfWeek;
// Java 8 이후 버전에서 시간 관련 클래스.
import java.time.LocalDateTime;

public class SwitchExample {

	public static void main(String[] args) {
		
		// Math.random() : 0.0 ~ 0.9까지 임의의 숫자를 출력하는 함수, double로 출력
		int num = (int)(Math.random() * 6) + 1;
		
		// switch : if문으로 대체 가능, 조건값에 해당하는 데이터가 있는 case문을 실행하는 조건문.
		// 다른점 : if문은 조건식이 범위 형태로 구성되어 있음. switch ~ case문은 고정된 값을 사용.
		switch(num){
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		
		System.out.println("-------------------------------------------------");
		
		// 현재 시간을 가져옴. 지정된 날짜와 시간을 통해서 LocalDateTime 클래스의 객체를 생성
		LocalDateTime date = LocalDateTime.now();
		// LocalDateTime date = LocalDateTime.of(2022, 11, 20, 20, 8, 00);
		// 위처럼 쓸 수도 있음. 
		
		// 한주의 정보를 숫자로 가지고 있는 클래스
		DayOfWeek weekDay = date.getDayOfWeek();
		// 현재 시간을 기준으로 한주의 무슨 요일인지 숫자로 출력
		int day = weekDay.getValue();
		System.out.println(weekDay.getValue()); // 숫자 찍어 내보냄.
		
		switch (day){
		case 1:
			System.out.println("오늘은 월요일 입니다.");
			break;
		case 2:
			System.out.println("오늘은 화요일 입니다.");
			break;
		case 3:
			System.out.println("오늘은 수요일 입니다.");
			break;
		case 4:
			System.out.println("오늘은 목요일 입니다.");
			break;
		case 5:
			System.out.println("오늘은 금요일 입니다.");
			break;
		default:
			System.out.println("주말입니다.");
			break;
		}
		
		System.out.println(date);
		System.out.println(weekDay);
		
		System.out.println("-------------------------------------------------");
		
		if(day == 1) {
			System.out.println("월요일입니다.");
		}
		else if(day == 2) {
			System.out.println("화요일 입니다.");
		}
		else if(day == 3) {
			System.out.println("수요일 입니다.");
		}
		else if(day == 4) {
			System.out.println("목요일 입니다.");
		}
		else if(day == 5) {
			System.out.println("금요일 입니다.");
		}
		else {
			System.out.println("주말입니다.");
		}

	}

}
