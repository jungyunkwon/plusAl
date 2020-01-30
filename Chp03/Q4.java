package Chp03;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("요솟값을 입력하세요.");
		int num = sc.nextInt();

		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");
		System.out.println("x[0] :");
		x[0] = sc.nextInt();

		for (int i = 1; i < x.length; i++) {
			do {
				System.out.println("x[" + i + "] :");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.println("검색할 숫자");
		int key = sc.nextInt();
		////////////////////////////////
		printArrow(x, key);

	}

	private static void printArrow(int[] x, int key) {
		// TODO Auto-generated method stub
		// 첫번째 줄 출력 
		System.out.printf("  |  ");
		for (int i = 0; i < x.length; i++) {
			System.out.printf(i + "  ");
		}
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			System.out.printf("----");
		}
		System.out.println();

		int l = 0;
		int r = x.length;
		int cnt = 0;
		int result;

		do {

			cnt = (l + r) / 2;

			System.out.printf(" " + cnt + "|  ");

			for (int i = 0; i < l; i++) {
				System.out.printf(" ");
			}
			System.out.printf("<-");

			for (int i = l; i < cnt; i++) {
				System.out.printf(" ");
			}
			System.out.printf(" *");

			for (int i = cnt; i < r; i++) {
				System.out.printf(" ");
			}
			System.out.printf("->");

			System.out.println();

			//결과 출력 
			if (x[cnt] == key) {

				result = key;

				System.out.print("  |  ");
				///////////
				System.out.println();
				System.out.print("  |  ");
				for (int i = 0; i < x.length; i++) {
					System.out.print(x[i] + "  ");

				}
				System.out.println();
				System.out.println();
				System.out.println("[" + cnt + "]=" + result);
				break;
			}

			if (x[cnt] > key) {
				r = cnt - 1;
			}

			if (x[cnt] < key) {
				l = cnt + 1;
			}

			System.out.print("  |  ");
			///////////
			System.out.println();
			System.out.print("  |  ");
			for (int i = 0; i < x.length; i++) {
				System.out.print(x[i] + "  ");

			}
			System.out.println();
		} while (l <= r);
	}

}
