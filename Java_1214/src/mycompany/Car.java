package mycompany;

import hankook.SnowTire;
// 동일한 이름의 클래스를 import할 경우 클래스의 이름이 중복되어 어떠한 클래스를 사용하는지 알 수 없어 오류 발생.
// 동일한 클래스명을 가지고 있을 경우 하나만 import하고, 나머지는 전체 패키지명을 다 입력함.
import hankook.Tire;
import hyundai.Engine;
import kumho.BigwidthTire;
// import kumho.Tire; // 이름 중복.

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigwidthTire tire2 = new BigwidthTire();
	Tire tire3 = new Tire();
	kumho.Tire tire4 = new kumho.Tire();
}
