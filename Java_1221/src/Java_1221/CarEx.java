package Java_1221;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0; i <= 6; i++) {
			int problemLocation = car.run();
			
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation - 1].location + "HankookTire로 교체");
				car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation - 1].location, 15);
			}
			
//			switch(problemLocation) {
//			case 1:
//				System.out.println("앞 왼쪽 HankookTire로 교체");
//				car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
//				break;
//				
//			case 2:
//				System.out.println("앞 오른쪽 KumhoTire로 교체");
//				car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
//				break;
//				
//			case 3:
//				System.out.println("뒤 왼쪽 HankookTire로 교체");
//				car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
//				break;
//				
//			case 4:
//				System.out.println("뒤 오른쪽 KumhoTire로 교체");
//				car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
//				break;
//			}
			System.out.println("===================================");
		}

	}

}
