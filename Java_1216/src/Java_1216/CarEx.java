package Java_1216;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();

		// 0보다 작기 때문에 다시 0으로 해줌
		car.setSpeed(-50);
		System.out.println("내 차의 현재 속도 : " + car.getSpeed());
		
		// 정상적인 값이라 60
		car.setSpeed(60);
		System.out.println("내 차의 현재 속도 : " + car.getSpeed());
		
		// boolean의 기본값은 false이니 setStop 값을 들고오게 되는데
		// setStop값은 0이므로 아래 출력이 0이 나오게 된다.
		if(car.isStop() == false) {
			car.setStop(true);
		}
		
		System.out.println("내 차의 현재 속도 : " + car.getSpeed());
	}

}
