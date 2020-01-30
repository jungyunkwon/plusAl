package ch03;

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
	
	
}
