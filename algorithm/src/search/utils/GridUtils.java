package search.utils;

import java.util.Arrays;

public class GridUtils {
    public void printGrid(int[] arr , int num, int key) {
        String str = Arrays.toString(arr).replaceAll("[^0-9 ]","  ");

        System.out.print("\t|");

        for (int n1 = 0; n1 < num; n1++) {
            System.out.print("\t"+n1);
        }

        System.out.println();
        System.out.print("----+");

        for (int n2 = 0; n2 < num; n2++){
            System.out.print("-----");
        }

        System.out.println();

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
