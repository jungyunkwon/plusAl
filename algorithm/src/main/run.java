package main;

import java.util.Arrays;
import java.util.Scanner;

import ch03.study02;
import ch03.study03;

public class run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binSearchTester();
	}
	public static void searchIdxMain() {
		Scanner scan= new Scanner(System.in);
		System.out.println("��ڼ� : ");
		int n=scan.nextInt();
		int[] a = new int[n];
		
		System.out.println("�迭 �Է�: ");
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
			System.out.println("��Ұ� �����ϴ�. ����� :"+result);
		}else {
			System.out.println("��Ұ� �ֽ��ϴ�.����� : "+result);
		}
	}
	public static void binSearchMain() {
		Scanner scan= new Scanner(System.in);
		System.out.println("��ڼ� : ");
		int n=scan.nextInt();
		int[] a = new int[n];
		
		System.out.println("�迭 �Է�: ");
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
			System.out.println("��Ұ� �����ϴ�. ����� :"+result);
		}else {
			System.out.println("��Ұ� �ֽ��ϴ�.����� : "+result);
		}
	}
	public static void binSearchXMain() {
		Scanner scan= new Scanner(System.in);
		System.out.println("��ڼ� : ");
		int n=scan.nextInt();
		int[] a = new int[n];
		
		System.out.println("�迭 �Է�: ");
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
			System.out.println("��Ұ� �����ϴ�. ����� :"+result);
		}else {
			System.out.println("��Ұ� �ֽ��ϴ�.����� : "+result);
		}
	}
	public static void binSearchTester() {
		Scanner scan= new Scanner(System.in);
		System.out.println("��ڼ� : ");
		int n=scan.nextInt();
		int[] a = new int[n];
		
		System.out.println("�迭 �Է�: ");
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
			System.out.println("�˻��� �����߽��ϴ�. ���� ����Ʈ :"+idx);
		}else {
			System.out.println("��Ұ� �ֽ��ϴ�. ���� ����Ʈ : "+idx);
		}
	}

}
