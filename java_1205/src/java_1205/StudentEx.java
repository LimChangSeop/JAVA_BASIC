package java_1205;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		System.out.println("Student 클래스 타입의 변수 stu1이  Student 객체를 참조함");
		System.out.println(std1); // 해당 객체의 힙메모리에 만들어진 주소가 출력된다
		
		Student std2 = new Student();
		System.out.println("Student 클래스 타입의 변수 std2가 Student객체를 참조함");
		System.out.println(std2); // 해당 객체의 힙메모리에 만들어진 주소가 출력된다
	}

}
 