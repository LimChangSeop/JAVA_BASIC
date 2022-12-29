package java_1116;

public class VariableEx {

	public static void main(String[] args) {
		
		int a; // 변수
		int b = 10;
		
		a = 5; // 변수 a를 초기화 함

		System.out.println(a);
		System.out.println(b);
		// 변수 사용 방법
		// 변수명; 변수에 저장되어 있는 데이터를 가져오기
		// 변수명 = 데이터; 기존 변수에 새로운 데이터를 저장.
		
		a = 100;
		b = 200;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = a + b;
		
		System.out.println(c);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("자동 타입 변환 시작!");
		// 자동 타입 변환 (크기가 작은 데이터 타입에서 크기가 큰 데이터 타입으로 변환되는 것
		// Java 컴파일러가 자동 변환
		// java 기본 데이터 타입은 정수 : int, 실수 : double임.
		// 데이터 타입 상관없이 정수 연산 시 기본 데이터 타입인 int형으로 자동 타입 변환 후 연산이 실행 됨.
		byte bValue1 = 50;
		byte bValue2 = 100;
		byte bResult = (byte)(bValue1 + bValue2);
// byte는 -128~127이어서 127이상으로 넘어가면 150이 아닌 127을 빼게되면 반대로 넘어가서 -128부터 시작되어서 -106이 됨.
// 1에 28을 주고 실행시키면 -128이 나오게 된다.
		int iResult = 0;
		
		System.out.println(bValue1);
		System.out.println(bValue2);
		System.out.println(bResult);
		
		iResult = bValue1 + bValue2; // 자동 타입 변환 발생
		System.out.println(iResult);
		
		System.out.println("-------------------------------------------------------");
		byte bValue = 10;
		int iValue = bValue;
		System.out.println(iValue);
		
		char charValue = 'A';
		iValue = charValue;
		System.out.println(iValue);
		
		iValue = 500;
		long lValue = iValue;
		System.out.println(lValue);
		
		iValue = 500;
		double dValue = iValue;
		System.out.println(dValue);
		
		
		// 강제 타입 변환(크기가 큰 데이터 -> 작은 데이터 타입)
		// Java 컴파일러가 자동 변환 X.(사용자가 직접 변환 진행해야 함.)
		
		System.out.println("-------------------------------------------------------");
		iValue = 44032;
		// 강제 타입 변환 방법 : 작은 타입 변수 = (작은 타입) 큰 타입의 데이터
		charValue = (char)iValue; // char 타입으로 강제 형변환 명시.
		System.out.println(charValue);
		
		lValue = 500;
		iValue = (int)lValue;
		System.out.println(iValue);
		
		dValue = 3.14;
		iValue = (int)dValue;
		System.out.println(iValue);
		
		System.out.println("-------------------------------------------------------");
		
		double dResult = 0.0;
		int iValue1 = 10;
		double dValue1 = 5.5;
		
		// iValue1이 더 큰 타입인 double 타입으로 자동 타입 변환을 진행하고 연산 함.
		dResult = iValue1 + dValue1;
		System.out.println(dResult);
		
	}
 
}