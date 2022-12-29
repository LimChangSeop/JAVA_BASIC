package Java_1221;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
//		child.method1();
//		child.method2();
//		child.method3();
		
		// Parent 클래스 타입의 변수 parent에 자식 클래스인 child의 객체 대입
		// 부모 클래스 타입의 변수에 저장된 내용이 자식 클래스 타입의 객체이므로 실제 데이터는
		// 자식 클래스 타입의 객체인 child이다. 따라서 출력되는 내용도 child 멤버가 출력이 됩니다
		Parent parent = child;
		
		// 객체 생성 -> 메모리등록 -> 주소 반환
//		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
		// Parent 클래스 타입의 변수 parent에 저장된 내용이 자식 클래스 타입의 객체인 child라고 하더라도
		// Parent 클래스 타입의 변수이기 때문에 사용할 수 있는 멤버는 Parent클래스의 멤버 밖에 사용할 수 없다.
//		parent.method3();

	}

}
