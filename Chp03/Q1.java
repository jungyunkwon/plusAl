package Chp03;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num =sc.nextInt();
		
		int[] x = new int[num+1];
		int key=0;
		
		for(int i=0;i<num;i++){
			System.out.println("x"+"["+i+"]"+":");
			x[i]=sc.nextInt();
		}
		
		System.out.println("검색할 값:");
		key =sc.nextInt();
		
		int result = seqSearch(num,x,key);
		
		if(result == -1) {
			System.out.println("없음");
		}
		else{
			System.out.println(key+"은 x["+result+"]에 있습니다.");
		}
		
		
	}

	
	private static int seqSearch(int num, int[] x, int key ) {
		// TODO Auto-generated method stub
		x[num+1]=key;
		
		for(int i=0;i<(num+1);i++) {
			if(key==x[i])
				return i;
		}
		return -1;
	}
}


