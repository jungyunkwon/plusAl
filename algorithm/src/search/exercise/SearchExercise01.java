package search.exercise;

import java.util.Scanner;

public class SearchExercise01 {

    // 문제 Q1 seqSearchSen 메서드를 while 문이 아니라
    // for 문을 사용하여 프로 그램을 작성하시오.
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;

        // while 문에서 for 무한 루프로 변경
        for (;;) {
            if (a[i] == key) break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = sc.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1) {
            System.out.print("그 값의 요소 값은 없습니다.");
        }else {
            System.out.print(ky+"은(는) x["+ idx +"]에 있습니다.");
        }

    }
}
