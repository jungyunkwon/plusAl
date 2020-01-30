package Chp03;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);

		System.out.println("요솟수:");
		int num = stdIn.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.println("X[0]:");
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "]:");
				x[i] = stdIn.nextInt();
			} while (x[i - 1] > x[i]);
		}

		System.out.println("검색할 값 : ");
		int ky = stdIn.nextInt();

		int idx = Arrays.binarySearch(x, ky);

		if (idx < 0) {
			System.out.println("없는 요소입니다.");
			System.out.printf("삽입 포인트 : ");
			System.out.println(InsertPoint(x, ky, num));
		} else {
			System.out.println("[x" + idx + "]에 있습니다.");
		}
	}

	private static int InsertPoint(int[] x, int ky, int num) {
		// TODO Auto-generated method stub

		int ip = 0;
		// ky가 클때
		if (ky > x[num - 1]) {
			ip = -num;
			return ip;
		}

		// 검색실패
		for (int i = 1; i < num; i++) {
			if (x[i - 1] < ky && ky < x[i]) {
				ip = -(i + 1);
				return ip;
			}
		}
		return ip;

	}

}