package ch03;

public class study01 {
	static void q2() {
int arr[]= {6,4,3,2,1,9,8,3};
int key=3;
String starbg=" |*";
String star="\\* ";
System.out.println("    |0 1 2 3 4 5 6");
System.out.println("----|---------------------");
for(int i=0;i<arr.length;i++) {
	//�� ����ֱ�
	starbg=starbg.replaceAll("\\*", "")+star;
	System.out.println("   "+starbg);
	System.out.println("   "+i+"|6 4 3 2 1 9 8");
	//�˻����� ã���ֱ�
	if(arr[i]==key) {
		System.out.println(key+"�� x["+i+"]�� �ֽ��ϴ�.");
			break;
		
	}
}
}
}
