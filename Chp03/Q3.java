package Chp03;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("요솟값:");
		int n =sc.nextInt();
		
		int[] a = new int[n];
		int[] idx = new int[n];//결과값 저장 
		
		for(int i=0;i<a.length;i++) {
			System.out.println("x["+i+"]:");
			a[i]=sc.nextInt();
		}
		
		System.out.println("key 값을 입력하세요.");
		int key = sc.nextInt();
		
		int result = searchIdx(a,n,key,idx);
		System.out.println("결과값 : "+result);
		
	}

	private static int searchIdx(int[] a, int n, int key, int[] idx) {
		// TODO Auto-generated method stub
		int idx_n=0;
		int result=0;
		
		
		
		
		for(int i=0;i<n;i++) {
			if(a[i]==key){
				idx[idx_n]=i;
				idx_n++;
				result++;	
			}
		}
		
		
		System.out.printf("idx = {");
		for(int i=0;i<idx_n;i++) {
			System.out.printf(i+" ");	
		}
		System.out.printf("}");
		System.out.println();
		return result;
	}

}
