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
	public static void visionSearch() {
		//�������� ���� �� 
		Scanner scan= new Scanner(System.in);
		PhysData[] x= {
			new PhysData("�̳���",162,1.5),
			new PhysData("������",168,0.5),
			new PhysData("������",170,0.7),
			new PhysData("�̵κ�",180,0.8),
			new PhysData("�佺Ʈ",190,0.4),
			new PhysData("�˰�",195,1.2)
		};
		System.out.println("ã�� ���� �÷��� �Է����ּ���.");
		double vision=scan.nextDouble();
		Arrays.sort(x, PhysData.c);
		int idx=Arrays.binarySearch(x, new PhysData("",0,vision), PhysData.c);
		if(idx<0) {
			System.out.println("�˻��� �����߽��ϴ�. ���� ����Ʈ :"+idx);
		}else {
			System.out.println("��Ұ� �ֽ��ϴ�. ���� ����Ʈ : "+idx);
		}
	}

}
