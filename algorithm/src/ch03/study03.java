package ch03;

import java.util.Comparator;

public class study03 {

	public static int binSearch(int a[], int n, int key) {
		int start=0;
		int last=n-1;
		
		String s="    | ";
		if(a.length==0) {
			System.out.println("입력된 배열이 없습니다.");
			return -1;
		}
		String arr=" ";
		for(int i=0;i<n;i++) {
			 s+=i+" ";
			 arr+=a[i]+" ";
		}
		System.out.println(s);
		System.out.println("----|---------------------");
		
		do {
			int center=(start+last)/2;
			String st="<-";
			String ls="->";
			String c="+";
			for(int i=1;i<=center;i++) {
					st=st+"  ";
					c=c+"  ";
			}
			System.out.println("    |"+st+c+ls);
			System.out.println("   "+center+"|"+arr);
			if(a[center]==key) {
				return center;
			}else if(a[center]<key) {
				start=center+1;
			}else {
				last=center-1;
			}
		}while(start<=last); 
		return -1;
	}
	public static int binSearchX(int a[], int n, int key) {
		int start=0;
		int last=n-1;
		do {
			int center=(start+last)/2;
			if(a[center]==key) {
				do {
					if(a[center]!=a[center-1]) {
						return center;
					}else {
						center--;
					}
				}
				while(center!=0);
			}else if(a[center]<key) {
				start=center+1;
			}else {
				last=center-1;
			}
		}while(start<=last); 
		return -1;
	}
	public static class PhysData{
		private String name;
		private int height;
		private double vision;
		
		public PhysData(String name,int height,double vision) {
			this.name=name; this.height=height; this.vision=vision;
		}
		
		
		//시력 내림차순
		//틀림
//		public static final Comparator<PhysData> cd= new Comparator<PhyscData>(PhysData cd1,PhysData cd2) {
//			return (cd1.vision<cd2.vision)? 1:(cd2.vision<cd1.vision)? -1:0;
//		};
		
		//맞음
		public static final Comparator<PhysData> c= new VisionOrderComparator();
		private static class VisionOrderComparator implements Comparator<PhysData>{
			public int compare(PhysData d1,PhysData d2) {
				return (d1.vision<d2.vision)? -1:(d1.vision>d2.vision)? 1:0;
			}
		}
		
		
	}
	
	
}
