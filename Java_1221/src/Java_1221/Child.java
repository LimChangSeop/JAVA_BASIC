package Java_1221;

public class Child extends Parent{
	@Override // 상속받은 메서드의 내용을 수정해 사용
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
}
