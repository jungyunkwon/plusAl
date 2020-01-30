package Chp03;

import java.util.Scanner;




public class Q2 {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int[] x = {6,4,3,2,1,9,8};
		System.out.println("검색할 숫자:");
		int key = sc.nextInt();
		
		int index=seqSearch(x,key);
		
		if(index<0) System.out.println("검색할 숫자가 존재하지 않습니다.");
	
		if(index>0) {
			//도표출력 
			printGrid(x,index,key);
		
		}

		
	}

	private static void printGrid(int[] x, int index,int key) {
	// TODO Auto-generated method stub
		
		System.out.print("   ");
		
		for(int i=0;i<x.length;i++) {
			System.out.print("  "+i);
			}
		
		System.out.println();
		System.out.println("--|-------------------------");
		
		for(int j=0;j<=index;j++) {
			System.out.print("  |");
				for(int i=0;i<j;i++) {
					System.out.print("   ");
				}
			System.out.println("  *");
			System.out.println("  |");
			
			System.out.print(j+" |");
				for(int k=0;k<x.length;k++) {
					
					System.out.print("  "+x[k]);//배열 요소 출력 
				}
			System.out.println();
		}
		
		System.out.println();
		System.out.println(key+"는 x["+index+"]에 있습니다");
	
}

	//key 인덱스 
	private static int seqSearch(int[] x, int key) {
		for(int i=0;i<x.length;i++) {
			if(x[i]==key)
				return i;
		}
		return -1;
	}



}


