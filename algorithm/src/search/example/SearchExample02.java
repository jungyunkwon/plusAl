package search.example;

import search.utils.GridUtils;

import java.util.Scanner;

// 선형 검색 (보초법)
public class SearchExample02 {
   // 요소수가 n인 배열 a에서 key 와 같은 요소를 보초법으로 선형 검색한다.
    static int seqSearch(int[] a , int n, int key) {
        int i = 0;

        a[n] = key; // 보초를 추가

        while (true) {
            if (a[i] == key)
                break; // 검색 성공

            i++;
        }
        return i == n ? -1 : i;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num + 1]; // 보초를 추가하므로 num + 1

        for (int i = 0; i < num; i++) {
            System.out.print("x["+ i +"]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: "); // 키값 입력
        int ky = sc.nextInt();
        int idx = seqSearch(x, num, ky); // 배열 x에서 키값이 ky인 요소 검색

        if (idx == -1) {
            System.out.print("입력하신 값의 요소가 없습니다.");
        }else {
            System.out.print(ky+"은(는) x["+ idx +"]에 있습니다.");
        }
    }
}
