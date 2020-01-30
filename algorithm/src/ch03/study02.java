package ch03;

public class study02 {
	static int seqSearchSen(int[] a, int n, int key) {
		a[n]=key;
		int i;
		for(i=0; i<n;i++) {
			if(a[i]==key) {
				break;
			}
		}
		return i==n ? -1 : i;
		
	}
	public static int searchIdx(int[] a, int n, int key, int[] idx) {
		if(a.length==0) {
			return -1;
		}
		int i;
		int idxN=0;
		for(i=0; i<n;i++) {
			if(a[i]==key) {
                 idx[idxN]=i;
                 idxN++;
			}
		}
		return idx.length==0 ? -1 : key;
	}
}
