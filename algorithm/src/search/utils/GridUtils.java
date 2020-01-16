package search.utils;

import java.util.Arrays;

public class GridUtils {
    public void printGrid(int[] arr , int num, int key) {
        // 배열내 숫자를 제외한 문자를 공백으로 치환
        String str = Arrays.toString(arr).replaceAll("[^0-9 ]","  ");

        System.out.print("\t|");

        // 탭 후
        for (int n1 = 0; n1 < num; n1++) {
            System.out.print("\t"+n1);
        }

        System.out.println();
        System.out.print("----+");

        // 배열 인덱스가 증가함에 따라 구분선 길이를 늘림
        for (int n2 = 0; n2 < num; n2++){
            System.out.print("-----");
        }

        System.out.println();

        // 현재 판단중인 배열 인덱스 위에 별 표시
        // 배열 값에서 찾고자 하는 값을 발견시 검색 종료.
        for (int n3 = 0; n3 < num; n3++) {
            System.out.print("\t|\t");
            for (int n4 = 0; n4 < n3; n4++) System.out.print("\t");
            System.out.println("*");
            System.out.print("   " + n3 + "| ");
            System.out.println(str);
            if (arr[n3] == key) break;
            System.out.println("\t|");

        }
    }
}
