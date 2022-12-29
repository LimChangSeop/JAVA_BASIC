package java_1205;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델 명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.maxSpeed);
		System.out.println("현재 속도 : " + myCar.speed);
		
		myCar.speed = 50;
		System.out.println("현재 속도 : " + myCar.speed );
		
		//yourCar는 필드는 Car.java와 동일하게 가지고 있지만, 그 안에 데이터는 다름. 밑에 새로 생성해줌.
		
		Car yourCar = new Car();
		yourCar.model = "쏘렌토";
		yourCar.color = "은색";
		yourCar.speed = 100;
		
		System.out.println("제작 회사 : " + yourCar.company);
		System.out.println("모델 명 : " + yourCar.model);
		System.out.println("색상 : " + yourCar.color);
		System.out.println("최고 속도 : " + yourCar.maxSpeed);
		System.out.println("현재 속도 : " + yourCar.speed);
		
	}

}
