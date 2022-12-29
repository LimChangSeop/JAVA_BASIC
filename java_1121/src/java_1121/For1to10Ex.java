package java_1121;

import java.util.Scanner;

public class For1to10Ex {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + " ");
		}

		// 문제 1) 반복문을 사용해 1 ~ 100까지 출력하는 프로그램 작성
		// 문제 2) 반복문을 사용해 1 ~ 10까지 총합을 구하는 프로그램 작성
		// 총합을 저장할 변수가 1개 필요. (total로 만들자)
		
		// 문제 3) 키보드로 숫자를 하나 입력받아 입력받은 숫자의 구구단을 출력 하세요.
		
		System.out.println("--------------------------------");
		
		int total = 0;
		for (int i = 1; i < 11; i++) {
			total += i;
		}
		System.out.println("합계 : " + total);
		
		System.out.println("--------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		int dan = sc.nextInt();
		System.out.println();
		
		for(int num = dan; num <= dan; num++) {
			for(int j = 1; j <=9; j++) {
				System.out.println(dan + "*" + j +" = "+ dan * j);
			}
			System.out.println();
		}
		
	}

}