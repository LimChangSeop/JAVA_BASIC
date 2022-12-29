package java_1123;

public class ArrayCreate1Ex {

	public static void main(String[] args) {
//		1. 배열 선언과 동시 데이터 입력
		
		int score1[] = {90, 80, 70, 60, 50};
		
//		2. 배열 변수만 먼저 선언 후 나중에 데이터 입력
		
		int score2[];
		int score2_2[] = null;
		
		score2 = new int[] {10, 20, 30, 40, 50};
		score2_2 = new int [] {60, 70, 80, 90, 100};
		
//		3. 배열 변수 및 크기를 먼저 선언 후 나중에 데이터 입력
		
		int score3[] = new int[5];
		
		score3[0] = 10;
		score3[1] = 20;
		score3[2] = 30;
		score3[3] = 40;
		score3[4] = 50;

//		배열 사용 방법 : 배열명 [index] = 데이터; <- 지정한 인덱스에 데이터 저장
//		배열명[index]; <- 지정된 인덱스에 저장된 데이터 출력.
		
//		배열 사용 시 주의사항
//		1. 배열 선언 시 지정한 크기를 넘어서는 안됨.
//		2. 배열의 index는 0번부터 시작함.
//		3. 배열 사용 시 [] 를 사용.
//		4. 한번 선언된 배열은 크기 변경 못함.
		
		System.out.println(score3[0]);
		System.out.println(score3[1]);
		System.out.println(score3[2]);
		System.out.println(score3[3]);
		System.out.println(score3[4]);
		
		System.out.println(score3[0] + score3[4]);
		System.out.println(score3[1] - score3[3]);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(score3[i]);
		}
		
		System.out.println("============================================");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(score2_2[i]);
		}
		
	}

}
