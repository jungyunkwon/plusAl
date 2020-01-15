package search;

import java.util.Scanner;

public class SearchAlgorithm01 {
    // 선형검색(liner search) or 순차검색(sequential search)
    static int seqSearch(int[] a , int n, int key) {
        int i = 0;
        while (true) {
            if (i == n)   return -1; // 검색 실패
            if (a[i] ==key)   return i; // 검색 성공
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수:");
        int num = sc.nextInt();
        int[] x = new int[num]; // 요소수가 입력받은 값인 배열

        for (int i = 0; i < num; i++) {
            System.out.println("x["+ i +"]:");
            x[i] = sc.nextInt();
        }

        System.out.println("검색할 값:"); // 키값 입력
        int ky = sc.nextInt();
        int idx = seqSearch(x, num, ky); // 배열 x에서 키값이 ky인 요소 검색

        if (idx == -1) {
            System.out.println("입력하신 값의 요소가 없습니다.");
        }else {
            System.out.println(ky+"은(는) x["+ idx +"]에 있습니다.");
        }

    }
}
