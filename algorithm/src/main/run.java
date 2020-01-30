package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import ch03.study02;
import ch03.study03;
import ch03.study03.PhysData;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		visionSearch();
	}
	public static void searchIdxMain() {
		Scanner scan= new Scanner(System.in);
		System.out.println("요솟수 : ");
		int n=scan.nextInt();
		int[] a = new int[n];
		
		System.out.println("배열 입력: ");
		System.out.println("a[0] : ");
		a[0]=scan.nextInt();
		for(int i=1;i<n;i++) {
			do {
			System.out.println("a["+i+"] : ");
			a[i]=scan.nextInt();
			}while(a[i]<a[i-1]);
		}
		System.out.println("key : ");
		int key=scan.nextInt();
		int[] idx = new int[n];
		int result=study02.searchIdx(a,n,key,idx);
		if(result==-1) {
			System.out.println("요소가 없습니다. 결과값 :"+result);
		}else {
			System.out.println("요소가 있습니다.결과값 : "+result);
		}
	}
	public static void binSearchMain() {
		Scanner scan= new Scanner(System.in);
		System.out.println("요솟수 : ");
		int n=scan.nextInt();
		int[] a = new int[n];
		
		System.out.println("배열 입력: ");
		System.out.println("a[0] : ");
		a[0]=scan.nextInt();
		for(int i=1;i<n;i++) {
			do {
			System.out.println("a["+i+"] : ");
			a[i]=scan.nextInt();
			}while(a[i]<a[i-1]);
		}
		System.out.println("key : ");
		int key=scan.nextInt();
		int[] idx = new int[n];
		int result=study03.binSearch(a,n,key);
		if(result==-1) {
			System.out.println("요소가 없습니다. 결과값 :"+result);
		}else {
			System.out.println("요소가 있습니다.결과값 : "+result);
		}
	}
	public static void binSearchXMain() {
		Scanner scan= new Scanner(System.in);
		System.out.println("요솟수 : ");
		int n=scan.nextInt();
		int[] a = new int[n];
		
		System.out.println("배열 입력: ");
		System.out.println("a[0] : ");
		a[0]=scan.nextInt();
		for(int i=1;i<n;i++) {
			do {
			System.out.println("a["+i+"] : ");
			a[i]=scan.nextInt();
			}while(a[i]<a[i-1]);
		}
		System.out.println("key : ");
		int key=scan.nextInt();
		int result=study03.binSearchX(a,n,key);
		if(result==-1) {
			System.out.println("요소가 없습니다. 결과값 :"+result);
		}else {
			System.out.println("요소가 있습니다.결과값 : "+result);
		}
	}
	public static void binSearchTester() {
		Scanner scan= new Scanner(System.in);
		System.out.println("요솟수 : ");
		int n=scan.nextInt();
		int[] a = new int[n];
		
		System.out.println("배열 입력: ");
		System.out.println("a[0] : ");
		a[0]=scan.nextInt();
		for(int i=1;i<n;i++) {
			do {
			System.out.println("a["+i+"] : ");
			a[i]=scan.nextInt();
			}while(a[i]<a[i-1]);
		}
		System.out.println("key : ");
		int key=scan.nextInt();
		int idx=Arrays.binarySearch(a, key);
		if(idx<0) {
			idx=(idx+1)*(-1);
			System.out.println("검색에 실패했습니다. 삽입 포인트 :"+idx);
		}else {
			System.out.println("요소가 있습니다. 삽입 포인트 : "+idx);
		}
	}
	public static void visionSearch() {
		//내림차순 정렬 후 
		Scanner scan= new Scanner(System.in);
		PhysData[] x= {
			new PhysData("이나령",162,1.5),
			new PhysData("유지훈",168,0.5),
			new PhysData("권정윤",170,0.7),
			new PhysData("이두부",180,0.8),
			new PhysData("토스트",190,0.4),
			new PhysData("알고리",195,1.2)
		};
		System.out.println("찾고 싶은 시력을 입력해주세요.");
		double vision=scan.nextDouble();
		Arrays.sort(x, PhysData.c);
		int idx=Arrays.binarySearch(x, new PhysData("",0,vision), PhysData.c);
		if(idx<0) {
			System.out.println("검색에 실패했습니다. 삽입 포인트 :"+idx);
		}else {
			System.out.println("요소가 있습니다. 삽입 포인트 : "+idx);
		}
	}

}
