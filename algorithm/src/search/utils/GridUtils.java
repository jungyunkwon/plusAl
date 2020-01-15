package search.utils;

import java.util.Arrays;

public class GridUtils {
    public void printGrid(int[] a , int n, int key) {
        String str = Arrays.toString(a).replaceAll("[^0-9 ]","  ");

        System.out.print("\t|");

        for (int n1 = 0; n1 < n; n1++) {
            System.out.print("\t"+n1);
        }

        System.out.println();
        System.out.print("----+");

        for (int n2 = 0; n2 < n; n2++){
            System.out.print("-----");
        }

        System.out.println();

        for (int n3 = 0; n3 < n; n3++) {
            System.out.print("\t|\t");
            for (int n4 = 0; n4 < n3; n4++) System.out.print("\t");
            System.out.println("*");
            System.out.print("   " + n3 + "| ");
            System.out.println(str);
            if (a[n3] == key) break;
            System.out.println("\t|");

        }
    }
}
