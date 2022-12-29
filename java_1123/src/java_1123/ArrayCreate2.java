package java_1123;

public class ArrayCreate2 {

	public static void main(String[] args) {
//		문제 1) 이름이 numbers이고, 크기가 10인 int 타입 배열을 1개 선언하고 원하는 숫자를 10개 입력한 후 출력.
//		배열을 선언과 동시에 데이터를 입력
		int numbers[] = {0,1,2,3,4,5,6,7,8,9}; 
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println(numbers[6]);
		System.out.println(numbers[7]);
		System.out.println(numbers[8]);
		System.out.println(numbers[9]);
		
		
//		문제2) 이름이 numArr이고, 크기가 5인 int타입의 배열을 1개 선언하고, 원하는 숫자를 입력 후 반복문을 사용해 모든 내용 출력. 
//		배열을 선언과 동시에 크기를 지정, 데이터 따로 입력.
		
		System.out.println("======================================");
		
		int numArr[] = new int[5];
		
		numArr[0] = 2;
		numArr[1] = 4;
		numArr[2] = 6;
		numArr[3] = 8;
		numArr[4] = 10;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("numArr[" + i + "] = " + numArr[i]);
		}
		
		System.out.println("======================================");
		
		int numArr2[] = new int[5];
		
		System.out.println(numArr2[0]);
		
		String strArr[] = new String[5];
		System.out.println(strArr[0]); // String으로 만들고 아무런 데이터가 없으면 null이 뜬다.
		
//		배열의 길이 : 배열이름.length;
		
		System.out.println("======================================");
		
		int size = numArr2.length;
		System.out.println(size);
		System.out.println(numbers.length + "\n");
		
		System.out.println("======================================");

		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
